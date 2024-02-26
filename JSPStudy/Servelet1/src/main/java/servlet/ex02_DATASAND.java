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
		
		// service()함수는 --> 데이터를 처리하거나 페이지를 이동하기 위하여 사용되는 공간!
		
		// 데이터 가져오기!
		// 요청으로부터 데이터를 가져온다
		// getParameter() 반환값이 스트링
		
		String result =request.getParameter("data");
		
		// 현재 자바코드를 저장 후 html코드를 실행해서 text값을 넣는 것이 순서
		
		// 1.넘어오는 데이터를 화면에 띄우기
		// 입력한 값 서버로 전송하여 html문서로 출력
		// 새로운 창이 뜨면서 text가 반영된다 / 현재창에서 화면이 변경(text가 반영) --> 결국 둘 다 동기방식 통신
		PrintWriter out = response.getWriter();
		out.print(result);
		
		
		// 2.넘어오는 데이터를 화면에 띄우기
		// 입력한 값 서버로 전송하여 console창에 출력
		//System.out.println("data:"+result);  --> 콘솔출력
		
		// html코드 --> 화면자체가 클라이언트의 요청이라고 볼수있다
		// 서블릿자바코드는 웹 프로그래밍 --> 값을 코드대로 프로그램해서 서버로 전송 --> 새로운 html문서를 생성 --> 브라우저 --> 클라이에게 넘겨준다
		// 내 생각 html코드에서 입력한 값을 서블릿이 코드대로 프로그램해서 html문서를 생성하고 서버에게 주고 서버는 클라이에게 주는데 중간에 브라우저가 이쁘게~
		// 서버는 톰캣??
		// 맨처음 html을 통해 text 입력 --> input의 네임 속성에 임의의 값인 data를 지정했으니 그 데이터를 매개변수로 request.getParameter매서드가 실행가능상태가 됨
		// form태그의 action 속성을 통해 서블릿으로 간다 같은 이름의 url 맵핑을 찾는다
		// 서브릿 코드가 위에서 아래로 코드 진행하면서 input의 네임 속성에 임의의 값인 data를 지정했으니 그 데이터를 매개변수로 request.getParameter매서드가 실행한다
		// text값이 변수에 저장되고 --> 그 값을 반영한 새로운 html 코드를 생성한다 --> 새로운 창이 브라우저에 의해 생성된다 ??-->
		// 혹은 새로운 페이지가 생성되는게 아니고 현재 페이지에서 그대로 연산된 값이 출력된다 --> 동기방식 통신 (전체화면 깜빡임)
		// request는 html파일로 들어간다 data라는 이름의 파라미터를 가져온다 get
		// data에 적힌 텍스트를 가져와서 스트링타입의 변수로 저장 후 프린터함수로 콘솔에 출력 혹은  response.getWriter()함수로 html문서로 출력한다. 
		
		
		
	}

}
