package com.MyWeb.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MyWeb.dao.StoryDao;

/**
 * 接受Story.jsp传送的数据，进行数据库查找
 */

public class StoryServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public void doBusiness(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id"); // 获得传过来的id值
		StoryDao sd = new StoryDao();
		try {
			String[] Storyinfo = new String[2];
			String[] rgift = new String[5];
			Storyinfo = sd.Story(id);
			rgift = sd.Rgift(id);

			request.getSession().setAttribute("StoryTitle", Storyinfo[0]);
			request.getSession().setAttribute("StoryContent", Storyinfo[1]);

			for (int i = 0; i < 5; i++) {
				if (rgift[i] == null) {
					rgift[i] = "";
				}
			}

			request.getSession().setAttribute("related1", rgift[0]);
			request.getSession().setAttribute("related2", rgift[1]);
			request.getSession().setAttribute("related3", rgift[2]);
			request.getSession().setAttribute("related4", rgift[3]);
			request.getSession().setAttribute("related5", rgift[4]);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		redirect("/Story.jsp", request, response);
	}
}
