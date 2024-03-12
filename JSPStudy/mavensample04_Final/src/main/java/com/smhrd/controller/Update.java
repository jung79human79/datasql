package com.smhrd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.database.DAO;
import com.smhrd.model.MemberVo;

public class Update implements Command{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		//UPDATE B_MEMBER SET PW =?, TEL =? , ADDRESS =? WHERE EMAIL =?
		// 1. 요청데이터 수집
		//---> 3개 + email data  총 4개
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
	    String address = request.getParameter("address");
		
	    MemberVo sessiomvo =(MemberVo)request.getSession().getAttribute("member");		
		String email= sessiomvo.getEmail();
	    
		// 2. 데이터 하나로 묶어주기
		MemberVo vo = new MemberVo(email,pw,tel,address);
		
		//3. dao 생성하기
		DAO dao = new DAO();
		//4 dao.update 기능 사용하기.
		dao.update(vo);
		
		// * 세션안에 있는 데이터를 수정한 데이터로 변경
		// --> 홈페이지 하단을 수정한 데이터로 변경
		//sessiomvo = vo;
		request.getSession().setAttribute("member", vo);
		
		
		// 5.main.jsp 로 redirect로~
	    return "redirect:/gomain.do";
		
	}

}
