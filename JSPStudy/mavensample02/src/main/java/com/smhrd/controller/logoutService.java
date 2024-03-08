package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logoutService")
public class logoutService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		// 1.세션 꺼내오기
		HttpSession session = request.getSession();
		
		// 2.세션초기화
		// request.getSession().invalidate();
		session.invalidate();
		
		
		// 3.main.jsp로 이동
		response.sendRedirect("main.jsp");
	
	
	
	}

}
