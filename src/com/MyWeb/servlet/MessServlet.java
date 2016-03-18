package com.MyWeb.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MyWeb.dao.MessDao;

@WebServlet("/MessServlet")
public class MessServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public void doBusiness(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String content = new String(request.getParameter("content").getBytes(
				"ISO-8859-1"), "UTF-8");
		String uname = (String) request.getSession().getAttribute("userName");
		MessDao md = new MessDao();
		try {
			// 留言插入数据库操作
			md.addMessage(uname, content);				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		redirect("/servlet/ToMessageBoard", request, response);
	}
}
