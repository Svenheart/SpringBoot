package com.bs.demo.controller;

import com.alibaba.fastjson.JSON;
import com.bs.demo.service.UserOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program:com.bs.demo.controller
 * @description:普通用户界面
 * @class:NOServlet
 * @author:SanCheng
 * @create:2019-04-04
 **/
@RestController
public class NOServlet {

	@Autowired
	private UserOperationService userOperationService;

	@PostMapping("/getBookInfoStd")
	@ResponseBody
	public String getBookInfo(){
		String s= JSON.toJSONString(userOperationService.getBookInfo());
		return s;
	}

	@PostMapping("/getBookMenuInfoStd")
	@ResponseBody
	public String getBookMenuInfo(){
		String s= JSON.toJSONString(userOperationService.getBookMenuInfo());
		return s;
	}

	@PostMapping("/getSomeBookInfoStd")
	@ResponseBody
	public String getSomeBookInfo(@RequestBody String condition){
		String s= JSON.parse(condition).toString();
		String tip= JSON.toJSONString(userOperationService.getSomeBookInfo(s));
		return tip;
	}
}
