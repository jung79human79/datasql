<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>쿠키삭제페이지</h1>

<%
// 쿠키는 삭제에 대한 매서드가 존재 안함 ->유효기간을 짧게 수정하여
// 기간만료로 삭제를 진행한다!
// 쿠키삭제의 조건 
//1.생성되어 있는 쿠키와 동일한 이름으로 새로운 쿠키를 생성한다
Cookie cookie1 = new Cookie("first","");

cookie1.setMaxAge(0);
response.addCookie(cookie1);



%>

<a href="Ex01_getcookie.jsp">쿠키확인하기</a>

</body>
</html>