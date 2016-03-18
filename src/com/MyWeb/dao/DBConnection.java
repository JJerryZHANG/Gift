package com.MyWeb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DBConnection {
	static private String strDriver = "com.mysql.jdbc.Driver";
	static private String strUrl = "jdbc:mysql://localhost:3306/myweb";
	static private String strUser = "root";
	static private String strPwd = "";
	// 此处数据库账号、密码需要根据运行环境修改

	Connection conn = null;
	PreparedStatement st = null;
	ResultSet rs = null;

	static {
		try {
			Class.forName(strDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void getConnection() {
		try {
			if (conn == null || conn.isClosed()) {
				conn = DriverManager.getConnection(strUrl, strUser, strPwd);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("connection failure");
		}

	}
	
	//数据库查询
	public ResultSet SqlQuery(String sql){
		getConnection();
		try {
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	//数据库插入
	public void SqlExecute(String sql){
		getConnection();
		try {
			st = conn.prepareStatement(sql);
			st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

	// 数据库执行获得结果
	public ResultSet exeQuery(String sql, String[] args) {
		getConnection();
		try {
			//System.out.println(sql);
			st = conn.prepareStatement(sql);
			if (args != null) {
				for (int i = 0; i < args.length; i++) {
					st.setString(i + 1, args[i]);
				}
			}
			rs = st.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	// 数据库更新
	public int exeUpdate(String sql, String[] args) {
		int rs = 0;
		try {
			getConnection();
			st = conn.prepareStatement(sql);
			if (args != null) {
				for (int i = 0; i < args.length; i++) {
					st.setString(i + 1, args[i]);
				}
				//执行成功返回1，执行失败返回0
				rs = st.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return rs;
	}

	public int executeBatch(List<?> sqls) {
		int flag = 0;
		try {
			getConnection();
			conn.setAutoCommit(false);
			st = conn.prepareStatement(null);
			for (int i = 0; i < sqls.size(); i++) {
				String sql = (String) sqls.get(i);
				st.addBatch(sql);
			}
			st.executeBatch();
			conn.commit();
			flag = 1;
		} catch (Exception ex) {
			try {
				conn.rollback();
			} catch (Exception ex2) {
				System.err.println("rollback failed:" + ex2.getMessage());
			}
			ex.printStackTrace();
		} finally {
		}
		return flag;
	}

	public void closeAll() {

		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
