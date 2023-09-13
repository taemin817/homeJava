package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/netinfo")
public class NetInfoServlet extends HttpServlet{
// 서버와 클라이언트의 네트워크 정보를 추출하는 메서드들을 실행한 후 결과값을 확인하는 예제
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head><title>Resquest 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>네트워크 관련 요청 정보</h3>");
		out.print("Request Scheme : "+req.getScheme()+"<br/>");
		// 클라이언트가 웹서버에 서비스를 요청할 때 사용한 프로토콜 이름을 반환
		out.print("Server name : "+req.getServerName()+"<br/>");
		// 서버의 호스트 이름을 반환. 이름이 없으면 IP주소 반환
		out.print("Server Address : "+req.getLocalAddr()+"<br/>");
		// 클라이언트로부터 서비스를 요청받은 서버의 IP주소 반환
		out.print("Server Port : "+req.getServerPort()+"<br/>");
		// 클라이언트의 서비스를 요청받아 처리하는 서버의 포트번호 반환
		out.print("Client Address : "+req.getRemoteAddr()+"<br/>");
		// 서비스를 요청한 클라이언트의 IP주소를 반환
		out.print("Client Host : "+req.getRemoteHost()+"<br/>");
		// 서비스를 요청한 클라이언트의 호스트 이름을 반환. 이름이 없으면 IP주소 반환
		out.print("Client Port : "+req.getRemotePort()+"<br/>");
		// 서비스를 요청한 클라이언트의 소스 포트 번호 반환
		out.print("</body></html>");
		out.close();
	}
}
