<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="text" id="name" >
	<button>검색</button>
	<div id = "img">
	<!-- 크롤링한 이미지결과 1장만 띄워볼거임! -->
	

	</div>
    <script src="assets/js/jquery.min.js"></script>
	<script type ="text/javascript">
	$("button").on("click",function(){
	     let sendData = {
			"name":$("#name").val()
			  }
			
			$.ajax({
			
			url : "http://127.0.0.1:9000/",
			data : sendData,
			
			success: (res)=> {
				console.log("전송 성공", res);
				
				// 주피터 flask 켜져 있어야 됨
				 let str = `<img src = '\${res}'>`
				
				// 수정해보자~~
		   $("div").append(`<img src = '\${res}'>`)
		    $("div").append(`<img src = '\${res}'>")
                  
           $("div").append(str)
                    
				
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