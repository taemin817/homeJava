package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionTest")
public class SessionTestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		//print() 및 println() 를 통해 텍스트 데이터를 출력. 이를 사용하여 문자열, 숫자 또는 다른 데이터 유형을 파일에 출력할 수 있음
		String param = req.getParameter("p");
		String msg = null;
		HttpSession session = null;
		// 클라이언트로부터 전달된 질의 문자열 중에서 p값을 추출하여 param에 저장
		// msg는 처리가 끝난 다음 브라우저에 출력할 문자열을 가지는 변수
		if(param.equals("create")) {
			session = req.getSession();
			// 세션 객체를 추출하여 변수에 저장
			if(session.isNew()) {
				msg = "새로운 세션 객체가 생성됨";
				// 만약 세션이 존재하지않으면 새로 생성하여 반환
			} else {
				msg = "기존의 세션 객체가 리턴됨";
			}
		} else if(param.equals("delete")) {
			session = req.getSession(false);
			// 세션 객체가 존재하지않으면 null 반환
			if(session != null) {
				session.invalidate();
				// 세션이 존재하면 세션 객체를 삭제
				msg = "세션 객체 삭제 작업 완료";
			} else {
				msg = "삭제할 세션 존재하지 않음";
			}
		} else if(param.equals("add")) {
			session = req.getSession(true);
			// 세션 객체가 존재하지 않으면 새로 생성하여 반환
			session.setAttribute("msg", "메세지입니다");
			msg = "세션 객체에 데이터 등록 완료";
		} else if(param.equals("get")) {
			session = req.getSession(false);
			if(session != null) {
				String str = (String) session.getAttribute("msg");
				msg = str;
				// 세션이 존재하면 session.getAttribute("msg");를 실행하여 msg 추출
			} else {
				msg = "데이터를 추출할 세션 객체 존재하지 않음";
			}
		} else if(param.equals("remove")) {
			session = req.getSession();
			if(session != null) {
				session.removeAttribute("msg");
				// 세션이 존재하면 session.removeAttribute("msg");를 실행하여
				// 세션 객체에서 msg이름으로 등록된 데이터를 삭제
				msg = "세션 객체의 데이터 삭제 완료";
			} else {
				msg = "데이터를 삭제할 세션 객체 존재하지 않음";
			}
		} else if(param.equals("replace")) {
			session = req.getSession();
			session.setAttribute("msg", "새로운 메세지입니다");
			msg = "세션 객체에 데이터 등록 완료";
		}
		out.print("처리결과 : " + msg);
		out.close();
	}
}
