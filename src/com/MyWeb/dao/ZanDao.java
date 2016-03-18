package com.MyWeb.dao;

import java.sql.SQLException;

public class ZanDao extends DBConnection {

	// 检测该用户是否已经点赞
	public int ZanExist(String UserName, String GiftName) throws SQLException {

		String sql = "select * from user_zan,gift_info,user_info where user_info.uid=user_zan.uid and gift_info.gid=user_zan.gid and uname='"
				+ UserName + "' and gname='" + GiftName + "' ";
		rs = SqlQuery(sql);
		if (rs.next()) {
			// 该用户对该礼品已点赞
			return 1;
		} else {
			// 该用户对该礼品还未点赞
			return 0;
		}
	}

	// 查询用户名对应的uid
	public int Uid(String UserName) throws SQLException {

		String sql = "select uid from user_info where uname=" + "'" + UserName
				+ "'";
		int uid = 0;
		rs = SqlQuery(sql);
		if (rs.next()) {
			uid = rs.getInt("uid");
		}
		return uid;
	}

	// 查询礼品名对应的gid
	public int Gid(String GiftName) throws SQLException {

		String sql = "select gid from gift_info where gname=" + "'" + GiftName
				+ "'";
		int gid = 0;
		rs = SqlQuery(sql);
		if (rs.next()) {
			gid = rs.getInt("gid");
			System.out.println(gid);
		}
		return gid;
	}

	// 用户点赞记录表添加记录
	public void ZanAdd(int uid, int gid) throws SQLException {

		String sql = "insert into user_zan(uid,gid) value (" + uid + "," + gid
				+ ") ";
		SqlExecute(sql);

	}
	
	//用于管理员给数据库增加礼品时，初始化记录到点赞数量表（就是说每个在数据库中的礼品在gift_hot表中肯定有一行）
	//管理员功能
	public void HotAdd(int gid) throws SQLException {

		String sql = "insert into user_zan(gid,ghot) value (" + gid + ", 0 ";
		SqlExecute(sql);

	}

	// 礼品点赞表中给礼品点赞数量+1
	public void HotAdd(String GiftName) throws SQLException {

		String sql = "update gift_hot,gift_info set ghot = ghot +1 where gift_info.gid=gift_hot.gid and gname="
				+ "'" + GiftName + "'";
		SqlExecute(sql);
	}
	
	//显示赞的数量
	public String ZanAmount(int gid) throws SQLException {
		
		String amount = "0";
		String sql="select ghot from gift_hot where gid="+gid;
		rs = SqlQuery(sql);
		if(rs.next()){
			amount=rs.getString("ghot");
		}
		return amount;
	}

}
