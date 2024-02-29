<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">
	<!--html에서 보내주는 데이터를 활용하여 로그인이 가능한지 판단하는 페이지!!   
요청을 받고 다시 응답을 해줘야 한다!-->
	
	<%
	// 0. 요청에 대한 인코딩 작업 진행!
	request.setCharacterEncoding("utf-8");
	// 1.요청(post 방식)의 값을 받아오기
	// 변수 저장하는 이유 --> 연산을 하든지 출력하든지 재사용하므로 반드시 변수로 저장
	String id = request.getParameter("id"); // smart
	String pw = request.getParameter("pw");
	
	// 2. 사용자가 입력한 데이터가 로그인이 가능한지 판단!
	if (id.equals("wjdeown") && pw.equals("123")) {
		// 로그인.jsp에서 새롭게 요청을 전달하는 위치
		// 보내고 싶은/공유하고 싶은 데이터를 포함하여 요청한다
		//->get방식에서 사용할 수있는 query string 문법 사용 ? 사용 ----> ? 변수명 = +값(현재페이지에서 다른 페이지로 보내고자 하는 변수)
		// ? 키:밸류 이므로 키값을 성공페이지에서 불러준다 그래야 밸류를 로그인 페이지에서 표현 할 수 있다. 
		
		// 로그인 성공의 상태
		// response --> 응답의 내장함수 --> 내에 sendRedirect라는 함수가 존재 ->jsp에서는 내장함수를 자유롭게 사용가능
		// 근데 프로젝트명만 써도 이동되는 이유 --> 같은 페이지에서 어떤로컬에서 어떤 포트에서 어떤 프로젝트로 가는 것이므로 프로젝트명만 넣어도 이동한다
		// 네이버로 가려면 실은 전체 주소를 적어야 한다
		
		//response.sendRedirect("Ex04_login_success.jsp?id=" + id);
		
		
		
		// forward 방식 : 요청에 대한 내용을 공유하며 새로운 요청을 할 수있는 기법!  -> Dispatch:보내다
		// 주소를 보면 쿼리문은 보안이 약한데 그것이 없이 주소가 보이므로 보안이 좋다 즉 주소창에 키=밸류가 안보인다
		//RequestDispatcher()은 경로를 매개변수로~
		RequestDispatcher rd = request.getRequestDispatcher("Ex04_login_success.jsp");
		// 공유하고자 하는 데이터 연결하기
		request.setAttribute("id", id);
		// forward()는 아래의 2개의 매개변수
		rd.forward(request, response);
		
	} else {
		// 로그인 실패의 상태
		response.sendRedirect("Ex04_login_fail.jsp");
	}
	%>

</body>
</html>