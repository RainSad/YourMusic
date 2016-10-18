package com.util;

import net.sf.json.JSONObject;

/**
 * json工具类
 *
 * @author 孙文祥
 * @date 2016年8月30日
 *
 */
public final class JSONUtil {

	/**
	 * 字符串转json
	 * 
	 * @param data
	 * @return
	 *
	 * @author 孙文祥
	 */
	public static JSONObject StringToJSON(String data) {
		JSONObject jsonObject = JSONObject.fromObject(data);
		return jsonObject;
	}

	/**
	 * json转字符串
	 * 
	 * @param data
	 * @return
	 *
	 * @author 孙文祥
	 */
	public static String JSONToString(JSONObject data) {
		String jsonData = data.toString();
		return jsonData;
	}
	
	


}
