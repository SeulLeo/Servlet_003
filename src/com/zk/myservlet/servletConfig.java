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
		//1.得到ServletConfig对象的第一种方式
		String encoding1=config.getInitParameter("encoding");
		System.out.println(encoding1);	
		
		//2.得到ServletConfig对象的第二种方式
        //getServletConfig()方法在Servlet接口 中定义的,GenericServlet重写了该方法
		String encoding3=this.getServletConfig().getInitParameter("encoding");
		System.out.println(encoding3);
		
		
		//3.得到ServletConfig对象的第三种方式
        //HttpServlet继承了GenericServlet，GenericServlet实现了ServletConfig接口
        //ServletConfig接口中有getInitParameter()方法，GenericServlet重写了该方法
		String encoding2=this.getInitParameter("encoding");
		System.out.println(encoding2);
	}	
}
