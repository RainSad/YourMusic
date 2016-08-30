package com.core.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.model.User;
import com.core.service.UserSer;

/**
 * 主页 进入主页
 *
 * @author 孙文祥
 * @date 2016年8月29日
 *
 */
@Controller
public class ToIndex {
	@Autowired
	private UserSer userSer;

	@RequestMapping("/shouye.shtml")
	public String toIndex(ModelMap model) {

		User user = userSer.selectByPrimaryKey(1);
		model.addAttribute("info", user);

		return "shouye";
	}

	//歌曲搜索
	String httpUrl1 = "http://apis.baidu.com/geekery/music/query";
	String httpArg1 = "s='婴儿'&size=10&page=1";
	//获取播放信息
	String httpUrl2 = "http://apis.baidu.com/geekery/music/playinfo";
	String httpArg2 = "hash=c6c7f19f335fe1d906391abe6fb6e7ae";
	//获取歌手信息
	String httpUrl3 = "http://apis.baidu.com/geekery/music/singer";
	String httpArg3 = "name=张宇";
	//获取歌曲歌词
	String httpUrl4 = "http://apis.baidu.com/geekery/music/krc";
	String httpArg4 = "name=";
	String jsonResult1 = request(httpUrl1, httpArg1);
	String jsonResult2 = request(httpUrl2, httpArg2);
	String jsonResult3 = request(httpUrl3, httpArg3);
	String jsonResult4 = request(httpUrl4, httpArg4);

	@Test
	public void test() {
		//System.out.println(jsonResult1);
		System.out.println(jsonResult2);
		//System.out.println(jsonResult3);
		//System.out.println(jsonResult4);
	}

	/**
	 * @param urlAll
	 *            :请求接口
	 * @param httpArg
	 *            :参数
	 * @return 返回结果
	 */
	public static String request(String httpUrl, String httpArg) {
		BufferedReader reader = null;
		String result = null;
		StringBuffer sbf = new StringBuffer();
		httpUrl = httpUrl + "?" + httpArg;

		try {
			URL url = new URL(httpUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			// 填入apikey到HTTP header
			connection.setRequestProperty("apikey", "0cc987324b459a122bce36bc9e9ae438");
			connection.connect();
			InputStream is = connection.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String strRead = null;
			while ((strRead = reader.readLine()) != null) {
				sbf.append(strRead);
				sbf.append("\r\n");
			}
			reader.close();
			result = sbf.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
