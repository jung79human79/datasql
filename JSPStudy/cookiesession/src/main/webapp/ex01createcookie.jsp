<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	// 쿠기에 대한 작업은 java 언어로 진행해야한다 --> 원래는 서블릿에서 해야한다

	// new Cookie("문자","문자") -->반드시 문자열 --> 공백은 안됨 공백은 문자로 안보므로 오류발생
	// --> 순수문자가 아니라 공백이 들어가는 경우 공백을 포함한 문자를 인코딩한다
	String word = URLEncoder.encode("first cookie");

	// 1. 쿠기생성 --> Cookie라는 객체를 생성
	// 개발자 도구에서 first라는 이름으로 쿠키생성 밸류가 firstcookie
	// (키,밸류)
	Cookie cookie = new Cookie("first", word);

	// 2. 쿠키의 유효기간 설정 --> 기본단위는 초 단위!
	// setMaxAge는 int반환!
	cookie.setMaxAge(3600 * 60 * 24);

	// +)쿠기값 수정하기 --> 공백을 추가 하려면 또다시 testcookie에 대한 인코딩을 해야 한다!
	cookie.setValue("testcookie");

	// 3.(jsp 내부에서 java 언어를 로직으로 사용하기 위한 영역!) => 스크립트릿(서버의 역할)에서 클라이언트에게 쿠키 전달!
	response.addCookie(cookie);
	// +) 쿠키추가 생성하기 ->간단한 방법
	// 아래 2개는 유효기간이 세션 --> 현재
	response.addCookie(new Cookie("test2", "test"));
	response.addCookie(new Cookie("test3", "test"));
	%>

	<h1>cookie 생성하기</h1>

	<a href="Ex01_getcookie.jsp">쿠키확인하기</a>

</body>
</html>