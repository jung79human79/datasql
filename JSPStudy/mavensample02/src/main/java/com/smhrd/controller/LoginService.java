package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.database.DAO;
import com.smhrd.model.MemberVo;


@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 한글 인코딩
		request.setCharacterEncoding("utf-8");
		// 요청데이터 2개 꺼내오기
		String email = request.getParameter("email");
	    String pw = request.getParameter("pw");
	    
	    // 요청데이터들을 하나로 묶기
	    // 기본 생성자만 쓰면 된다.
	    // 세트함수로 요청받은 데이터로 값을 덮어씌운다
	    MemberVo vo = new MemberVo ();
	    vo.setEmail(email);
	    vo.setPw(pw);
	   
	    // DAO 생성하기
	    DAO dao = new DAO();
	    
	    // DAO안에 로그인 기능 사용하기 
	    // MemberVo로 리턴을 받는다 // 예전에 자바에서 로그인 정보 받는 것 상기해보면 행을 새로 만드는 int가 아니다
	    MemberVo resultVo = dao.login(vo);
	   
	     // 로그인 성공시 session영역에 회원 정보 저장하기 
	    if(resultVo!=null) {
	    	// 세션 꺼내오기
	    HttpSession	session = request.getSession();
	    	// 세션 데이터 저장하기 (member name값으로 저장)
	    session.setAttribute("member", resultVo);
	    }
	    
	      
	      
	      // main.jsp로 Redirect 방식으로 이동하기 --> 동일 페이지
	     // 포워드로 데이터 보내면 페이지가 달라짐   
	      response.sendRedirect("main.jsp");
	      
	
	}
}
