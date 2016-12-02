package com.core.controller.music.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 *
 * @author 孙文祥
 * @date 2016年12月1日
 *
 */
@Controller
public class Mian {

	@RequestMapping("index.shtml")
	public String index(){
		return "main/index";
	}
	@RequestMapping("login.shtml")
	public String login(){
		return "main/login";
	}
	@RequestMapping("toRegister.shtml")
	public String toRigister(){
		return "main/toRegister";
	}
}
