package com.MyWeb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.MyWeb.model.User;
import com.MyWeb.service.UserService;
import com.MyWeb.util.Constant;

public class UserServlet extends BaseServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserService userService = new UserService();

	//flag为网页传过来的标志，以此标志进行操作判断
	public void doBusiness(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		String flag = request.getParameter("flag");
		if ("doAdd".equals(flag)) {
			doAdd(request, response);
		}else if ("login".equals(flag)) {
			login(request, response);
		}
	}

	//登陆操作
	private void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		HttpSession session = request.getSession();
		String userName = new String(request.getParameter("userName").getBytes( "ISO-8859-1"), "UTF-8"); 
		String password = request.getParameter("password");
        User user = userService.loginCheck(userName, password);
		if(user!=null){
			//当用户存在时，将用户名放到Session
			//session.setAttribute("user", user);
			//将userName放置在会话中
			session.setAttribute("userName", userName);
			//转到对应的网址，即主页面
			//request.setAttribute("path", "Main.jsp" );
			//request.setAttribute("info", "登陆成功");
			//forward(Constant.SUCCESS,request,response);
			forward("HotGiftServlet",request,response);//登陆成功后查询热门礼品再到主页面
		}else{
			//说明数据库不存在这样的用户，密码或者用户名输入错误
			request.setAttribute("info", "帐号或密码错误 !");
			forward(Constant.FAILURE,request,response);
		}
	}

	//注册用户操作
	private void doAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = new String(request.getParameter("userName").getBytes( "ISO-8859-1"), "UTF-8"); 
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String age = request.getParameter("age");
		String tag = request.getParameter("tag");
		User user = new User(userName,password,sex,age,tag);
		int flag = userService.add(user);
		if (flag == 0) {
			request.setAttribute("info", "注册失败 !");
			forward(Constant.FAILURE,request,response);
		} else if (flag == 1) {
			request.setAttribute("info", "注册成功 !");
			request.setAttribute("path", "Login.jsp");
			forward(Constant.SUCCESS,request,response);
		} else {
			request.setAttribute("info", "此帐号已经存在 !");
			forward(Constant.FAILURE,request,response);
		}
		
	}

}
