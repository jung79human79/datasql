<!-- 4. 지시자 : 페이지의 필요한 설정을 지정할 수있는 영역 ->import 사용  -->
<!-- 지시자 : ArrayList를 스크립트릿에 적으면 자동으로 지시해준다-->
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 1. 스크립트릿 : jsp 내부에서 java 언어를 로직으로 사용하기 위한 영역! ->지역변수나 매서드이다 -->


<%
	int num1 =10;
	int num2 =5;
	int sum = num1+num2;
	ArrayList<String> array = new ArrayList();
	
%>



<!-- 2. 표현식 : java 변수, 매소드를 화면에 출력하기 위하여 사용되는 영역! -->
<!-- 반드시 "="이라는 식을 사용해야 변수가 화면에 출력된다  -->
<!-- 바디태그안이므로 자바코드를 쓰거나 변수를 사용시에는 태그%기호를 쓰는 것이다 -->


<%= num1 %><br>
<%= num2*10 %>

<!--3.선언문: 매소드를 선언하기 위해서 사용하는 영역 ->전역매서드로 만들어진다!! -->
<!--선언문은 java로 변환시 해당 내용들을 전역으로 쓰도록 가장 맨위에 배치한다! -->
<%! 
public int add(int a,int b){
	return a+b;
	
}
%><br>

<%= add(3,7) %>



</body>
</html>

<!-- C:\Users\SMHRD\Desktop\JSPStudy\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\jsp01\org\apache\jsp  -->
<!--.jsp 파일은 .japa 와 .class 파일 확장자로 구성됨 -> html태그안에서 java코딩을 하는 것으로 자바파일을 class로 컴파일 한 후 html코드로 변환한다 -->
<!--서버가 jsp파일 요청을 받으면 서버는 웹컨테이너로 요청을 옮겨 컨테이너 안에서 위의 과정를 거치고 html파일로 최종 변환 ->동기 및 비동기식의 동적환경  -->

