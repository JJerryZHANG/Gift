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

	//flagΪ��ҳ�������ı�־���Դ˱�־���в����ж�
	public void doBusiness(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		String flag = request.getParameter("flag");
		if ("doAdd".equals(flag)) {
			doAdd(request, response);
		}else if ("login".equals(flag)) {
			login(request, response);
		}
	}

	//��½����
	private void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		HttpSession session = request.getSession();
		String userName = new String(request.getParameter("userName").getBytes( "ISO-8859-1"), "UTF-8"); 
		String password = request.getParameter("password");
        User user = userService.loginCheck(userName, password);
		if(user!=null){
			//���û�����ʱ�����û����ŵ�Session
			//session.setAttribute("user", user);
			//��userName�����ڻỰ��
			session.setAttribute("userName", userName);
			//ת����Ӧ����ַ������ҳ��
			//request.setAttribute("path", "Main.jsp" );
			//request.setAttribute("info", "��½�ɹ�");
			//forward(Constant.SUCCESS,request,response);
			forward("HotGiftServlet",request,response);//��½�ɹ����ѯ������Ʒ�ٵ���ҳ��
		}else{
			//˵�����ݿⲻ�����������û�����������û����������
			request.setAttribute("info", "�ʺŻ�������� !");
			forward(Constant.FAILURE,request,response);
		}
	}

	//ע���û�����
	private void doAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = new String(request.getParameter("userName").getBytes( "ISO-8859-1"), "UTF-8"); 
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String age = request.getParameter("age");
		String tag = request.getParameter("tag");
		User user = new User(userName,password,sex,age,tag);
		int flag = userService.add(user);
		if (flag == 0) {
			request.setAttribute("info", "ע��ʧ�� !");
			forward(Constant.FAILURE,request,response);
		} else if (flag == 1) {
			request.setAttribute("info", "ע��ɹ� !");
			request.setAttribute("path", "Login.jsp");
			forward(Constant.SUCCESS,request,response);
		} else {
			request.setAttribute("info", "���ʺ��Ѿ����� !");
			forward(Constant.FAILURE,request,response);
		}
		
	}

}
