package com.MyWeb.dao;

import java.sql.SQLException;

public class HotGiftDao extends DBConnection {

	public String[] Hot() throws SQLException {

		/**
		 * String sql = "select gid from gift_hot order by ghot desc"; rs =
		 * SqlQuery(sql); String hottestId=rs.getString(1); rs.close();
		 * sql="select * from gift_basic,gift_info where gid= '"
		 * +hottestId+"' and gift_info.gid=gift_basic.gid"; rs = SqlQuery(sql);
		 */
		String sql = "select * from gift_info,gift_hot where gift_hot.gid=gift_info.gid order by ghot asc";
		rs = SqlQuery(sql);
		String info[] = new String[3];

		while (rs.next()) {

			info[0] = rs.getString("gpic");
			info[1] = rs.getString("gname");
			info[2] = rs.getString("glink");
		}

		return info;
	}
}
