package com.MyWeb.service;

import com.MyWeb.dao.UserDao;
import com.MyWeb.model.User;

public class UserService {

	UserDao dao = new UserDao();

	//确认数据库中是否存在该用户
	public User loginCheck(String userName, String password) {
		System.out.println(password);
		System.out.println(userName);
		User u = dao.selectUserByUserName(userName);
		if (u == null) {
			return u; 
			//当数据库中不存在该用户是返回空值
		} else {
			return dao.loginCheck(userName, password);
			//否则返回user类
		}
	}

	// 注册添加用户
	public int add(User u) {
		int flag = 0;
		//数据库中查询用户
		User tuser = dao.selectUserByUserName(u.getUserName());
		if (tuser == null) {
			//当数据库中无该用户时，进行数据库插入操作
			flag = dao.insert(u);
		} else {
			//当数据库中已存在该用户时：
			flag = 2;
		}
		return flag;
	}
}
