package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// annotation 
// 주석처럼 사용되는 기능 --> 차이점 : 무언가를 실제로 실행할수 있는 기능을 가지고 있다
// url 맵핑 기술 제공
// @WebServlet("/EX01_PRINT")
// @WebServlet : url 맵핑 기술
// /기호는 반드시 존재 맵핑에게 인지를 주는 것
@WebServlet("/PRINT")
public class EX01_PRINT extends HttpServlet {
	
	// 컴파일 (.java -> .class) 과정에서 데이터 저장시 빠르게 정리할수 있는 
	// 일종의 아이디 지정!
	private static final long serialVersionUID = 1L;

	
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.한글 인코딩 작업
		response.setContentType("text/html; charset=utf-8");
		
		// 웹 화면에 출력문 띄우기 -->도구필요
		PrintWriter out = response.getWriter();
		
		// out.print("hello world!!");
		
		// 응답전에 한글 인코딩해야함
		//out.print("정재은");
		
		// 태그 출력 가능 위의 코드 setContentType("text/html) 주었으므로~
		out.print("<h1>정재은</h1>");
	}

}
