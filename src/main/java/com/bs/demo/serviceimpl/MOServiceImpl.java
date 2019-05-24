package com.bs.demo.serviceimpl;

import com.bs.demo.dao.ManagerOperationDao;
import com.bs.demo.entity.Book;
import com.bs.demo.entity.BookMenu;
import com.bs.demo.service.ManagerOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:com.bs.demo.serviceimpl
 * @description:管理员服务接口实现
 * @class:MOServiceImpl
 * @author:SanCheng
 * @create:2019-04-04
 **/
@Service
public class MOServiceImpl implements ManagerOperationService {

	@Autowired
	private ManagerOperationDao managerOperationDao;

	@Override
	public List<Book> getBookInfo() {
		List<Book> books=managerOperationDao.getBookInfo();
		return books;
	}

	@Override
	public List<BookMenu> getBookMenuInfo() {
		List<BookMenu> bookMenus=managerOperationDao.getBookMenuInfo();
		return bookMenus;
	}

	@Override
	public String setBook(Book book) {
		managerOperationDao.setBook(book);
		return "添加成功";
	}

	@Override
	public List<Book> getSomeBookInfo(String condition) {
		List<Book> books=managerOperationDao.getSomeBookInfo(condition);
		return books;
	}

	@Override
	public String updateStatus(String bookId) {
		managerOperationDao.updateStatus(bookId);
		return "修改成功";
	}

	@Override
	public String updateStatus2(String bookId) {
		managerOperationDao.updateStatus2(bookId);
		return "修改成功";
	}
}
