<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 절대값을 리턴하는 메서드 선언문 -->

<!--1.절대값을 구 할 수 있는 메서드 선언  -->
<!-- 2. 해당메서드를 호출하여 결과 확인 -->

<%!

public int abs(int a) {
	//if (a<0) {
	//a=-a;
	//}
	return a>0 ? a : -a ;
}

%>

	5의 절대값 : <%=abs(-5) %><br>
	-7의 절대값 : <%=abs(-7) %>

</body>
</html>