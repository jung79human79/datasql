package com.smhrd.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.database.DAO;
import com.smhrd.model.MemberVo;


@WebServlet("/SelectAllService")
public class SelectAllService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// DAO 생성하기
	    DAO dao = new DAO();
	    
	    // DAO안에 있는 전체조회 기능 사용하기
	   
	    List<MemberVo> list = dao.selectAll();
	    
	   // dao.selectAll().get(0).getEmail();
	    
	    // 조회한 데이터를 request영역에 저장하기
	    
	    request.setAttribute("list", list);
	    
	    // select.jsp로 포워드 방식으로 전송 --> 필히 url주소 확인하자.
	      
	    RequestDispatcher rd = request.getRequestDispatcher("select.jsp");
        rd.forward(request, response);
	    
	    
	    
	    	    
	 
	    
	
	
	
	
	
	
	
	}

}
