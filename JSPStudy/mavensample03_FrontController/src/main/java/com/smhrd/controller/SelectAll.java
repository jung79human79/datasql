package com.smhrd.controller;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.database.DAO;
import com.smhrd.model.MemberVo;

public class SelectAll implements Command {
	
	
	public String execute(HttpServletRequest request, HttpServletResponse response) {

	
    DAO dao = new DAO();
    List<MemberVo> list = dao.selectAll(); 
    request.setAttribute("list", list);   

    
    return "select";

}
	
	
	

}
