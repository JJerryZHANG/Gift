package com.MyWeb.dao;

import java.sql.SQLException;

public class GiftDao extends DBConnection {

	// 根据条件查找礼品数据
	// id为Main.jsp传过来的搜索条件用于数据库查询

	public String[] GiftPic(String id) throws SQLException {

		String sql;
		if ("old".equals(id) || "adult".equals(id) || "young".equals(id)
				|| "children".equals(id) || "baby".equals(id)) {
			sql = "select gpic from gift_info,gift_age,age where gift_info.gid=gift_age.gid and gift_age.aid=age.aid and age="
					+ "'" + id + "'";
		} else if ("spring".equals(id) || "moon".equals(id)
				|| "birthday".equals(id) || "marry".equals(id)
				|| "love".equals(id) || "move".equals(id)) {
			sql = "select gpic from gift_info,gift_day,day where gift_info.gid=gift_day.gid and gift_day.did=day.did and day="
					+ "'" + id + "'";
		} else {
			sql = "select gpic from gift_info,gift_tag,tag where gift_info.gid=gift_tag.gid and gift_tag.tid=tag.tid and tag="
					+ "'" + id + "'";
		}
		String a[] = new String[9];
		try {
			rs = SqlQuery(sql);
			int i = 1;

			while (rs.next()) {
				a[i] = rs.getString("gpic");
				i++;
				if (i == 9) {
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return a;
	}

	// 根据条件获取礼品名称

	public String[] GiftName(String id) throws SQLException {

		String sql;
		if ("old".equals(id) || "adult".equals(id) || "young".equals(id)
				|| "children".equals(id) || "baby".equals(id)) {
			sql = "select gname from gift_info,gift_age,age where gift_info.gid=gift_age.gid and gift_age.aid=age.aid and age="
					+ "'" + id + "'";
		} else if ("spring".equals(id) || "moon".equals(id)
				|| "birthday".equals(id) || "marry".equals(id)
				|| "love".equals(id) || "move".equals(id)) {
			sql = "select gname from gift_info,gift_day,day where gift_info.gid=gift_day.gid and gift_day.did=day.did and day="
					+ "'" + id + "'";
		} else {
			sql = "select gname from gift_info,gift_tag,tag where gift_info.gid=gift_tag.gid and gift_tag.tid=tag.tid and tag="
					+ "'" + id + "'";
		}
		String b[] = new String[9];
		try {
			rs = SqlQuery(sql);
			int j = 1;
			while (rs.next()) {
				b[j] = rs.getString("gname");
				j++;
				if (j == 9) {
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return b;
	}

	// 根据条件获取礼品购买链接

	public String[] GiftLink(String id) throws SQLException {

		String sql;
		if ("old".equals(id) || "adult".equals(id) || "young".equals(id)
				|| "children".equals(id) || "baby".equals(id)) {
			sql = "select glink from gift_info,gift_age,age where gift_info.gid=gift_age.gid and gift_age.aid=age.aid and age="
					+ "'" + id + "'";
		} else if ("spring".equals(id) || "moon".equals(id)
				|| "birthday".equals(id) || "marry".equals(id)
				|| "love".equals(id) || "move".equals(id)) {
			sql = "select glink from gift_info,gift_day,day where gift_info.gid=gift_day.gid and gift_day.did=day.did and day="
					+ "'" + id + "'";
		} else {
			sql = "select glink from gift_info,gift_tag,tag where gift_info.gid=gift_tag.gid and gift_tag.tid=tag.tid and tag="
					+ "'" + id + "'";
		}
		String c[] = new String[9];
		try {
			rs = SqlQuery(sql);
			int k = 1;
			while (rs.next()) {
				c[k] = rs.getString("glink");
				k++;
				if (k == 9) {
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return c;

	}

	// 获取礼品赞的数量
	public String GiftZan(String giftName) throws SQLException {

		String amount = "0";
		String sql = "select ghot from gift_hot,gift_info where gift_info.gid=gift_hot.gid and gname=" +"'"+ giftName+"'";
		//System.out.println(sql);
		rs = SqlQuery(sql);
		if (rs.next()) {
			amount = rs.getString("ghot");
		}
		return amount;

	}

}