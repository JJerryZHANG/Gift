package com.MyWeb.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MyWeb.dao.HotGiftDao;

/**
 * Servlet implementation class HotGiftServlet
 */
@WebServlet("/HotGiftServlet")
public class HotGiftServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public void doBusiness(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HotGiftDao hgd = new HotGiftDao();
		try {
			String[] Hotinfo = new String[3];
			Hotinfo = hgd.Hot();
			request.getSession().setAttribute("HotPic", Hotinfo[0]);
			request.getSession().setAttribute("HotName", Hotinfo[1]);
			request.getSession().setAttribute("HotLink", Hotinfo[2]);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//redirect("/Main.jsp", request, response);
		forward("DefaultServlet",request,response);
	}
}