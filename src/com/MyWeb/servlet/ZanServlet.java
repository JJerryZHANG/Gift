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
		//String UserName = new String(request.getParameter("userName").getBytes( "ISO-8859-1"), "UTF-8"); //����е��û���
		String UserName=(String)request.getSession().getAttribute("userName");
		String GiftName = new String(request.getParameter("GiftName").getBytes( "ISO-8859-1"), "UTF-8"); // ��ô���������Ʒ����	
		String mark=request.getParameter("mark");
		//���Ľ���
		//String gnum=request.getParameter("gnum");
		ZanDao zd=new ZanDao();
		try {
			int flag=zd.ZanExist(UserName, GiftName);
			if(flag==0){
				int uid=zd.Uid(UserName);
				int gid=zd.Gid(GiftName);
				zd.ZanAdd(uid, gid);
				zd.HotAdd(GiftName);
				String ghot=zd.ZanAmount(gid);//��������
				request.getSession().setAttribute("ghot"+mark, ghot);
				//request.getSession().setAttribute("zan","alert('���޳ɹ�');" );
				//System.out.println("ghot"+mark);
				//System.out.println(ghot);
				
				//request.getSession().setAttribute("zan","yes" );
				
				//PrintWriter out = response.getWriter();
				//out.print("<script language='javascript'>alert('�ύ�ɹ�');</script>");
							
				//request.setAttribute("info", "���޳ɹ� !");
				//request.setAttribute("path", "Main.jsp");
				//forward(Constant.SUCCESS,request,response);
				JOptionPane.showMessageDialog(null, "���޳ɹ�");
				redirect("/Main.jsp", request, response);
				//PrintWriter out = response.getWriter();
				//out.print("<script language='javascript'>alert('the name doesnot exit');window.location.href='Main.jsp';</script>");
								
			}else{
								
				//response.setContentType("text/html; charset=UTF-8");
				//PrintWriter out = response.getWriter();
				//out.println("<script>alert(\"�ѵ���ޣ��޷��ٵ���\"); </script>");
				//request.setAttribute("info", "�ѵ���ޣ��޷��ٵ��� !");
				//forward(Constant.FAILURE,request,response);
				
				JOptionPane.showMessageDialog(null, "�ѵ���ޣ��޷��ٵ���");
				redirect("/Main.jsp", request, response);
				
				
			//�����Ѿ�֧�ֹ�����Ʒ���޷��ٵ��ޡ�
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// ȡ�õ�����Ʒ��id�����ƣ�
	// �������ݿ����ֻ��+1���ٵ����Ч

}
