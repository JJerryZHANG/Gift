package com.MyWeb.dao;

import java.sql.SQLException;
import com.MyWeb.model.User;

public class UserDao extends DBConnection {
	
	//��½ȷ�ϣ���ѯ��user�����Ƿ���ڸ��û�
	public User loginCheck(String userName, String password) {
		User user = null;
		try {
			String sql = "select uname, password from user_info where uname=? and password=?";	
			String[] args = {userName,password};
			rs = exeQuery(sql,args);
			while(rs.next()){
				user = new User();
				user.setUserName(rs.getString("uName"));
				user.setPassword(rs.getString("password"));					
			}
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			closeAll();					
		}
		return user;
	}
	
	//�����ݿ��ѯ�û�
	public User selectUserByUserName(String userName) {
		User user = null;
		String sql = "select * from user_info where uname=?";
		//PareparedSatement���÷�
		//֮����Ҫps.setString(xx,userName)
		try {			
			String[] args = {String.valueOf(userName)};
			//��ȡ�������е�userNameֵ����ֵ��args
			rs = exeQuery(sql,args);
			while(rs.next()){
				user = new User();
				user.setUserName(userName);
				user.setPassword(rs.getString("password"));
			}			
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			closeAll();					
		}
		//�����ݿ���δ��ѯ���û���ʱ����ֵΪnull
		return user;
	}

	//���û����в����û���Ϣ
	public int insert(User u) {
		int flag = 0;
		String sql = "insert into user_info(uname, password, usex, uage, utag) value(?,?,?,?,?)";
		try {					
			String[] args = new String[5];
			
			args[0]=String.valueOf(u.getUserName());
			args[1]=String.valueOf(u.getPassword());
			args[2]=String.valueOf(u.getSex());
			args[3]=String.valueOf(u.getAge());		
			args[4]=String.valueOf(u.getTag());
		
			flag = exeUpdate(sql,args);
		}finally{
			closeAll();				
		}
		return flag;
	}

}
