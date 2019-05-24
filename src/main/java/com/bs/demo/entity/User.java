package com.bs.demo.entity;

/**
 * @program:com.bs.demo.entity
 * @description:用户
 * @class:User
 * @author:SanCheng
 * @create:2019-04-02
 **/
public class User {
	private String userName;
	private String passWord;
	private String name;
	private int isManager;

	public User(String userName, String passWord, String name, int isManager) {
		this.userName = userName;
		this.passWord = passWord;
		this.name = name;
		this.isManager = isManager;
	}

	public User(String userName, String passWord, String name) {
		this.userName = userName;
		this.passWord = passWord;
		this.name = name;
	}

	public User() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIsManager() {
		return isManager;
	}

	public void setIsManager(int isManager) {
		this.isManager = isManager;
	}
}
