package com.MyWeb.dao;

import java.sql.SQLException;

public class StoryDao extends DBConnection {

	public String[] Story(String id) throws SQLException {

		String sql = "select * from story_info where sid=" + "'" + id + "'";
		rs = SqlQuery(sql);
		String info[] = new String[2];
		while (rs.next()) {
			info[0] = rs.getString("stitle");
			info[1] = rs.getString("sabout");
		}
		return info;
	}

	public String[] Rgift(String id) throws SQLException {

		String sql = "select gname from gift_story,gift_info where gift_story.gid=gift_info.gid and sid="
				+ "'" + id + "'";
		rs = SqlQuery(sql);
		String rgift[] = new String[5];
		// 每篇文章最多关联5个礼品
		int i = 0;
		while (rs.next()) {
			rgift[i] = rs.getString("gname");
			i++;
		}
		return rgift;
	}

}
