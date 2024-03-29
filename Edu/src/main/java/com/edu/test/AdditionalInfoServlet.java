package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addInfo")
public class AdditionalInfoServlet extends HttpServlet{
// 인터페이스에서 제공하는 메서드 중에서 질의 문자열이나 추가 경로 정보를 추출하는 메소드들을 실행한 후 결과값을 확인하는 예제
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head><title>Resquest 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>추가적인 정보 요청</h3>");
		out.print("Request Method : " + req.getMethod() + "<br/>");
		// 클라이언트의 요청방식을 알고자 할 때 사용. 명시되어 있지 않으면 GET방식으로.
		out.print("Path Info : " + req.getPathInfo() + "<br/>");
		out.print("Path Translated : " + req.getPathTranslated() + "<br/>");
		out.print("Query String : " + req.getQueryString() + "<br/>");
		// 요청 URL에서 ? 기호를 찾아 ? 다음에 있는 문자열 전체를 추출하여 반환
		out.print("Content Length : " + req.getContentLength() + "<br/>");
		// 클라이언트가 요청한 요청정보 몸체에 있는 데이터의 길이를 추출
		out.print("Content Type : " + req.getContentType() + "<br/>");
		// 요청정보 몸체에 있는 데이터의 문서타입을 추출
		out.print("</body></html>");
		out.close();
	}
}
