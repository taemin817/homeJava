package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/netInfo")
public class URLInfoServlet extends HttpServlet{
// 인터페이스에서 제공하는 메서드 중에서 URL 정보를 추출하는 메서드들을 실행한 후 결과값을 확인하는 예제
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head><title>Resquest 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>네트워크 관련 요청 정보</h3>");
		out.print("Request URI : "+req.getRequestURI()+"<br/>");
		// 클라이언트가 요청한 문서정보 반환
		out.print("Request URL : "+req.getRequestURL()+"<br/>");
		// 클라이언트가 서비스를 요청한 문서 전체의 정보(URL) 반환
		out.print("Context Path : "+req.getContextPath()+"<br/>");
		// 웹 애플리케이션의 경로 정보 반환
		out.print("Request Protocol : "+req.getProtocol()+"<br/>");
		// 서비스를 처리하면서 사용되는 프로토콜의 구체적인 정보 반환
		out.print("Servlet Path : "+req.getServletPath()+"<br/>");
		// 웹 애플리케이션을 루트 디렉터리(/) 기준으로 서블릿의 경로 반환
		out.print("</body></html>");
		out.close();
	}
}
