package com.zk.myservlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletConfig extends HttpServlet{

	private ServletConfig config;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.�õ�ServletConfig����ĵ�һ�ַ�ʽ
		String encoding1=config.getInitParameter("encoding");
		System.out.println(encoding1);	
		
		//2.�õ�ServletConfig����ĵڶ��ַ�ʽ
        //getServletConfig()������Servlet�ӿ� �ж����,GenericServlet��д�˸÷���
		String encoding3=this.getServletConfig().getInitParameter("encoding");
		System.out.println(encoding3);
		
		
		//3.�õ�ServletConfig����ĵ����ַ�ʽ
        //HttpServlet�̳���GenericServlet��GenericServletʵ����ServletConfig�ӿ�
        //ServletConfig�ӿ�����getInitParameter()������GenericServlet��д�˸÷���
		String encoding2=this.getInitParameter("encoding");
		System.out.println(encoding2);
	}	
}
