package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headerInfo")
public class HeaderInfoServelt extends HttpServlet{
//  인터페이스에서 제공하는 메서드를 이용해 헤더 정보들을 추출한 후 결과값을 확인하는 예제
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head><title>Resquest 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>요청 헤더 정보</h3>");
		Enumeration<String> em = req.getHeaderNames();
		// 요청정보의 헤더 안에 있는 정보 중 헤더 이름들만 모아 enumeration 객체에 담아 반환하고 em 변수에 저장
		while(em.hasMoreElements()) {	// em이 가리키는 enumeration 객체의 커서 다음에 데이터가 있으면 true, 없으면 false 반환
			String s = em.nextElement();	// em의 커서 다음에 있는 요소를 반환하고 커서를 다음 요소로 이동시킴
			out.println(s + " : " + req.getHeader(s) + "<br/>");		// 헤더의 값을 추출
		}
		out.print("</body></html>");
		out.close();
	}
}
