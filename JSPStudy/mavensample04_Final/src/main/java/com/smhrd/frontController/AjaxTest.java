package com.smhrd.frontController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.smhrd.model.MemberVo;


@WebServlet("/Ajax")
public class AjaxTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	System.out.println("요청이 들어옴");
	
	// 비동기 통신으로 들어온 데이터를 꺼내오기
	String data =request.getParameter("sendData");
	System.out.println("데이터확인 >>"+data);
	
	// dao사용해서 db데이터조회하기
	// 조회성공!!
	// 결과값을 반환~~~ --> 중요
	// 비동기 통신을 통해서 결과값을 반환하려면
	// 화면에 반환하고 싶은 데이터가 출력되면 된다
	
	// 출력시 한글 인코딩
	response.setContentType("text/html;charset=UTF-8");
	//1) 출력개체 꺼내오기
	PrintWriter out = response.getWriter();
	//2) 출력해오기
	
	// 조회한 결과 >> email값 tel address
	// 돌려줘야하는 데이터가 여려개일때 
	MemberVo vo = new  MemberVo();
	vo.setEmail("admin");
	vo.setTel("01012345678");
	vo.setAddress("풍암동");
	
	
	// java객체 --> js 객체로 변환
	// json 형태로 변환
	Gson gson = new Gson();
	// 도구 사용하기
	String json= gson.toJson(vo);
	
	
	
	out.print(json);
	
	
	
	
	
	}

}
