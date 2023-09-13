package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest2")
public class QueryTest2Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html><head><title>질의 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>post 방식으로 요청</h1>");
		
		ServletInputStream input = req.getInputStream();
											// 요청정보의 몸체와 서블릿 프로그램 간에 연결도니 입력스트림을 생성하여 반환 
		int len = req.getContentLength();
					// 요청정보의 몸체에 담겨있는 문자열의 길이 반환
		byte[] buf = new byte[len];
		
		input.readLine(buf, 0, len);
		// input 입력스트림으로부터 줄 단위로 데이터를 읽어온다.
		// input.readLine(한 줄 읽어들인 문자열을 저장할 바이트 배열 지정, 저장소에 저장할 시작 위치, 저장할 문자열의 길이);
		String s = new String(buf);
		
		out.print("전체 문자열 : " + s);
		out.println("</body></html");
		out.close();
	}
}