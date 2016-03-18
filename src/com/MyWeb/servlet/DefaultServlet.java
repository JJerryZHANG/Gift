package com.MyWeb.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MyWeb.dao.DefaultDao;
import com.MyWeb.dao.ZanDao;

/**
 * Servlet implementation class DefaultServlet
 */
@WebServlet("/DefaultServlet")
public class DefaultServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public void doBusiness(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String UserName = (String) request.getSession()
				.getAttribute("userName");
		// 根据登陆用户的tag(个性)、age(年龄)来选出礼品信息
		System.out.println(UserName);
		DefaultDao dd = new DefaultDao();
		ZanDao zd=new ZanDao();		
		String tid = dd.Utid(UserName);
		String aid = dd.Uaid(UserName);
		System.out.println(tid);
		System.out.println(aid);
		try {

			String[] pic = new String[9];
			String[] name = new String[9];
			String[] link = new String[9];
			String[] about = new String[9];
			int[] gid = new int[9];
			pic = dd.GiftPic(tid, aid);
			name = dd.GiftName(tid, aid);
			link = dd.GifLink(tid, aid);
			about = dd.GiftAbout(tid, aid);
			gid=dd.GiftId(tid, aid);
			for (int i = 1; i < 9; i++) {
				request.getSession().setAttribute("PicNum" + i, pic[i]);
				request.getSession().setAttribute("NameNum" + i, name[i]);
				request.getSession().setAttribute("LinkNum" + i, link[i]);
				request.getSession().setAttribute("AboutNum" + i, about[i]);				
				request.getSession().setAttribute("ghot"+i, zd.ZanAmount(gid[i]));
			}
			//System.out.println(gid[1]);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		redirect("/Main.jsp", request, response);
	}
}
