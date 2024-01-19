package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01join {

	public static void main(String[] args) {
	
		// 사용자 입출력 구간
		   Scanner sc = new Scanner(System.in);
		   System.out.println("====회원가입====");
		   System.out.print("id입력 : ");
		   String id = sc.next();
		   System.out.print("pw입력 : ");
		   String pw = sc.next();
		   System.out.print("이름입력 : ");
		   String name = sc.next();
		   System.out.print("나이입력 : ");
		   int age = sc.nextInt();
		   System.out.print("점수입력 : ");
		   int score = sc.nextInt();

			// JDBC(자바와 디비연결)
			// JDBC 인테페이스 사용법 == 강제성 있는 틀 == 디비회사들과 연결하는 강제성 있는 틀
//========================================================전역변수===================================
		   PreparedStatement psmt = null;
		   Connection conn = null;
//======================================================try============================================	   
			//JDBC 인테페이스 코드는 try 구문에서 코드한다.
			try {
				// try 구문
				// --> 예외가 발생할 수도 있지만 우선 시도해보는 구간
				
				// 1. 드라이버를 로딩하자
				// JDBC 드라이버란?
				// : 자바에서 제공해주는 인테이스들을 디비회사들에서 상속을 받아서 로직을 구현한 클래스 파일들의 모음(일종의 API)
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				// 경로를 입력하면 에러 발셍== try catch 구문 사용 == 클래스 이름을 찾는 것을 시도하는데 에러 발생시 캐치해서 에러 내용을 보여준다.
				// 에러원인은 보통 오타 혹은 jar파일 경로 잘못됨.
				// ()안은 제네릭기법 ()은 추가한 jar파일의 위치임  // 이 Class는 static안줘도 된다 1순위로 된다.
				//<String> 제네릭 기법 String 자료형을 넣겠다 혹은 나만의 객체를 넣겠다
				// <>안에 머 넣을지 보관할지 정하는 법= 제네릭기법
				
				// --> 반드시 프로젝트에 jar파일을 넣어주기
				// jar파일이란?
				//--> 클래스 파일들을 요러개 모아놓은 압축파일
				
				// 프로젝드에 jar파일 추가하는 방법?
		         // 프로젝트 선택-> 마우스 우클릭-> build.path
		         // -> configure build path-> libraries 탭 선택
		         //-> class path 선택 -> 우측 add external jar 선택
		         // -> 원하는 jar파일 경로 선택 -> apply and close
				
				// 2.데이터베이스와 연결  == 통로: 디비에 들어가는데 어디경로(주소)이고 비번은 무언인지 등이 필요하다.=이것이 Connection 인터페이스
				// 준비물 3가지
				// 1)연결경로
				String url = "jdbc:mysql://localhost/jdbctest";
				// localhost -->ip주소(127.0.0.1) --> sql ip주소  
				// --> 만약 내 컴의 디비를 이용 및 저장 하려면 내컴 주소를 적는데 localhost가 바로 현재 내컴의 주소이다.
				// --> 만약 친구컴의 디비에 저장하려면 친구 ip주소를 적어주면 된다.
				// jdbctest --> 우리가 만든 디비이름 (create database jdbctest;)
				// 2)계정이름
				String user = "root";
				// 3)계정비번
				String pass = "12345";  
				
			  conn = DriverManager.getConnection(url, user, pass);    // 매개변수 위의 3개 // Connection 인터페이스
				// Connection 이란?
				// : 데이터베이스에 접속하기 위한 모든 메서드를 가진 인터페이스
				// --> 데이터베이스와 하는 모든 통신은 conn을 통해서만 이루어진다.
				// Connection==메타데에터(거대한 데이터)
				// ->사용가능한 테이블 목록, 컬럼들에 대한 정보 등
				// 연결된 디비의 정보들을 모두 가지고 있음!!
				
				if(conn != null) {	
					System.out.println("연결성공");
				}else {
					System.out.println("연결실패");
				}
				
				// 3. sql(퀴리문) 구문 전송   // 자바에서 쿼리문을 디비로 보내준다(저장한다) 
				// 3-1)퀴리문 작성
				// id -> smhrd, pw-> 12345, name -> 정대주, age ->45, score ->90
				//String sql = "INSERT INTO bigdatamember(id,pw,b_name,age,score) VALUES ('smhrd','12345','정대주',45,90)";
				//위의 것을 복사해서 sql에서 실행하면 밸류가 실제로 들어간다(테이블에 튜플이 입력된다)
				// 근데 위 방법은 잘 되는지 테스트용이다 실제는 아래코드 사용
				String sql = "INSERT INTO bigdatamember(id,pw,b_name,age,score) VALUES (?,?,?,?,?)";
				
				// ?인자는 사용자로부터 어떤 데이터가 들어올지 모를 때 사용
				// -->지정한 데이터 공간만큼 비워놓고 실행하기 전까지 대기== 자리만 만들어 놓은 것
				// 쿼리문을 보낼때 그냥 보내지 않는다 
				// --> 마치 편지보낼때 봉투에 넣듯이 규격에 담아서 보낸준다.
				// 자바  --> (통로) -->디비
				// --> conn안에서 규격을 맞추어 보낸다
				// --> conn통로에서 수레에 담아 보낸다면 이 수레가 규격이고 이름은 PreparedStatement 인터페이스
				// --> conn이 수레를 만든다 == conn.prepareStatement
				 psmt = conn.prepareStatement(sql);  // 변수 타입은 메모 확인하면 됨 // PreparedStatement 인터페이스
				
				// ? 인자를 채우는 작업!
				psmt.setString(1, id);        //기본키 이므로 중복값 입력 안됨.
				psmt.setString(2, pw);        // 메인함수 처음부분인 사용자가 입력한 값이 저장된다.
				psmt.setString(3, name);
				psmt.setInt(4, age);
				psmt.setInt(5, score);
				
				
				// 4.sql문 실행 == 실행코드== psmt.executeUpdate() 
				// --> 테이블모양이 바뀌면 (영향을 주는 퀴리문에 사용함) == 추가,삭제,수정 퀴리문 ==dml 쿼리문
				// --> 테이블 모양에 변화를 주는 경우 executeUpdate() 사용 = 변화를 주는 퀴리문은 == 추가,삭제,수정
				// --> 만약 select는 조회이므로 다른 코드로 실행문에 적용한다 ***(1/19일 오전 수업)
				// sql에서  한개의 row(행=레코드)만 나와도 성공을 의미한다
				// sql에서 콘솔창을 보면 먼가 성공시 row표시가 나온다 그 row가 숫자를 의미하므로 타입을 int로 한다
				int row = psmt.executeUpdate();    // execute=실행하다 업데이트를 실행해서 sql의 row에 대입해라~  //int는 인터페이스 아니다.
				
				
				// 5. 결과를 이용한 작업처리
				// : 사용자에게 어떤 모습을 보여주는지 정의
				
				if(row>0) {
					System.out.println("회원가입성공");
				}else {
					System.out.println("회원가입실패");
				}
				
				
				
			} catch (Exception e) {                                         
				//} catch (ClassNotFoundException | SQLException e) {
				// --> 모든 예외 크래스는 Exception 클래스을 상속받는다(업캐스팅)
				// --> Exception e = new ClassNotFoundException();
				//--->  업캐스팅이 일어나는 개념
				
				
				// catch 구문
				// --> 예외가 발생시 어떤 로직을 수행할지 작성하는 구간
				// --> ()안의 매개변수는 어떤 예외상황을 잡아 줄건지 기술하는 구간
				
				e.printStackTrace();   // e가 가진 기능을 실행 // 오류를 추적해 쌓아서 콘솔에 인쇄해줌   //개밸자용코드
				                      // 예외사항이 왜 발생했고 어디서 문제가 나고 있는지 출력해주는 구문 -->개발시 사용
				                     // --> 배포시에는 삭제하는 것이 좋음
				//System.out.println("클래스를 못찾음");     // 사용자에 보여주는 코드
			} finally {          
				// 자원을 다쓰면 닫아준다== 자원== 디비의 데이터을 사용하면 닫아준다(보안)
				// 디비를 다쓰면 연결통로을 닫는다.==역순으로 닫아 준다.
				// 수레를 수거하고 통로도 닫는다.
				// 위에서 예외 사항이 발생하더라도 반드시 한번은 들어오는 구간
				// --> 처음 jar파일의 클래스를 못찾아도(ClassNotFoundException) 커리문 실행을 못해도(SQLException) finally 에서 반드시 닫아준다 
				// --> 즉 연결이나 수레를 사용하지 않더라도 예외사항만 발생하더라도 반드시 finally는 거쳐서 닫아준다.
				// 6. 디비 연결 종료-->자원반납
				try {
			   // 자원을 반납할 때는 항상 사용한 역순으로 반납한다!***
		       // 인테페이스 첫번째는 Connection 두번째는 PreparedStatement
				
				if(psmt!=null)      // 잘 사용한 경우만                     // if문 중괄호 생략
					psmt.close();
					if(conn!=null)                                       // if문 중괄호 생략
						conn.close();
				} catch(SQLException e) {       //(Exception e) 해도 가능함
					e.printStackTrace();
				}
				
			} //finally
		
	}
		
		
}	
		
	// 	Exception이 여기서는 두 가지인데 에러가 발생한다 해결책을 보면 여러개 인데 중 이경우 try catch문이 사용한다
// catch문으로 에러를 찾아 보여준다는 의미인데 어차피 Exception은 상위 클래스이므로 두가지를 포함하는 부모클래스 이므로
// 업캐스팅해서 Exception만 사용한다.
		
	


