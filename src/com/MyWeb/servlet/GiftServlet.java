package com.MyWeb.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MyWeb.dao.GiftDao;

/**
 * Servlet implementation class GiftServlet
 */

public class GiftServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public void doBusiness(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id"); // 获得传过来的id值
		GiftDao gd = new GiftDao();
		try {
			String[] a = new String[9];
			a = gd.GiftPic(id);
			request.getSession().setAttribute("PicNum1", a[1]);
			request.getSession().setAttribute("PicNum2", a[2]);
			request.getSession().setAttribute("PicNum3", a[3]);
			request.getSession().setAttribute("PicNum4", a[4]);
			request.getSession().setAttribute("PicNum5", a[5]);
			request.getSession().setAttribute("PicNum6", a[6]);
			request.getSession().setAttribute("PicNum7", a[7]);
			request.getSession().setAttribute("PicNum8", a[8]);
			String[] b = new String[9];
			b = gd.GiftName(id);
			request.getSession().setAttribute("NameNum1", b[1]);
			request.getSession().setAttribute("NameNum2", b[2]);
			request.getSession().setAttribute("NameNum3", b[3]);
			request.getSession().setAttribute("NameNum4", b[4]);
			request.getSession().setAttribute("NameNum5", b[5]);
			request.getSession().setAttribute("NameNum6", b[6]);
			request.getSession().setAttribute("NameNum7", b[7]);
			request.getSession().setAttribute("NameNum8", b[8]);
			String[] c = new String[9];
			c = gd.GiftLink(id);
			request.getSession().setAttribute("LinkNum1", c[1]);
			request.getSession().setAttribute("LinkNum2", c[2]);
			request.getSession().setAttribute("LinkNum3", c[3]);
			request.getSession().setAttribute("LinkNum4", c[4]);
			request.getSession().setAttribute("LinkNum5", c[5]);
			request.getSession().setAttribute("LinkNum6", c[6]);
			request.getSession().setAttribute("LinkNum7", c[7]);
			request.getSession().setAttribute("LinkNum8", c[8]);
			String[] zan = new String[9];
			for (int i = 1; i < 9; i++) {
				zan[i] = gd.GiftZan(b[i]);
				request.getSession().setAttribute("ghot" + i, zan[i]);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// forward("/Main.jsp", request, response);
		redirect("/Main.jsp", request, response);
	}

}
