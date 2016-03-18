package com.MyWeb.dao;

import java.sql.SQLException;

public class SearchDao extends DBConnection {
	public String[] userinfo(String userName) throws SQLException {

		String sql = "select * from user_info where uname=" + "'"+userName+"'";
		System.out.println(sql);
		rs = st.executeQuery(sql);
		String searchuser[] = new String[4];
		while (rs.next()) {
			searchuser[0] = rs.getString("uname");
			searchuser[1] = rs.getString("usex");
			searchuser[2] = rs.getString("uage");
			searchuser[3] = rs.getString("utag");
		}
		return searchuser;
	}

	public String[] userlike(String userName) throws SQLException {

		String sql = "select gpic from user_zan,user_info,gift_info where user_zan.uid=user_info.uid and user_zan.gid=gift_info.gid and uname="
				+"'"+userName+"'";
		rs = st.executeQuery(sql);
		String like[] = new String[3];
		int i = 0;
		while (rs.next()) {

			like[i] = rs.getString("gpic");
			i++;
			if (i == 3) {
				break;
			}

		}
		return like;
	}
	
	public String[] userlikename(String userName) throws SQLException {

		String sql = "select gname from user_zan,user_info,gift_info where user_zan.uid=user_info.uid and user_zan.gid=gift_info.gid and uname="
				+"'"+userName+"'";
		rs = st.executeQuery(sql);
		String likename[] = new String[3];
		int i = 0;
		while (rs.next()) {

			likename[i] = rs.getString("gname");
			i++;
			if (i == 3) {
				break;
			}

		}
		return likename;
	}
		
	public int isuser(String userName) throws SQLException {
		//String sql = "select * from user_info where uname=" +userName;
		String sql = "select * from user_info where uname=" +"'"+userName+"'";
		//System.out.println(sql);
		rs = SqlQuery(sql);
		int flag = 0;
		if (rs.next()) {
			flag = 1;			
		}
		return flag;
	}

}
