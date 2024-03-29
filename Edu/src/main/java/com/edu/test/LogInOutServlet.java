package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logProc")
public class LogInOutServlet extends HttpServlet{
	// 로그인 처리
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		if(id.isEmpty() || pw.isEmpty()) {
			out.print("id / pw를 입력하세요");
			// 유효성 검사하는 코드. 둘 중 하나라도 없다면 메세지 출력후 종료
			return;
		}
		HttpSession session = req.getSession();
		if(session.isNew() || session.getAttribute("id") == null){
			// session.isNew는 getSession으로 객체를 얻어낼 때 기존에 사용하던 세션 객체를 반환하면 false, 새로 생성해 반환하면 true
			// isNew가 true 반환 -> 기존에 세션 객체가 없음 -> 로그인 상태 아님
			session.setAttribute("id", id);
			out.print("로그인 완료");
		} else {
			out.print("현재 로그인 상태임");
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		if( session != null && session.getAttribute("id") != null) {
			// session != null -> 현재 세션 객체가 null인지 확인, id가 null인지 확인
			session.invalidate();
			// 세션 객체를 삭제하는 메서드
			out.print("로그아웃 완료");
		} else {
			out.print("로그인 상태 아님");
		} out.close();
	} 
}
