package servlet01;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/MainSession")
public class ex03MainSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	// 1. 세션 생성하기 --> 세션은 서버에서 자동으로 id를 발급하므로
	// 우리는 세션을 가져오는 것이다
	// 
		HttpSession session = request.getSession();
		
		// 2. 세션안에 데이터 저장해보기 --> 자동발급된 세션id 안에~
		// 쿠키는 (문자열,문자열)
		// 세션은 (문자열,오브젝트)  --> 오브젝트는 모든 클래스의 최상위 계층이므로 어떤 타입도 들어간다 ->업캐스팅
		// (문자열, object value = list)
		// object value = new ArrayList<String>();  --> 업캐스팅
		// **setAttribute하는 순간 업캐스팅
		// >> 자식클래스가 부모클래스로 자동으로 형변환 
		ArrayList<String> list = new ArrayList<String>();
		list.add("김운비");
		session.setAttribute("testsession", list);
		
		// 3. Ex02_GetSession.jsp로 Redirect방식을 사용해서 이동
		
		response.sendRedirect("Ex02_GetSession.jsp");
		
		
		
		// 4.세션을 삭제하는 방법
		// session.invalidate(); --> 모든 데이터를 삭제하는게 일반적이므로 위의 코드 사용하기
		
		// session.removeAttribute("name값")
		
		
		// 쿠키 ( 장바구니 데이터 / 개인정보트랙킹)
		// 저장위치 : 웹브라우저(클라이->개발자도구)
		// 저장가능한 자료형 : 스트링만 가능
		// 생명주기 : 지정한 생명만큼 유지됨
		// 보안성 : 세션보다는 떨어짐
		// 속도: 데이터 전환 빠름

		// 세션(로그인 정보 유지)
		// 저장위치 : 서버
		// 저장가능한 자료형 : 모든 자료형
		// 생명주기 : 브라우저가 종료되기 전까지 유지
		// 보안성 : 쿠키보다 높음
		// 속도: 느림
		// ** 너무 많이 쓰면 서버속도가 저하
		
		//   http://localhost:8080/cookiesession/Ex02_GetSession.jsp
		
	   // 메인에서 저장이되고 sendRedirect된다 고로 겟세션jsp파일로 이동하면서 페이지 보여준다
	
	
	
	
	
	
	
	
	}

}
