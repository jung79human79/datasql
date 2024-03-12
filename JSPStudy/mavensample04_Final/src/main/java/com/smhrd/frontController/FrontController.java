package com.smhrd.frontController;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.controller.Command;
import com.smhrd.controller.Join;
import com.smhrd.controller.Login;
import com.smhrd.controller.Logout;
import com.smhrd.controller.SelectAll;
import com.smhrd.controller.Update;
import com.smhrd.database.DAO;
import com.smhrd.model.MemberVo;

@WebServlet("*.do")
public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	// (Command - String) (Command - String) (Command - String)
	// 가변적인 크기 --> <키,밸류> // 순서가 없다
	private HashMap<String, Command> map = new HashMap<String, Command>();

	// 서블릿의 생명주기
	// > 톰캣에서 관리 >>생성~소멸
	// 1)생성자호출 2) init초기매소드 호출 3) 서비스 매소드 4) 디스토리 호출

	@Override
	public void init() throws ServletException {
		// super.init();
		// map자료구조에 경로-실행시켜야되는 클래스 파일들을 하나씩 추가
		map.put("Join.do", new Join());
		map.put("Login.do", new Login());
		map.put("Logout.do", new Logout());
		map.put("SelectAll.do", new SelectAll());
		map.put("Update.do", new Update());
		// 새로운 기능을 만들때마다 map 자료 구조안에
		// 경로 -실행해야하는 클래스 한세트로 묶어서 추가 해주기만 하면 됨

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uri = request.getRequestURI();  //smhrd/

		String cp = request.getContextPath();  //smhrd

		String path = uri.substring(cp.length() + 1);
		//gomain.do
		request.setCharacterEncoding("utf-8");

		String finalpath = null;

		Command com = map.get(path); // map.get("Login.do") --> new Login()

		if (path.startsWith("go")) {
			// go로 시작했다면  dao를 사용하지 않고 .jsp 파일로 이동하겠다
			// gomain.do -->main
			// goupdate.do --> update
			// path --> 일부분만 가지고 오는 로직(로직은 내가 스스로 설계하는 개념!)
			
			finalpath = path.replace("go", "").replace(".do", "");

		} else {
			
			// com --> new Login
			finalpath = com.execute(request, response);
			// [redirect:]/[gomain.do]
		}

		if (finalpath.contains("redirect:/")) {

			response.sendRedirect(finalpath.split("/")[1]);

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/" + finalpath + ".jsp");
			rd.forward(request, response);
		}

	}
}
