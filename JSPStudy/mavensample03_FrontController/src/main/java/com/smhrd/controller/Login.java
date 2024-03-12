package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.database.DAO;
import com.smhrd.model.MemberVo;

public class Login implements Command{
    
	
	public String execute(HttpServletRequest request, HttpServletResponse response) {
	
	 
	String email = request.getParameter("email");
    String pw = request.getParameter("pw");    
    
    MemberVo vo = new MemberVo ();
    vo.setEmail(email);
    vo.setPw(pw); 
    
    DAO dao = new DAO();    
    
    MemberVo resultVo = dao.login(vo);

    if(resultVo!=null) {
    HttpSession	session = request.getSession();
    session.setAttribute("member", resultVo);
    }        
    return "redirect:/main";		

	}
	
}
