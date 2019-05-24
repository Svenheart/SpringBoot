package com.bs.demo.entity;

/**
 * @program:com.bs.demo.entity
 * @description:图书
 * @class:Book
 * @author:SanCheng
 * @create:2019-04-04
 **/
public class Book {
	private int bookId;
	private String bookName;
	private String bookType;
	private String press;
	private String writer;

	public Book(int bookId, String bookName, String bookType, String press, String writer) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookType = bookType;
		this.press = press;
		this.writer = writer;
	}

	public Book() {
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
}
