package com.MyWeb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MyWeb.dao.MessDao;

/**
 * Servlet implementation class ToMessageBoard
 */
@WebServlet("/ToMessageBoard")
public class ToMessageBoard extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public void doBusiness(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		MessDao md = new MessDao();
		String name[] = new String[255];
		String message[] = new String[255];
		int n = 0;
		n = md.getCount();
		name = md.getUname(n);
		message = md.getContent(n);
		String allMessage = "";
		for (int i = 0; i < n; i++) {
			allMessage = allMessage + "\n" + " "+name[i] + "˵: " + message[i]+ "\n";
		}
		request.getSession().setAttribute("allMessage", allMessage);
		redirect("/MessageBoard.jsp", request, response);
	}

}
