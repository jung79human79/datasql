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
// 자바언어를 입력 할수 있는 영역


int sum = 0;
for(int i=1; i<=100; i++){
	   sum += i;
}
%>

1~100 까지의 합 : <%= sum %>





</body>
</html>