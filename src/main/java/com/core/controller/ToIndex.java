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

import com.common.constant.Constant;
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


	
}
