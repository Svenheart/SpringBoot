package com.bs.demo.entity;

import java.util.Date;

/**
 * @program:com.bs.demo.entity
 * @description:借阅信息
 * @class:bookMenu
 * @author:SanCheng
 * @create:2019-04-04
 **/
public class BookMenu {
	private String userName;
	private String name;
	private String bookName;
	private String press;
	private String status;
	private Date date;

	public BookMenu(String userName, String name, String bookName, String press, String status, Date date) {
		this.userName = userName;
		this.name = name;
		this.bookName = bookName;
		this.press = press;
		this.status = status;
		this.date = date;
	}

	public BookMenu() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
