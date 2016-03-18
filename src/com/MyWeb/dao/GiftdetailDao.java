package com.MyWeb.dao;

import java.sql.SQLException;

public class GiftdetailDao extends DBConnection {

	public String[] giftinfo(String giftName) throws SQLException {

		String sql = "select * from gift_info where gname=" + "'" + giftName
				+ "'";
		rs = SqlQuery(sql);
		String gift[] = new String[4];
		while (rs.next()) {
			gift[0] = rs.getString("gname");
			gift[1] = rs.getString("gpic");
			gift[2] = rs.getString("gabout");
			gift[3] = rs.getString("glink");
		}
		return gift;
	}

	public String[] day(String giftName) throws SQLException {

		String sql = "select dayname from `day`,gift_day,gift_info where gift_day.gid=gift_info.gid and gift_day.did=`day`.did and gname="
				+ "'" + giftName + "'";
		//System.out.println(giftName);
		rs = SqlQuery(sql);
		String day[] = new String[6];
		int i = 0;
		while (rs.next()) {
			day[i] = rs.getString("dayname");
			i++;
		}
		return day;
	}

	public String[] age(String giftName) throws SQLException {

		String sql = "select agename from `age`,gift_age,gift_info where gift_age.gid=gift_info.gid and gift_age.aid=`age`.aid and gname="
				+ "'" + giftName + "'";
		rs = SqlQuery(sql);
		String age[] = new String[5];
		int i = 0;
		while (rs.next()) {
			age[i] = rs.getString("agename");
			i++;
		}
		return age;
	}

	public String[] tag(String giftName) throws SQLException {

		String sql = "select tagname from `tag`,gift_tag,gift_info where gift_tag.gid=gift_info.gid and gift_tag.tid=`tag`.tid and gname="
				+ "'" + giftName + "'";
		rs = SqlQuery(sql);
		String tag[] = new String[6];
		int i = 0;
		while (rs.next()) {
			tag[i] = rs.getString("tagname");
			i++;
		}
		return tag;
	}

	public String story(String giftName) throws SQLException {

		String sql = "select stitle from story_info,gift_story,gift_info where story_info.sid=gift_story.sid and gift_info.gid=gift_story.gid and gname="
				+ "'" + giftName + "'";
		rs = SqlQuery(sql);
		String story = null;
		while (rs.next()) {
			story = rs.getString("stitle");
		}
		return story;
	}
	
	public int storyid(String giftName) throws SQLException {

		String sql = "select story_info.sid from story_info,gift_story,gift_info where story_info.sid=gift_story.sid and gift_info.gid=gift_story.gid and gname="
				+ "'" + giftName + "'";
		rs = SqlQuery(sql);
		int storyid = 0;
		while (rs.next()) {
			storyid = rs.getInt("sid");
			//System.out.println(storyid);
		}
		return storyid;
	}

	public String[] giftrelated(int did, int aid, int tid)
			throws SQLException {
		String sql = "select distinct gname from gift_info,gift_age,gift_day,gift_tag where gift_info.gid=gift_age.gid and gift_info.gid=gift_day.gid and gift_info.gid=gift_tag.gid and (did="
				+ did + " or aid=" + aid + " or tid=" + tid + ")";
		System.out.println(sql);
		rs = SqlQuery(sql);
		String giftrelated[] = new String[3];
		int i = 0;
		while (rs.next()) {
			giftrelated[i] = rs.getString("gname");
			i++;
			if (i == 3) {
				break;
			}
			//System.out.println(giftrelated[1]);
		}
		return giftrelated;
	}
	
	public int did(String day) throws SQLException {
		String sql="select did from day where dayname="+"'"+day+"'";
		rs = SqlQuery(sql);
		int did=0;
		if(rs.next()){
			did=rs.getInt("did");
		}
		return did;
	}
	
	public int aid(String age) throws SQLException {
		String sql="select aid from age where agename="+"'"+age+"'";
		rs = SqlQuery(sql);
		int aid=0;
		if(rs.next()){
			aid=rs.getInt("aid");
		}
		return aid;
	}
	
	public int tid(String tag) throws SQLException {
		String sql="select tid from tag where tagname="+"'"+tag+"'";
		rs = SqlQuery(sql);
		int tid=0;
		if(rs.next()){
			tid=rs.getInt("tid");
		}
		return tid;
	}

}
