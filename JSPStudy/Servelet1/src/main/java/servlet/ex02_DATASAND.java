package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex02_DATASAND")
public class ex02_DATASAND extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	// 해당 HttpServlet에서만 가능한 매서드 --> protected
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글에 대한 인코딩 작업 --> 한글 요청 받아들인 것에 대한 인코딩
		response.setContentType("text/html; charset=utf-8");
		
		// 데이터를 처리하거나 페이지를 이동하기 위하여 사용되는 공간!
		
		// 데이터 가져오기!
		// 요청으로부터 데이터를 가져온다
		// getParameter() 반환값이 스트링
		// 저장 후 html코드를 실행하는게 순서
		
		String result =request.getParameter("data");
		
		// 넘어오는 데이터를 화면에 띄우기
		PrintWriter out = response.getWriter();
		out.print(result);
		
		//System.out.println("data:"+result);
		
		// html화면자체가 클라이의 요청
		// 서버는 서블릿자바코드--> 클라이에게 넘겨준다
		// 맨처음 html을 통해 입력 --> 임이의 데이터라는 네임을 지정 
		// -> 액션을 통해 서블릿으로 간다 같은 이름의 url 맵핑을 찾는다
		// 위에서 아래로 코드 진행
		// request는 html파일로 들어간다 data라는 이름의 파라미터를 가져온다 get
		// data에 적힌 텍스트를 가져와서 스트링으로 변수로 저장 후 프린터로 콘솔에 출력 
		
		
		
	}

}
