package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/hello2")
public class FirstServlet extends HttpServlet{

	public void init(ServletConfig config) throws ServletException{
		System.out.println("init() 실행");
	}
	
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException{
		System.out.println("service() 실행");
		PrintWriter out = arg1.getWriter();
		out.print("Cehck IDE console tap");
	}
}
