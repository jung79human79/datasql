<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- uri >> 라이브러리 안에 있는 수많은 도구들 중에 내가 사용할 도구를 작성
  prefix >> 이제부터 가져온 도구의 이름을 정해주는 구간(접두사)
  *core도구-> 변수선언 /조건문 / 반복문 / 화면 출력 등등-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- jstl /el
:자바 스탠다드 태그 라이브러리 / expression language  
태그모양이므로 jsp파일에서 사용하는 라이브러리-->


	<% 
	//1.세션안에 있는 데이터 가져오기
	
	//String nickname =(String)session.getAttribute("nickname"); 
	// jstl /el 을 쓰려면 위의 코드는 필요없음
	
	%>
	<h3>메인페이지</h3>
	
	
	<c:forEach begin="1" end="5" step="1">
	<%--<%=nickname --%>
	${nickname}님 환영합니다.
	${session.nickname}님 환영합니다.
	<!-- el의 장점
		>> request ,session (scope/저장공간 범위) 등등
		해당하는 공간에서 알아서 찾아서 다운캐스팅까지 진행
		>> 화면에 출력  
		>> request는 응답이 오면 종료 session은 브라우저 닫으면 종료
		>> 동일한 nickname이 두곳에 다 있을 경우 범위가 좁은 request에서 찾는다
		>> 그래도 session에서 찾고자 한다면 session.nickname 코딩한다-->
		
	</c:forEach>
	
	<a href="Logout">로그아웃</a>
	

</body>
</html>