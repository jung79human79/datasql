package servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex00_Create")
public class ex00_Create extends HttpServlet {
	
	// 컴파일 (.java -> .class) 과정에서 데이터 저장시 빠르게 정리할수 있는 
	// 일종의 아이디 지정!
	private static final long serialVersionUID = 1L;
       
	// 기본 생성자 메소드
	// 초기화 작업을 진핼할 수 있는 메소드!
    public ex00_Create() {
    	
        super();
        System.out.println("생성자매서드호출");
    }

	// 서블릿의 시작을 알리는 매서드!
    // 서블릿의 초기화 작업을 진행하는 매서드 - 서블릿 객체 생성시 최초 한번만 진행!
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 매서드호출");
	}

	// 서블릿 종료시 호출되는 매서드--> 종료시 마지막에 한번만 호출되는 매서드
	// 서버탭에서 톰캣을 스탑할때 한번 호출
	public void destroy() {
		System.out.println("destroy 매서드호출");
	}

	// 클라이언트 요청을 받아 서비스를 진행하는 메서드!
	// 여러번 동작이 가능하다!
	// 두 개의 매개변수 (request ,response)
	// 브라저창이 뜨는데 새로고침 할 때마다 service,doGet,doPost 매서드는 호출된다..
	// HttpServletResponse response = HttpServletResponse는 데이터 타입이 객체
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service 매서드호출");
	
		//서비스를 제공하는 형태!
		doGet(request ,response);
		doPost(request ,response);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 응답");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		System.out.println("doPost 응답");
	}

}
