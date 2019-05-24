package com.bs.demo.serviceimpl;

import com.bs.demo.dao.RegisterDao;
import com.bs.demo.entity.User;
import com.bs.demo.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program:com.bs.demo.serviceimpl
 * @description:注册服务接口实现
 * @class:RegisterServiceImpl
 * @author:SanCheng
 * @create:2019-04-04
 **/
@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterDao registerDao;

	@Override
	public String setUser(User user) {
		registerDao.insert(user);
		return "注册成功";
	}
}
