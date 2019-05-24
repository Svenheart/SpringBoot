package com.bs.demo.serviceimpl;

import com.bs.demo.dao.LoginDao;
import com.bs.demo.entity.User;
import com.bs.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program:com.bs.demo.serviceimpl
 * @description:登录服务接口实现
 * @class:LoginServiceImpl
 * @author:SanCheng
 * @create:2019-04-04
 **/
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;

	@Override
	public int loginCheck(String userName, String passWord) {
		try{
			User user=loginDao.getUserInfo(userName);
			if(user.getPassWord().equals(passWord)&&user.getIsManager()==1){
				return 2;
			}
			if(user.getPassWord().equals(passWord)){
				return 1;
			}
		}catch (Exception e){
			return 0;
		}
		return 0;
	}
}
