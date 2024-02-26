package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex07ChangeBg")
public class Ex07ChangeBg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("EUC-KR");
		
		String result1 = request.getParameter("data");
		
		System.out.println("컬러는 :"+result1);  // 변수명을 문자열과 연결할 시 + 기호사용  //콘솔에 색깔명이 아닌 헥사코드로 표현된다 // '컬러는 :#f31212'
		
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		
		out.print("<style>");  //width: 100px;  height: 100px;
		// 정재은의 크기에 맟추어 색을 입히자
		out.print("#aa{ background-color: "+result1+"; color:white; font-size:20px; display: inline;}"); 
		
		out.print("</style>");
		out.print("</head>");
		
		//out.print(" <body bgcolor ="+result1+"> "); // 속성에 변수명을 넣을 시 +result1+  //전체바디영역을 색깔변경
		out.print("<body>");
		
		out.print("<h1>my home</h1>");
		out.print("<div id=aa>정재은</div>");
		out.print("<br></br>");
		out.print("내 홈페이지에 온 것을 환영합니다.");

		out.print("</body>");
		out.print("</html>");
		
	}

}
