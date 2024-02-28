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
	
	// 1.post로 넘어오는 요청에 대하여 인코딩 작업
	request.setCharacterEncoding("utf-8");
	
	//2. 요청에 대한 데이터값 꺼내오기 -> 3개데이터
	int result1 = Integer.valueOf(request.getParameter("data1"));
	int result2 = Integer.valueOf(request.getParameter("data2"));
	String result3 = request.getParameter("op");
	// 3. 가져온 데이터에 대한 로직 처리 -> 연산자에 대한 로직!
	int rer = 0;

	if (result3.equals("+")) {
		rer = result1 + result2;
	} else if (result3.equals("-")) {
		rer = result1 - result2;
	} else if (result3.equals("*")) {
		rer = result1 * result2;
	} else {
		rer = result1 / result2;
	}
		
	%>


<!-- 4. 결과에 대한 출력화면 만들기 -->
	<%=result1 %> <%=result3 %> <%=result2 %> = <%=rer %><br>
	
	<%=result1  + result3 +   result2  + "=" + rer %>






</body>
</html>