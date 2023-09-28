package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/portalSite")
public class SendRedirectTestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String param = req.getParameter("site");
		if(param.equals("naver")) {
			// name이 site인 코드에서 가져온 value가 naver라면
			resp.sendRedirect("https://naver.com");
			// 네이버로 보냄
		} else if(param.equals("daum")) {
			// name이 site인 코드에서 가져온 value가 daum이라면
			resp.sendRedirect("https://daum.net");
			// 다음으로 보냄
		} else if(param.equals("google")) {
			// name이 site인 코드에서 가져온 value가 google이라면
			resp.sendRedirect("https://google.co.kr");
			// 구글로 보냄
		}
	}
}
