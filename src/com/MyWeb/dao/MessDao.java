package com.MyWeb.dao;

import java.sql.SQLException;

public class MessDao extends DBConnection {

	public void addMessage(String uname, String content) throws SQLException {

		String sql = "insert into message(uname,content) VALUES('" + uname
				+ "','" + content + "')";
		SqlExecute(sql);

	}

	// 获取记录数量
	public int getCount() {
		String sql = "select count(*) from message";
		rs = SqlQuery(sql);
		int n = 0;
		try {
			while (rs.next()) {
				n = rs.getInt("count(*)");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

	public String[] getUname(int n) {
		String uname[] = new String[255];
		String sql = "select uname from message";
		rs = SqlQuery(sql);
		try {
			int i = 0;
			while (rs.next()) {
				uname[i] = rs.getString("uname");
				i++;
				if (i == n) {
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return uname;

	}

	public String[] getContent(int n) {
		String content[] = new String[255];
		String sql = "select content from message";
		rs = SqlQuery(sql);
		try {
			int i = 0;
			while (rs.next()) {
				content[i] = rs.getString("content");
				i++;
				if (i == n) {
					break;
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;

	}
}
