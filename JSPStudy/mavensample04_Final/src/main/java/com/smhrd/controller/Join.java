package com.smhrd.controller;

import javax.print.DocFlavor.STRING;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.database.DAO;
import com.smhrd.model.MemberVo;

public class Join implements Command {
	
	// String타입--> path
	public String execute(HttpServletRequest request, HttpServletResponse response) {
	

	      
	      String email = request.getParameter("email");
	      String pw = request.getParameter("pw");
	      String tel = request.getParameter("tel");
	      String address = request.getParameter("address");
	      
	      MemberVo vo = new MemberVo (email, pw, tel, address);
	      
	      DAO dao = new DAO();
	      
	      int row = dao.join(vo);
	      if(row > 0) {
	      request.setAttribute("email", email);
	      // 포워드 방식은 약속 안넣어도 된다
	        return "join_success";
	       
	      }else {
	    	  
	    	  // Redirect로 이동시 우리만의 약속기호를 앞쪽에 붙여주자
	    	  // redirect:/ >> 우리만의 약속기호! 다른 걸로 바꿔도 상관없음
	    	  return "redirect:/gomain.do";
		
	      }
	     
	
	}
	
	
	
	
}
