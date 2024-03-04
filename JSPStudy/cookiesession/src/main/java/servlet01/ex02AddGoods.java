package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// --> 서블릿파일 생성시 url 맵핑가능하다 (next버튼 눌러서~)
// /가 없으면 다음 페이지로 넘어가지 않기 때문에 실수 방지
@WebServlet("/AddGoods")
public class ex02AddGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		//0.쿠키를 지우고 싶다면?
		// --> 쿠키데이터 전부 꺼내오기
		// --> name이 product로 시작하는 데이터들만
		// -->setMaxAge(0)
		
		
		
		// 1.요청받은 데이터를 꺼내오기 --> request
		// -->네임값은 하나 꺼내야하는 밸류는 여러개
		
		String[] products = request.getParameterValues("product");
		
		// 2.요청받은 데이터의 갯수 만큼 쿠기 생성하기
		for (int i=0; i<products.length; i++){
			Cookie cookie = new Cookie("products"+i, products[i]);
			
		// ** name값은 중복 불가능하다
		// 3. 요청받은 데이터의 갯수만큼 쿠키를 보내주기
			
			response.addCookie(cookie);
		}
		
		
	
		
		// 4. shop.jsp 페이지로 이동
		// Redirect(요청2번/응답2번 )vs forward(요청1번/응답1번)
		// Redirect -> url 변화됨 ,데이터 유지 안됨
		// forward -> url 변화안됨 , 데이터 유지됨
		// 예)114전화 
		response.sendRedirect("Shop.jsp");
		
		// Shop.jsp에서 실행해야함 요청데이터를 받아야 하므로
		
		
		

	
	
	
	
	}

}
