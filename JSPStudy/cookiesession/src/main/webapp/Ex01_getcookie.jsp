<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--   -->

<h1>쿠키확인페이지</h1>

<%
// 브라우저
//getCookies 배열로 반환
Cookie[] result = request.getCookies();

// 반복문
for (int i=0; i<result.length; i++){
	// jsp에서는 내장함수를 이용하거나 <% 을 이용해서 html페이지에 표현할수있다 // 물론 태그를 포함해서 표현가능
	out.print(result[i].getName()+ " / "+result[i].getValue() + "<br>");
	
}


%>

<a href="Ex01_removecookie.jsp">쿠키삭제하기</a><br><br>
<a href="ex01createcookie.jsp">쿠키생성하기</a>



</body>
</html>