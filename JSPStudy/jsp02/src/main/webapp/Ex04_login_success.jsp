<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">
<fieldset>
<!--  로그인 성공시 보이는 화면 로그아웃을 하면 다시 로그인 페이지로 이동-->


<!-- 로그인페이지에서 설정한 action값은 로그인jsp에만 태그의 속성을 전달한다  -->
<!-- 다른 페이지 즉 성공페이지에 가면 태그의 속성을 쓸수 없다 페이지간 공유가 안된다.  -->

<!-- 페이지 요청신호는 한 번주면 끝난다 다른 페이지로 공유 안된다 -> 다시 로그인 페이지로 가서 가져와야 id값을 성공페이지에서 쓸수 있는데  -->
<!-- 그 방식 보다는 로그인.jsp에서 get방식의 query string 문법(주소 키=밸류)으로 성공페이지로 전달하는 코드를 적어주면 처음 html에서의 값들을 주소형태로 가져와서 요청할수 있다  -->
<!-- 이 요청을 받기 위해  request.getParameter함수를 써야한다 -->

<% 
   // 로그인.jsp에서 요청하는 변수를 가져와서 변수에 저장해야 이 변수를 표현할 수 있다 
   // get방식의 쿼리스트링 문법 사용시 데이터 가져오기
    //String id = request.getParameter("id");


  // forward 방식으로 넘어온 데이터 께내오기 --> 요청에 요청이 연속됨 -> 서버에서 자체적으로 요청과 응답를 처리해서 최종적으로 하나만 돌려준다
  // 결국 데이터 공유법이다 --> 퀴리문은 한번씩 간다 공유 안된다?
  // getAttribute의 반환 타입은 오브젝트 이므로 변수에 저장시 형변환
  // 자바에서 클래스 최상위자 오브젝트를 문자열로 넣으면 너무 크니 형변환함
   String id = (String)request.getAttribute("id");
  
%>

<h1><%=id%>님 환영합니다</h1>


<% 
request.setCharacterEncoding("utf-8");
%>

<!--  프로젝트 명이 같은 것이 있으므로 확장자까지 적는다 -->
<a href = "Ex04Login.html">로그아웃</a>

</fieldset>

</body>
</html>