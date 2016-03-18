package com.MyWeb.dao;

import java.sql.SQLException;
import com.MyWeb.model.User;

public class UserDao extends DBConnection {
	
	//登陆确认，查询在user表中是否存在该用户
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
	
	//从数据库查询用户
	public User selectUserByUserName(String userName) {
		User user = null;
		String sql = "select * from user_info where uname=?";
		//PareparedSatement的用法
		//之后需要ps.setString(xx,userName)
		try {			
			String[] args = {String.valueOf(userName)};
			//获取服务器中的userName值并赋值给args
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
		//当数据库中未查询到用户名时返回值为null
		return user;
	}

	//在用户表中插入用户信息
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
