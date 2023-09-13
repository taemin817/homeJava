package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest3")
public class QueryTest3Servlet extends HttpServlet {
// get과 post의 깨진 한글 복원 방법이 다름
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=UTF-8");
		// 서버에서 클라이언트로 보내는 응답을 utf-8로 처리. get 전에 사용
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>get 방식으로 요청</h1>");
		String name = req.getParameter("name");
		out.print("이름 : " + name + "<br/>");
		out.println("</body></html>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>질의 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>post 방식으로 요청</h1>");
		req.setCharacterEncoding("UTF-8");
		// 클라이언트가 보낸 정보를 서버 쪽에서 utf-8로 처리. get 전에 사용
		String name = req.getParameter("name");
		out.print("이름 : " + name + "<br/>");
		out.println("</body></html>");
		out.println("</body></html");
		out.close();
	}
}
