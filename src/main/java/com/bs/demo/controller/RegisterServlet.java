package com.bs.demo.controller;

import com.alibaba.fastjson.JSON;
import com.bs.demo.entity.User;
import com.bs.demo.serviceimpl.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @program:com.bs.demo.controller
 * @description:注册界面
 * @class:RegisterServlet
 * @author:SanCheng
 * @create:2019-04-04
 **/
@RestController
public class RegisterServlet {

	@Autowired
	private RegisterServiceImpl registerService;

	@PostMapping("/register")
	public String register(@RequestParam("username")String username,@RequestParam("password")String password,
	                       @RequestParam("name")String name){
		User user=new User(username,password,name);
		try{
			registerService.setUser(user);
			return "注册成功";
		}catch (Exception e){
			e.printStackTrace();
			return "注册失败";
		}
	}
}
