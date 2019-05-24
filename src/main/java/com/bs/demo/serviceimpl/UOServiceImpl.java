package com.bs.demo.serviceimpl;

import com.bs.demo.dao.UserOperationDao;
import com.bs.demo.entity.Book;
import com.bs.demo.entity.BookMenu;
import com.bs.demo.service.UserOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:com.bs.demo.serviceimpl
 * @description:普通用户服务接口实现
 * @class:NOServiceImpl
 * @author:SanCheng
 * @create:2019-04-04
 **/
@Service
public class UOServiceImpl implements UserOperationService {

	@Autowired
	private UserOperationDao userOperationDao;

	@Override
	public List<Book> getBookInfo() {
		List<Book> books=userOperationDao.getBookInfo();
		return books;
	}

	@Override
	public List<BookMenu> getBookMenuInfo() {
		List<BookMenu> bookMenus=userOperationDao.getBookMenuInfo();
		return bookMenus;
	}

	@Override
	public List<Book> getSomeBookInfo(String condition) {
		List<Book> books=userOperationDao.getSomeBookInfo(condition);
		return books;
	}
}
