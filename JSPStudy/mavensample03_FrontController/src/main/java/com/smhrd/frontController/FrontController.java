package com.smhrd.frontController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.controller.Command;
import com.smhrd.controller.Join;
import com.smhrd.controller.Login;
import com.smhrd.controller.Logout;
import com.smhrd.controller.SelectAll;
import com.smhrd.database.DAO;
import com.smhrd.model.MemberVo;

@WebServlet("*.do")
public class FrontController extends HttpServlet {

	// 앞으로는 모든 요청은 FC를 거쳐서만 넘어갈 수있게끔 설계
	// 이유는??
	// >> 중복되는 코드 방지
	// >> HttpServlet 매우 무겁고 자원를 많이 차지한다
	// >> Servlet역할을 하는 파일을 한개만 놔둘거임
	// >> Servlet은 5개를 관리하는 1명의 호텔 매니저
	// >> class는 각 호텔의 직원
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("들어옴");
		// 1. uri 가져오기 ==요청경로
		String uri =request.getRequestURI();
		System.out.println("요청 uri>> " + uri);  //요청 uri>> /web/Join.do
		
		// 2.cp(ContextPath) 가져오기  ==요청경로
		String cp =request.getContextPath();
		System.out.println("요청 cp>> " + cp);    //요청 cp>> /web
		System.out.println(cp.length());
		
		// 3. uri에서 cp 자르기
		// ex) /web/Login.do --> Login.do
		
		String path= uri.substring(cp.length()+1);
		System.out.println("자른 path>> " + path);   //자른 path>> Join.do
		
		// 중복코드1 --> 한글인코딩 잡아주기
		request.setCharacterEncoding("utf-8");
		
		
		// 최종경로 전역변수로 두기
		String finalpath = null;
		
		
		//4.최종경로가 무엇으로 끝나느지에 따라 서로 다른 기능을 실행
		
		//4-1 Join.do와 경로가 같다면 회원가입 기능 실행
		Command com = null;
		if(path.equals("Join.do")) {
			 com = new Join();		
		}else if(path.equals("Login.do")) {
			// Login class 생성
			 com = new Login();	
		}else if(path.equals("Logout.do")) {
			 com = new	Logout();		
		}else if (path.equals("SelectAll.do")){
			 com = new SelectAll();
		}
		
		finalpath = com.execute(request, response);
		
		// 중복코드2 --> 넘어가는 페이지
		if(finalpath.contains("redirect:/")) {
			
			// ex) redirect:/main
			// substring or replace or  replaceAll or split 등등
			// 다양한 stringmethod 사용하여 해결가능
			response.sendRedirect(finalpath.split("/")[1]+ ".jsp");
			
		}else {
		RequestDispatcher rd = request.getRequestDispatcher(finalpath+".jsp");
		rd.forward(request, response);
		}
		
		
		
		
		
		
		
	}
	

}
