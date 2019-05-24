package com.bs.demo.dao;

import com.bs.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program:com.bs.demo.dao
 * @description:注册接口
 * @class:RegisterDao
 * @author:SanCheng
 * @create:2019-04-04
 **/
@Mapper
public interface RegisterDao {
	@Select(value = "insert into new_schema.user(username,password,ismanager,name)"+
			"values(#{userName},#{passWord},#{isManager},#{name})")
	void insert(User user);
}
