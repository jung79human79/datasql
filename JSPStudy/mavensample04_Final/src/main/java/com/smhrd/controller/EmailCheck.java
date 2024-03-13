package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.database.DAO;
import com.smhrd.model.MemberVo;

public class EmailCheck implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		// 1.요청 데이터 꺼내오기(1개)
		String  email = request.getParameter("email");
		
		// 데이터 1개이므로 데이터를 묶을 필요는 없다
		//MemberVo vo = new MemberVo ();
		
		// 2. dao생성하기
		DAO dao = new DAO();
		
		//3. dao.check() 기능 사용하기 --> dao에 매소드 생성
		 String result = dao.check(email);
		
		// 4.결과값 반환
		
		System.out.println("조회결과 >>"+ result);
		 
		try {
			// try-catch가 필요한 이유는
			// reponse.getwriter()매소드안에 이미 IOException을 사용하려면
			// 예외처리를 하라고 잡혀져 있기 때문이다
			response.getWriter().print(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		 
		 
	
		 return null; // 비동기는 화면전환이 아니므로 이동경로는 null	
		
		
	
	}
	
	
	
	

}
