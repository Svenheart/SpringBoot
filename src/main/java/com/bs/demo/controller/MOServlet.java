package com.bs.demo.controller;

import com.alibaba.fastjson.JSON;
import com.bs.demo.entity.Book;
import com.bs.demo.service.ManagerOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @program:com.bs.demo.controller
 * @description:管理员界面
 * @class:MOServlet
 * @author:SanCheng
 * @create:2019-04-04
 **/
@Controller
public class MOServlet {

	@Autowired
	private ManagerOperationService managerOperationService;

	@PostMapping("/getBookInfo")
	@ResponseBody
	public String getBookInfo(){
		String s= JSON.toJSONString(managerOperationService.getBookInfo());
		return s;
	}

	@PostMapping("/getBookMenuInfo")
	@ResponseBody
	public String getBookMenuInfo(){
		String s= JSON.toJSONString(managerOperationService.getBookMenuInfo());
		return s;
	}

	@PostMapping("/getSomeBookInfo")
	@ResponseBody
	public String getSomeBookInfo(@RequestBody String condition){
		String s=JSON.parse(condition).toString();
		String tip= JSON.toJSONString(managerOperationService.getSomeBookInfo(s));
		return tip;
	}

	@PostMapping("/setBookInfo")
	@ResponseBody
	public String setBookInfo(@RequestBody Book book){
		String s= JSON.toJSONString(managerOperationService.setBook(book));
		return s;
	}

	@PostMapping("/updateStatus")
	@ResponseBody
	public String updateStatus(@RequestBody String bookId){
		String s=JSON.parse(bookId).toString();
		String tip=JSON.toJSONString(managerOperationService.updateStatus(s));
		return tip;
	}

	@PostMapping("/updateStatus2")
	@ResponseBody
	public String updateStatus2(@RequestBody String bookId){
		String s=JSON.parse(bookId).toString();
		String tip=JSON.toJSONString(managerOperationService.updateStatus2(s));
		return tip;
	}
}
