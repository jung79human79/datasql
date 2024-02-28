<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
 <!-- 오류가 발생할 경우 띄워줄 수 있는 error용 페이지 지정! --> 
 <%@ page errorPage="Ex06_ErrorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	2를 0으로 나누어 볼까요?
	<%=2/0 %>
	 500 – 내부 서버 오류 --> 데이터값의 오류 --> 2/0
	 실행은 여기서 해야함--> <%@ %> 으로 인해 이미지가 띄어지지만 실제 사이트 주소는 여기다 






</body>
</html>