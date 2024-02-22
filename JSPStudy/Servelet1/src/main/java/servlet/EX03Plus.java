package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EX03Plus")
public class EX03Plus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//html에서 넘겨주는 데이터 꺼내기 -> 2개의 데이터
	// -->꺼내온 데이터 변수에 저장하기	
	
		// 형태을 변환하는 형변환 --> Integer.valueOf()
		int result1 = Integer.valueOf(request.getParameter("data1"));
		int result2 = Integer.valueOf(request.getParameter("data2"));
		// 같은 코드 --> Integer.parseInt(request.getParameter("data1"))
		
	
	 //2. 꺼내온 데이터 연산진행 -> "3"+"7" ->"37" --> 문자열 더하기
		
		int total = result1+result2;
		
     //3. 화면에 결과값이 출력되도록 만들기
	
	PrintWriter out = response.getWriter();
	out.print(total);
	
	
	}

}
