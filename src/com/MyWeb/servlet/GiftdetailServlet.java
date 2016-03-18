package com.MyWeb.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MyWeb.dao.GiftdetailDao;

@WebServlet("/GiftdetailServlet")
public class GiftdetailServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public void doBusiness(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String giftName = new String(request.getParameter("gName").getBytes(
				"ISO-8859-1"), "UTF-8");
		GiftdetailDao gd = new GiftdetailDao();
		String gift[] = new String[4];
		String day[] = new String[6];
		String age[] = new String[5];
		String tag[] = new String[6];
		String giftrelated[] = new String[3];
		String story = null;
		int storyid = 0;
		int did, aid, tid = 0;
		try {
			gift = gd.giftinfo(giftName);
			day = gd.day(giftName);
			age = gd.age(giftName);
			tag = gd.tag(giftName);
			// System.out.println(day[0]);

			did = gd.did(day[0]);
			aid = gd.aid(age[0]);
			tid = gd.tid(tag[0]);
			story = gd.story(giftName);
			storyid=gd.storyid(giftName);
			giftrelated = gd.giftrelated(did, aid, tid);
			request.getSession().setAttribute("gift_name", gift[0]);
			request.getSession().setAttribute("gift_pic", gift[1]);
			request.getSession().setAttribute("gift_about", gift[2]);
			request.getSession().setAttribute("gift_link", gift[3]);
			String dayinfo = "";
			String taginfo = "";
			String ageinfo = "";
			for (int i = 0; i < 6; i++) {
				if (day[i] == null) {
					day[i] = "";
				}
				if (tag[i] == null) {
					tag[i] = "";
				}
				dayinfo = dayinfo + day[i] + "  ";
				taginfo = taginfo + tag[i] + "  ";
			}
			for (int j = 0; j < 5; j++) {
				if (age[j] == null) {
					age[j] = "";
				}
				ageinfo = ageinfo + age[j] + "  ";
			}

			request.getSession().setAttribute("gift_day", dayinfo);
			request.getSession().setAttribute("gift_age", ageinfo);
			request.getSession().setAttribute("gift_tag", taginfo);
			request.getSession().setAttribute("gift_story", story);
			request.getSession().setAttribute("storyid", storyid);
			
			System.out.println(giftrelated[1]);

			for (int k = 0; k < 3; k++) {
				if (giftrelated[k] == null || giftrelated[k].equals(giftName)) {
					giftrelated[k] = "";
				}
			}

			request.getSession().setAttribute("related1", giftrelated[0]);
			request.getSession().setAttribute("related2", giftrelated[1]);
			request.getSession().setAttribute("related3", giftrelated[2]);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		redirect("/Gift.jsp", request, response);
	}

}
