package com.MyWeb.servlet;

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.SQLException;

import com.MyWeb.dao.ZanDao;
//import com.MyWeb.util.Constant;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

public class ZanServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public void doBusiness(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//String UserName = new String(request.getParameter("userName").getBytes( "ISO-8859-1"), "UTF-8"); //获得中的用户名
		String UserName=(String)request.getSession().getAttribute("userName");
		String GiftName = new String(request.getParameter("GiftName").getBytes( "ISO-8859-1"), "UTF-8"); // 获得传过来的礼品名字	
		String mark=request.getParameter("mark");
		//中文解码
		//String gnum=request.getParameter("gnum");
		ZanDao zd=new ZanDao();
		try {
			int flag=zd.ZanExist(UserName, GiftName);
			if(flag==0){
				int uid=zd.Uid(UserName);
				int gid=zd.Gid(GiftName);
				zd.ZanAdd(uid, gid);
				zd.HotAdd(GiftName);
				String ghot=zd.ZanAmount(gid);//点赞数量
				request.getSession().setAttribute("ghot"+mark, ghot);
				//request.getSession().setAttribute("zan","alert('点赞成功');" );
				//System.out.println("ghot"+mark);
				//System.out.println(ghot);
				
				//request.getSession().setAttribute("zan","yes" );
				
				//PrintWriter out = response.getWriter();
				//out.print("<script language='javascript'>alert('提交成功');</script>");
							
				//request.setAttribute("info", "点赞成功 !");
				//request.setAttribute("path", "Main.jsp");
				//forward(Constant.SUCCESS,request,response);
				JOptionPane.showMessageDialog(null, "点赞成功");
				redirect("/Main.jsp", request, response);
				//PrintWriter out = response.getWriter();
				//out.print("<script language='javascript'>alert('the name doesnot exit');window.location.href='Main.jsp';</script>");
								
			}else{
								
				//response.setContentType("text/html; charset=UTF-8");
				//PrintWriter out = response.getWriter();
				//out.println("<script>alert(\"已点过赞，无法再点赞\"); </script>");
				//request.setAttribute("info", "已点过赞，无法再点赞 !");
				//forward(Constant.FAILURE,request,response);
				
				JOptionPane.showMessageDialog(null, "已点过赞，无法再点赞");
				redirect("/Main.jsp", request, response);
				
				
			//“您已经支持过该礼品，无法再点赞”
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 取得点赞礼品的id（名称）
	// 进行数据库操作只能+1，再点击无效

}
