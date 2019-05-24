package com.bs.demo.service;

import com.bs.demo.entity.Book;
import com.bs.demo.entity.BookMenu;

import java.util.List;

/**
 * @program:com.bs.demo.service
 * @description:管理员服务接口
 * @class:ManagerOperationService
 * @author:SanCheng
 * @create:2019-04-04
 **/
public interface ManagerOperationService {
	List<Book> getBookInfo();
	List<BookMenu> getBookMenuInfo();
	String setBook(Book book);
	List<Book> getSomeBookInfo(String condition);
	String updateStatus(String bookId);
	String updateStatus2(String bookId);
}
