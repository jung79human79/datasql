package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex04operation")
public class ex04operation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int result1 = Integer.valueOf(request.getParameter("data1"));
		
		int result2 = Integer.valueOf(request.getParameter("data2"));
	
	// 선택한 연산자 데이터 추가하기
	
		String result3 =request.getParameter("op");
		
		
	// 연산에 따라 해당연산을 진행할수 있는 로직 -->if문
	// 자바에서는 문자열 비교시 .equals 숫자는 "=="
		
		int rer =0;
		//result3.equals("plus")
	    
		if (result3.equals("plus")) {
	    	rer = result1+result2;
	    }
	    else if (result3.equals("-")) {
	    	rer =result1-result2;
	    }
	    else if (result3.equals("*")) {
	    	rer=result1*result2;
	    }
	    else {
	    	rer=result1/result2;
	    }
		
	
		
		
		
	// 화면에 결과출력
	
		PrintWriter out = response.getWriter();
		out.print(rer);
	// 새로운 페이지가 생성되는게 아니고 현재 페이지에서 그대로 연산된 값이 출려된다
		
		
	}

}
