package com.core.controller.music.main;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.model.user.UserInfo;
import com.core.model.user.UserLogin;
import com.core.service.user.UserInfoSer;
import com.core.service.user.UserLoginSer;

/**
 * 首页
 *
 * @author 孙文祥
 * @date 2016年12月1日
 *
 */
@Controller
public class Mian {

	@Autowired
	UserLoginSer user;
	
	@Autowired
	UserInfoSer userInfo;

	@RequestMapping("index.shtml")
	public String index() {
		return "main/index";
	}

	@RequestMapping("toLogin.shtml")
	public String toLogin() {
		return "main/login";
	}

	/**
	 * 登录验证
	 * 
	 * @param userName
	 * @param passWord
	 * @param model
	 * @return
	 *
	 * @author 孙文祥
	 */
	@RequestMapping("login.shtml")
	public String login(
			String userId, 
			String passWord, 
			ModelMap model,
			HttpSession session) {

		UserLogin record = new UserLogin();
		record.setUserId(userId);

		List<UserLogin> isExit = user.selectBySelective(record);
		if (isExit.size() < 1) {
			model.addAttribute("isExit", 0);// 0无此用户
			return "main/login";
		} else if (isExit.size() >= 1) {
			record.setPassword(passWord);
			List<UserLogin> isExit2 = user.selectBySelective(record);
			if (isExit2.size() < 1) {
				model.addAttribute("isExit", 1);// 1密码错误
				return "main/login";
			} else if (isExit2.size() >= 0) {
				UserInfo userInfomation = userInfo.selectByPrimaryKey(userId);
				if(userInfomation != null){
					session.setAttribute("userId", userInfomation.getUserId());
					session.setAttribute("userName", userInfomation.getUserName());
					session.setAttribute("userSex", userInfomation.getUserSex());
				}
				model.addAttribute("isExit", 2);// 2登录成功
				return "main/index";
			}
		}

		return null;
	}

	@RequestMapping("toRegister.shtml")
	public String toRigister() {
		return "main/toRegister";
	}

	@RequestMapping("Register.shtml")
	public String Rigister(
			String userName, 
			String userId, 
			String userDiscription,
			String password,
			String repeatPassword,
			String qq,
			String wechat,
			String weibo,
			ModelMap model,
			HttpSession session) {
		UserLogin record = new UserLogin();
		record.setUserId(userId);
		List<UserLogin> isExit = user.selectBySelective(record);
		if(isExit.size() >= 1){
			model.addAttribute("status", 0);//用户id已存在
			return "main/toRegister"; 
		}
		

		return "main/toRegister";
	}
}
