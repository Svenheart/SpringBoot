package com.bs.demo.dao;

import com.bs.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @program:com.bs.demo.dao
 * @description:登录接口
 * @class:LoginDao
 * @author:SanCheng
 * @create:2019-04-04
 **/

@Mapper
public interface LoginDao {

	@Select(value = "select * from new_schema.user where username = #{userName}")
	User getUserInfo(String userName);
}
