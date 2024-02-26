package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex03_UserInfo")
public class Ex03_UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
				// 1. 요청에 대한 인코딩 작업 post 방식일때
				// 넘겨주는 요청에 대한 한글인코딩이 필요하다
				request.setCharacterEncoding("utf-8");
	
				// 2. 요청에 대한 데이터 꺼내오기
				String job  = request.getParameter("job");
				String gender = request.getParameter("gender");
				// 여러개의 값을 하나의  name값으로 전송할때는 getParameterValues()로 값을 찾아온다
				// --> 해당매소드는 여러개의 데이터를 담아야 하므로 리턴 타입은 String[] 형태이다.--> 스트링배열 타입
				String[] hobby = request.getParameterValues("hobby");
				
				// 3. 콘솔창에 데이터 출력하기
				System.out.println("job : " + job);
				System.out.println("gender : " + gender);
				//System.out.println("hobby : " + hobby);
	            
				for( String data: hobby) {
					System.out.println("hobby : " + data);
					
				}
	
	
	//getParameter() --> 하나의 값을 가져올 때  --> String 타입
	//getParameterValues() --> 하나이상의 값을 가져올 때    String[] 타입
	
	
	
	}

}
