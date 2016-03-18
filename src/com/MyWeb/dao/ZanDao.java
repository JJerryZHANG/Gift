package com.MyWeb.dao;

import java.sql.SQLException;

public class ZanDao extends DBConnection {

	// �����û��Ƿ��Ѿ�����
	public int ZanExist(String UserName, String GiftName) throws SQLException {

		String sql = "select * from user_zan,gift_info,user_info where user_info.uid=user_zan.uid and gift_info.gid=user_zan.gid and uname='"
				+ UserName + "' and gname='" + GiftName + "' ";
		rs = SqlQuery(sql);
		if (rs.next()) {
			// ���û��Ը���Ʒ�ѵ���
			return 1;
		} else {
			// ���û��Ը���Ʒ��δ����
			return 0;
		}
	}

	// ��ѯ�û�����Ӧ��uid
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

	// ��ѯ��Ʒ����Ӧ��gid
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

	// �û����޼�¼����Ӽ�¼
	public void ZanAdd(int uid, int gid) throws SQLException {

		String sql = "insert into user_zan(uid,gid) value (" + uid + "," + gid
				+ ") ";
		SqlExecute(sql);

	}
	
	//���ڹ���Ա�����ݿ�������Ʒʱ����ʼ����¼����������������˵ÿ�������ݿ��е���Ʒ��gift_hot���п϶���һ�У�
	//����Ա����
	public void HotAdd(int gid) throws SQLException {

		String sql = "insert into user_zan(gid,ghot) value (" + gid + ", 0 ";
		SqlExecute(sql);

	}

	// ��Ʒ���ޱ��и���Ʒ��������+1
	public void HotAdd(String GiftName) throws SQLException {

		String sql = "update gift_hot,gift_info set ghot = ghot +1 where gift_info.gid=gift_hot.gid and gname="
				+ "'" + GiftName + "'";
		SqlExecute(sql);
	}
	
	//��ʾ�޵�����
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
