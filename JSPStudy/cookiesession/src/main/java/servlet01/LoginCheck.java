package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// post 방식일때
		// 넘겨주는 요청에 대한 한글인코딩이 필요하다
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html; charset=utf-8");
		
		//1.보내주는 데이터 꺼내오기
	    String id = request.getParameter("id");
	    String pw = request.getParameter("pw");
	    // 3. 출력을 위한 기능 가져오기
	    PrintWriter out = response.getWriter();
	    
	    // id pw 일치하는지 조건을 비교
	    if (id.equals("test") && pw.equals("12345")) {
	    	
	    	// 일치히다면 세션을 꺼내오기
	    	HttpSession session	=request.getSession();
	    	// 세션안에 내 이름 집어 넣기
	    	session.setAttribute("nickname", "김운비");
	    	// Main.jsp로 redirect방식으로 이동
	    	response.sendRedirect("Main.jsp");
	    	
	    	
		}else {
			// 일치안하면 Loginform.jsp로 redirect방식으로 이동
			response.sendRedirect("Loginform.jsp");
		}  
	    
	
	    
	    
	    
	
	
	
	
	}

}
