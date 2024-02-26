package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex09Login")
public class Ex09Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 응답을 위한 한글 인코딩 작업  --> 반드시 response.getWriter();함수 전에 코딩해야함
		response.setCharacterEncoding("EUC-KR"); 
		
		
		// 로그인을 할 수 있는지 없는지 서비스 제공
		
		// 1. 보내주는 데이터  꺼내오기 --> id, pw
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		//int pw = Integer.valueOf(request.getParameter("pw"));
		
		
		// 2. "smart" / "123" 이라면 --> "smart님 환영합니다"
		//    "smart" / "123" 아니라면 --> "로그인에 실패했습니다" 출력 
		
		PrintWriter out = response.getWriter();
		
		if (id.equals("smart") && pw.equals("123")) {
			out.print("<h1>smart님 환영합니다</h1>");
		}else {
			out.print("<h1>로그인에 실패했습니다</h1>");
		}
		
//		if (id.equals("smart") && pw==123) {
//			out.print("<h1>smart님 환영합니다</h1>");
//		}else {
//			out.print("<h1>로그인에 실패했습니다</h1>");
//		}
	
	
	
	}

}
// 추가 설명 --> 현재 http protocol method 방식은 get방식
// http://localhost:8080/Servelet1/Ex09Login?id=smart&pw=123
// 보안의 문제 --> get방식 내가보내고자 데이터를 그대로 url에 보내준다 --> 보안의 문제




