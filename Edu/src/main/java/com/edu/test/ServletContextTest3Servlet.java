package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextTest3Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		ServletContext sc = this.getServletContext();
		// ServeltContext의 주소값을 추출하여 변수에 저장
		
		ShareObject obj1 = new ShareObject();
		obj1.setCount(100);
		obj1.setStr("객체 공유 테스트 - 1");
		
		sc.setAttribute("data1", obj1);
		// 동일한 웹 애플리케이션에 있는 다른 페이지에서 가져다 사용할 수 있도록 데이터를 등록
		
		ShareObject obj2 = new ShareObject();
		obj2.setCount(200);
		obj2.setStr("객체 공유 테스트 - 2");
		sc.setAttribute("data2", obj2);
		
		out.print("ServletContext객체 데이터 등록을 하였습니다");
		
		out.close();
	}
}
