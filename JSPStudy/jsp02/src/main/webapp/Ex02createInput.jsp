<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">

<!--1.html이 보내주는 데이터 꺼내기 

3. 꺼내온 데이터의 값에 따라 아이템을 입력할수 있는 input태그 생성하기
2. 주제를 입력하수 있는 input태그 필요 
4. 데이터를 보낼 수있는 구조로 만들어 전달!!-->



	<%
	//request.setCharacterEncoding("utf-8");
	//html이 보내주는 데이터 꺼내기 
	int num = Integer.valueOf(request.getParameter("num"));
	//PrintWriter out = response.getWriter();
	%>

	
	<fieldset>
	
	

<legend>랜덤 담청 작성</legend> 
<form action="Ex02randomwinner.jsp" method="post">
주제:<input type="text" name="title" value="오늘의 점심메뉴는?"><br>
<%
for (int i = 1; i >= num; i++) { 
		// 아이템의 내용을 입력할수 있는  input태그 생성
		//1.for문의 영역을 완벽하게 구분하여 작성
		//2. 내장갹체인 out를 사용하여 태그를 입력한다
	
		out.print("<input type='text' name ='item'><br>");
		
	}

%>
    <br>
	<input type="submit" value="시작">

</form>
</fieldset>

</body>
</html>