package com.bs.demo.service;

import com.bs.demo.entity.Book;
import com.bs.demo.entity.BookMenu;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:com.bs.demo.service
 * @description:普通用户服务接口
 * @class:UserOperationService
 * @author:SanCheng
 * @create:2019-04-04
 **/
public interface UserOperationService {
	List<Book> getBookInfo();
	List<BookMenu> getBookMenuInfo();
	List<Book> getSomeBookInfo(String condition);
}
