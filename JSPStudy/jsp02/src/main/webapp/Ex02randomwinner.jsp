<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<fieldset>
<legend>랜덤 담청 결과 </legend>

<!--1.createInput.jsp에서 넘겨주는 타이틀,아이템 데이터 꺼내오기 
2.가지고 온 아이템 갯수에 따라 랜덤으로 한가지 출력 -->


<%
// post방식의 한글 데이터 인코딩 작업하기
request.setCharacterEncoding("utf-8");
// 2.요청값으로부터 데이터 꺼내오기!
String title = request.getParameter("title");
// 다수의 데이터가 하나의 그룹으로 지정되어 있을때 꺼내오는 방법
String[] items =request.getParameterValues("item");

//3. 랜덤수 생성하기
Random rd = new Random(); // import필수
//랜덤 범위 지정 
// items =[a,b,c]
//int random = rd.nextInt(items.length); //3개 -> 0,1,2
String result = items[rd.nextInt(items.length)];

%>

<%=title%><br>
<%=result%>
<%-- <%=items[random]%> --%>



</fieldset>


</body>
</html>