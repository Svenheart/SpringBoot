package com.bs.demo.dao;

import com.bs.demo.entity.Book;
import com.bs.demo.entity.BookMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program:com.bs.demo.dao
 * @description:普通用户操作接口
 * @class:UserOperationDao
 * @author:SanCheng
 * @create:2019-04-04
 **/
@Mapper
public interface UserOperationDao {
	@Select(value = "select * from new_schema.book")
	List<Book> getBookInfo();

	@Select(value = "select user.username,name,bookname,press,status,date from new_schema.book,new_schema.bookmenu,new_schema.user " +
			"where user.username=bookmenu.username and book.bookid=bookmenu.bookid")
	List<BookMenu> getBookMenuInfo();

	@Select(value = "select * from new_schema.book where bookname like #{condition} or booktype like #{condition}")
	List<Book> getSomeBookInfo(String condition);

}
