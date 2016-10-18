package com.core.APIservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.core.model.music.SearchInfo;
import com.util.JSONUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class SearchInfoToBean {

	/**
	 * 根据json信息接到的信息转化成javabean
	 * 
	 * @param data
	 * @return MusicSearchInfo
	 *
	 * @author 孙文祥
	 */
	public List<SearchInfo> info(JSONObject data) {
		int len = data.getJSONObject("data").getJSONArray("data").size();
		JSONObject data2 = data.getJSONObject("data");
		JSONArray data3 = data.getJSONObject("data").getJSONArray("data");
		ArrayList<SearchInfo> list = new ArrayList<SearchInfo>();
		for (int i = 0; i < len; i++) {
			SearchInfo info = new SearchInfo();
			info.setCode(data.getString("code"));
			info.setStatus(data.getString("status"));
			info.setMsg(data.getString("msg"));
			info.setCurrentPage(data2.getInt("current_page"));
			info.setKeyword(data2.getString("keyword"));
			info.setTotalRows(data2.getInt("total_rows"));
			info.setTotalPage(data2.getInt("total_page"));
			info.setPagesize(data2.getInt("page_size"));
			info.setFilename(data3.getJSONObject(i).getString("filename"));
			info.setExtname(data3.getJSONObject(i).getString("extname"));
			info.setM4afilesize(data3.getJSONObject(i).getInt("m4afilesize"));
			info.setFilesize(data3.getJSONObject(i).getInt("filesize"));
			info.setBitrate(data3.getJSONObject(i).getInt("bitrate"));
			info.setIsnew(data3.getJSONObject(i).getString("isnew"));
			info.setDuration(data3.getJSONObject(i).getInt("duration"));
			info.setAibumName(data3.getJSONObject(i).getString("album_name"));
			info.setSingername(data3.getJSONObject(i).getString("singername"));
			info.setHash(data3.getJSONObject(i).getString("hash"));
			list.add(info);
		}
		return list;
	}

	/**
	 * 根据搜索返回的字符串得到javabean
	 * 
	 * @param data
	 * @return
	 *
	 * @author 孙文祥
	 */
	public List<SearchInfo> info(String data) {
		JSONObject json = JSONUtil.StringToJSON(data);

		return info(json);
	}
}
