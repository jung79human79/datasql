<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- name은 동기통신 -->
	<input id ="data" type = "text">
	<button class = "btn">데이터전송</button>
	
	<!-- 1.  jquery 라이브러리 가져오기-->
	<script src ="assets/js/jquery.min.js"></script>
	
	<script type ="text/javascript">
	
	// js코드를 작성하는 공간
	// j쿼리 문법기준
	
	// 1) 버튼 태그를 dom형식으로 가져와서 클릭했을 때 이벤트 등록
	$(".btn").on("click",function () {
		//2) 클릭시 input태그를 dom형식으로 가져와서 안쪽에 입력된 글자 가져오기
		let sendData = {
			"sendData":$("#data").val()
			}
		//3> 콘솔에 출력하기
		console.log(sendData);
		// 4) 비동기 통신 사용하여 서블릿으로 데이터 전송
		$.ajax({
			// 보내줄 URL
			url : "Ajax",  //ajax?sendData=안녕&
			// 보내줄 데이터
			data : sendData,
			// 전송 방식
			type : "get",
			// 결과값 자료형 지정
			dataType : "json",
			//성공시 실행할 함수 지정
			success: (res)=> {
				console.log("전송 성공");
				console.log("받은 데이터>> " , res);
				console.log("받은 데이터>> " , res.email);
			},
			//실패시 실행할 함수 지정
			error :(e)=>{
				console.log("전송 실패");
            }
			
		})
	 	
		
	})
	

	</script>
	
	



	

</body>
</html>