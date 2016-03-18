package com.MyWeb.servlet;


import java.sql.SQLException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MyWeb.dao.IntroduceDao;

/**
 * Servlet implementation class IntroduceServlet
 */


@WebServlet("/IntroduceServlet")
public class IntroduceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@SuppressWarnings("unused")
	private void Introduce(HttpServletRequest request,
			HttpServletResponse response) {
		IntroduceDao ind=new IntroduceDao();
		try {
			String name = request.getParameter("name");
			//获取传过来的name值
			String[] GIntroduce=ind.Introduce(name);
			//此处name为main.jsp页面传递的礼品名称
			request.setAttribute("giftPic", GIntroduce[0]);
			request.setAttribute("giftName", GIntroduce[1]);
			request.setAttribute("giftLink", GIntroduce[2]);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
