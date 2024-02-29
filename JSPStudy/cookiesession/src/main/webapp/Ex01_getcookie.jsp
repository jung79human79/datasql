<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>쿠키확인페이지</h1>

<%

//getCookies 배열로 반환
Cookie[] result = request.getCookies();

// 반복문
for (int i=0; i<result.length; i++){
	
	out.print(result[i].getName()+ " / "+result[i].getValue() + "<br>");
	
}


%>

<a href="Ex01_removecookie.jsp">쿠키삭제하기</a>




</body>
</html>