<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 1. html에서 보내주는 데이터 꺼내오기 ->요청값(리퀘스트)으로부터 데이터 가져오기
2.꺼내진 데이터 화면에 보이도록 출력  -->

<% 

// 1.post방식 --요청값을 인코딩하는 작업!!
request.setCharacterEncoding("utf-8");
//response.setContentType("text/html; charset=utf-8");  --> pageEncoding="UTF-8"이 이미 들어가 있다
String result =request.getParameter("name");

//PrintWriter out = response.getWriter();




%>

입력된 이름은 : <%=result%>




</body>
</html>