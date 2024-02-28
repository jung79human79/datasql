<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- HTML 파일의 요청에 따라 응답을 할수 있는 페이지!! -->

<%

// 일단 Ex03_NaverPage.jsp 페이지으로 가는 것을 콘솔에서 확인 가능하다
System.out.println("Ex03_NaverPage.jsp 실행!!");
//그 후에 네이버로 간다.
response.sendRedirect("http://www.naver.com");







%>







</body>
</html>