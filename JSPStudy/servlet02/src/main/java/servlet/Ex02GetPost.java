package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02GetPost")
public class Ex02GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 방식일때
		// 넘겨주는 요청에 대한 한글인코딩이 필요하다
		request.setCharacterEncoding("utf-8");
		
		
		
		
		
		// 2.응답화면이 한글이 나오도록 인코딩 작업
		response.setContentType("text/html; charset=utf-8");
		//1.보내주는 데이터 꺼내오기
	    String name = request.getParameter("name");
	    
	    // 3. 출력을 위한 기능 가져오기
	    PrintWriter out = response.getWriter();
	    
	    out.print("입력한 이름 : " + name );	    
}	
}

// 서버의 url 한글인코딩 설정 -->서버의 server.xml 에서 설정
// <Connector URIEncoding = "utf-8" connectionTimeout="20000" maxParameterCount="1000" port="8080" protocol="HTTP/1.1" redirectPort="8443"/>
