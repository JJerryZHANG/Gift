package com.MyWeb.dao;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComDao extends DBConnection {

	public void Up(String vi, String ud, String co) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = new Date();
		String sql = "insert into " + vi + " values('" + ud + "','" + co
				+ "','" + sdf.format(d) + "')";
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}