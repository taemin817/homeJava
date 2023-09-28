package Seller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Page.PageService;
import Page.PageHandler;
import org.json.JSONArray;

@WebServlet("/seller2.do")
public class GoodsSellerServlet2 extends HttpServlet {

	sellerService2 s = new sellerService2();
	PageService ps = new PageService();
	String p = null;
	int currentPage = 1;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");

		p = req.getParameter("p");
		if (p != null) {
			currentPage = Integer.parseInt(p); // PageHandler에 넘겨주는 값
		}
		// 1열의 갯수 추출
		int totRecords = ps.getTotalCnt();
		int pageSize = 4; // 한페이지에 4개만 보여주겠다
		int grpSize = 3; // 페이지 번호를 3개까지만 보여주겠다
							// 총데이터 갯수
		PageHandler handler = new PageHandler(currentPage, totRecords, pageSize, grpSize);

		req.setAttribute("handler", handler);

		req.getRequestDispatcher("/WEB-INF/views/seller2.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		p = req.getParameter("p");
		if (p != null) {
			currentPage = Integer.parseInt(p); // PageHandler에 넘겨주는 값
		}
		int pageSize = 4; // 한페이지에 4개만 보여주겠다
		JSONArray list = s.getListPage(currentPage, pageSize);

		req.setAttribute("list", list);

		System.out.println(list);
		resp.getWriter().println(list);
	}
}
