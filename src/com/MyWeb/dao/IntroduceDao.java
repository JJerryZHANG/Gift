package com.MyWeb.dao;

import java.sql.SQLException;

public class IntroduceDao extends DBConnection{

	//根据取得值（礼物名称）进行数据库查询
	public  String[] Introduce(String name) throws SQLException {
		String sql = "select * from gift_basic,gift_info where gname="+ name;
		rs=st.executeQuery(sql);
		String introduce[] = new String[3];
		if (rs.next()) {
			introduce[0]=rs.getString("gpic");
			introduce[1]=rs.getString("gabout");
			introduce[2]=rs.getString("glink");
		}
		return introduce;
	}

}
