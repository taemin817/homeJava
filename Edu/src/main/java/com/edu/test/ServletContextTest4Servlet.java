package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context4")
public class ServletContextTest4Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		ServletContext sc = this.getServletContext();
		// ServeltContext의 주소값을 추출하여 변수에 저장
		
		ShareObject obj1 = (ShareObject) sc.getAttribute("data1");
		ShareObject obj2 = (ShareObject) sc.getAttribute("data2");
								// 추출되는 값이 Object타입으로 반환되므로 원래 타입인 ShareObject로 캐스팅
		
		out.print("DATA 1 : " + obj1.getCount() + " , " + obj1.getStr() + "<br/>");
		out.print("DATA 2 : " + obj2.getCount() + " , " + obj2.getStr() + "<br/>");
		
		out.close();
	}
}
