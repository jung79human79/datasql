package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	//  FrontController--> 자원을 많이 차지하는 / 돈을 많이 받아야하는 매니저
	
	// join login selectall logout --> 일반클래스 /자원을 적게 차지하는 / 알바생
	
	// command 인터페이스 --> 메뉴얼 /규격
	
	// 반드시 각 클래스에서 상속해야함 (오버라이드) 
	public String execute(HttpServletRequest request, HttpServletResponse response);
	
	
	
	
	

}
