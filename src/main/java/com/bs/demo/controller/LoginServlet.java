package com.bs.demo.controller;

import com.bs.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @program:com.bs.demo.controller
 * @description:登录界面
 * @class:LoginServlet
 * @author:SanCheng
 * @create:2019-04-02
 **/

@Controller
public class LoginServlet {

	@Autowired
	private LoginService loginService;

	@PostMapping("/loginCheck")
	public String loginCheck(@RequestParam("username") String username, @RequestParam("password") String password){
		int tip=loginService.loginCheck(username,password);
		if(tip==2){
			return "redirect:bookoperation.html?id="+username;
		}
		if(tip==1){
			return "redirect:bookoperationStd.html?id="+username;
		}
		return "redirect:index.html";
	}
}
