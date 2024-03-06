package com.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smard.database.DAO;
import com.smard.model.MemberVo;


@WebServlet("/joinservice")
public class joinservice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 한글 인코딩 
		request.setCharacterEncoding("UTF-8");
		
		
		//response.setCharacterEncoding("EUC-KR");
		
		// 요청 데이터 꺼내오기(4개)
		String email = request.getParameter("email");
		String pw = request.getParameter("pW");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		
		System.out.println("가져온 데이터 >>" + email + ","+ pw  + "," + tel +","+ address);
		
		// 3.요청데이터를 하나로 묶어주기
		// MVC중 모델을 생성하는 것
		MemberVo vo = new MemberVo(email,pw ,tel ,address);
		
		// 4. dao 객체 생성하기
		DAO dao = new DAO();
		

		//5 .dao 안에 있는 회원가입 기능 사용하기
		 int row = dao.join(vo);
		
		
		if(row>0) {
		request.setAttribute("email", email);
		//6 . 가입성공 했다면 join_success.jsp로 forward방식으로 이동
		
	RequestDispatcher rd = request.getRequestDispatcher("join_success.jsp");
		}else { 
		 //7. 가입 실패시 maim.jsp로 리다이렉트 방식으로 이동
		response.sendRedirect("main.jsp");
		
		}
		//PrintWriter out = response.getWriter();
	
	
	}

}
