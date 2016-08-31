package com.core.upload;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.common.constant.Constant;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/**
 * 歌曲搜索信息上传到个人数据库
 *
 * @author 孙文祥
 * @date 2016年8月31日
 *
 */
public class UpLoad {

	/**
	 * 上传歌曲到服务器
	 * @param url 歌曲播放地址
	 * @param fileName 歌曲名称
	 *
	 * @author 孙文祥
	 */
	public void upLoadToService(String url, String fileName) {
		try {
			URL ss = new URL(url);
			HttpURLConnection urlc = (HttpURLConnection) ss.openConnection();
			urlc.setDoInput(true);// 设置是否要从 URL 连接读取数据,默认为true
			urlc.connect();
			InputStream bufin = urlc.getInputStream();
			ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
			int len = bufin.available();
			byte[] b = new byte[len];
			int rc = 0;
			while ((rc = bufin.read(b, 0, len)) > 0) {
				swapStream.write(b, 0, rc);
			}
			byte[] in2b = swapStream.toByteArray();
			// 实例化Jersey
			Client client = new Client();

			// 想要发送到的服务器地址，记住，必须设置tomcat服务器的权限，不然无法上传到tomcat

			String path = Constant.SERVICE_URL + fileName;
			// 设置请求路径
			WebResource resource = client.resource(path);
			// 发送开始 PUT
			resource.put(String.class, in2b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
