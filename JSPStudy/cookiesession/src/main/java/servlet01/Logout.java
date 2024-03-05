package servlet01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// request.getSession()은 타입이 HttpSession session 객체임
		// 1. 세션데이터 전부 삭제하기
		request.getSession().invalidate();  
		// http://localhost:8080/cookiesession/Main.jsp으로 가면 null니 환영합니다--> 세션삭제된 것임
		
		
		// 2. Loginform.jsp로 redirect방식으로 이동
		response.sendRedirect("Loginform.jsp");
	
	
	
	
	}

}
