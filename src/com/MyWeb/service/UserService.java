package com.MyWeb.service;

import com.MyWeb.dao.UserDao;
import com.MyWeb.model.User;

public class UserService {

	UserDao dao = new UserDao();

	//ȷ�����ݿ����Ƿ���ڸ��û�
	public User loginCheck(String userName, String password) {
		System.out.println(password);
		System.out.println(userName);
		User u = dao.selectUserByUserName(userName);
		if (u == null) {
			return u; 
			//�����ݿ��в����ڸ��û��Ƿ��ؿ�ֵ
		} else {
			return dao.loginCheck(userName, password);
			//���򷵻�user��
		}
	}

	// ע������û�
	public int add(User u) {
		int flag = 0;
		//���ݿ��в�ѯ�û�
		User tuser = dao.selectUserByUserName(u.getUserName());
		if (tuser == null) {
			//�����ݿ����޸��û�ʱ���������ݿ�������
			flag = dao.insert(u);
		} else {
			//�����ݿ����Ѵ��ڸ��û�ʱ��
			flag = 2;
		}
		return flag;
	}
}
