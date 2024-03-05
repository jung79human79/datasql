<%@page import="java.util.ArrayList"%>
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
// jsp에서는 Session도 내장객체--> 생성할 필요없다

// 1. 세션안의 데이터를 꺼내오기
// 강제 형변환 

	ArrayList<String> list = (ArrayList)session.getAttribute("testsession");

// 세션안에 저장된 데이터를 꺼내오려면 반드시 다운 캐스팅해야 원하는 자료를 가져올 수있다

//다운 캐스팅 -->  업캐스팅 객체를 다시 본래의 자료형으로 강제로 형변환 하는 것

// 2. 출력하기
	out.print(list.get(0));


//    http://localhost:8080/cookiesession/Ex02_GetSession.jsp
%>


</body>
</html>