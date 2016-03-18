package com.MyWeb.dao;

import java.sql.SQLException;

public class DefaultDao extends DBConnection {

	public String[] GiftName(String tid, String aid) throws SQLException {

		String sql = "select distinct gname from gift_info,gift_tag,gift_age where gift_info.gid=gift_tag.gid and gift_info.gid=gift_age.gid and (tid="
				+ tid + " or aid=" + aid + ") ";
		System.out.println(sql);
		String name[] = new String[9];

		try {
			rs = SqlQuery(sql);
			int i = 1;
			while (rs.next()) {
				name[i] = rs.getString("gname");
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
		return name;
	}

	public String[] GifLink(String tid, String aid) throws SQLException {

		String sql = "select distinct glink from gift_info,gift_tag,gift_age where gift_info.gid=gift_tag.gid and gift_info.gid=gift_age.gid and (tid="
				+ tid + " or aid=" + aid + ") "; // 以tag、age分别排序

		String link[] = new String[9];

		try {
			rs = SqlQuery(sql);
			int i = 1;
			while (rs.next()) {
				link[i] = rs.getString("glink");
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
		return link;
	}

	public String[] GiftPic(String tid, String aid) throws SQLException {

		String sql = "select distinct gpic from gift_info,gift_tag,gift_age where gift_info.gid=gift_tag.gid and gift_info.gid=gift_age.gid and (tid="
				+ tid + " or aid=" + aid + ") "; // 以tag、age分别排序

		String pic[] = new String[9];

		try {
			rs = SqlQuery(sql);
			int i = 1;
			while (rs.next()) {
				pic[i] = rs.getString("gpic");
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
		return pic;
	}

	public String[] GiftAbout(String tid, String aid) throws SQLException {

		String sql = "select distinct gabout from gift_info,gift_tag,gift_age where gift_info.gid=gift_tag.gid and gift_info.gid=gift_age.gid and (tid="
				+ tid + " or aid=" + aid + ") "; // 以tag、age分别排序

		String about[] = new String[9];

		try {
			rs = SqlQuery(sql);
			int i = 1;
			while (rs.next()) {
				about[i] = rs.getString("gabout");
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
		return about;
	}

	public int[] GiftId(String tid, String aid) throws SQLException {

		String sql = "select distinct gift_info.gid from gift_info,gift_tag,gift_age where gift_info.gid=gift_tag.gid and gift_info.gid=gift_age.gid and (tid="
				+ tid + " or aid=" + aid + ") "; // 以tag、age分别排序

		int gid[] = new int[9];
		try {
			rs = SqlQuery(sql);
			int i = 1;
			while (rs.next()) {
				gid[i] = rs.getInt("gid");
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
		return gid;
	}

	public String Uaid(String u) {
		String sql = "select aid from user_info,age WHERE user_info.uage=age.age and uname="+"'"+u+"'";
		String aid = null;
		rs = SqlQuery(sql);
		try {
			if (rs.next()) {
				aid = rs.getString("aid");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aid;
	}

	public String Utid(String u) {
		
		String sql = "select tid from user_info,tag WHERE user_info.utag=tag.tag and uname="+"'"+u+"'";
		System.out.println(sql);
		String tid = null;
		rs = SqlQuery(sql);
		try {
			if (rs.next()) {
				tid = rs.getString("tid");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tid;

	}

}
