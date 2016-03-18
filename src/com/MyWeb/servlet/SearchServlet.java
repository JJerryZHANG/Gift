package com.MyWeb.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MyWeb.dao.SearchDao;
import com.MyWeb.util.Constant;

@WebServlet("/SearchServlet")
public class SearchServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public void doBusiness(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("keyword");
		SearchDao sd = new SearchDao();
		String searchuser[] = new String[4];
		String like[] = new String[3];
		String likename[] = new String[3];
		int flag;

		try {
			flag = sd.isuser(userName);
			// System.out.println(flag);
			if (flag == 1) {
				// 当用户存在时
				searchuser = sd.userinfo(userName);
				like = sd.userlike(userName);
				likename =sd.userlikename(userName);
				
				System.out.println(likename[1]);
				
				request.getSession().setAttribute("search_name", searchuser[0]);
				request.getSession().setAttribute("search_sex", searchuser[1]);
				request.getSession().setAttribute("search_age", searchuser[2]);
				request.getSession().setAttribute("search_tag", searchuser[3]);
				
				request.getSession().setAttribute("like1", like[0]);
				request.getSession().setAttribute("like2", like[1]);
				request.getSession().setAttribute("like3", like[2]);
				
				request.getSession().setAttribute("likename1", likename[0]);
				request.getSession().setAttribute("likename2", likename[1]);
				request.getSession().setAttribute("likename3", likename[2]);

				if (searchuser[1].equals("male")) {
					request.getSession().setAttribute("userpic", "male.png");
				} else {
					request.getSession().setAttribute("userpic", "female.jpg");
				}
				redirect("/User.jsp", request, response);
			} else {
				// 当用户不存在时，不跳转
				request.setAttribute("info", " 查无此人!");
				forward(Constant.FAILURE, request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
