package com.MyWeb.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doBusiness(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doBusiness(request, response);
	}

	public void doBusiness(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}
	
	public void forward(String url,HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher(url).forward(request, response);
	}
	
	public void redirect(String url,HttpServletRequest request, HttpServletResponse response) throws IOException{
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"";
		response.sendRedirect(basePath+url);
	}
	public String getBasePath(HttpServletRequest request) {
		String basePath = request.getScheme() + "://" + request.getServerName()
				+ ":" + request.getServerPort() + request.getContextPath();
		return basePath;
	}
}
