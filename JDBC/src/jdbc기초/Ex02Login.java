package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 로그인 기능 만들기
		// 사용자에게 id pw 입력받기
		System.out.println("====로그인화면====");
		 System.out.print("id입력 : ");
		 String id = sc.next();
		 System.out.print("pw입력 : ");
		 String pw = sc.next();
		 
		 ResultSet rs = null;            // 레퍼런스 타입의 초기화는 null
		 PreparedStatement  psmt = null;
		 Connection  conn  = null;
		 
		 // 1.드라이버 로딩
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		// 2.디비 연결통로 열기	3가지
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String pass = "12345";
			conn = DriverManager.getConnection(url, user, pass);     //변수에 담아 계속 재사용 
			
			if(conn != null ) {                     // 개발자만 보는 확인 코드
				System.out.println("db연결성공");
			}else {
				System.out.println("db연결실패");
			}		
		
		 // 3.sql 퀴리문 준비
		 // 로그인 기능 == 테이블에 사용자가 입력한 id,pw가 일치하는 데이터가 있는지 확인기능 >> select문
		 //  id pw 일치하는(조건) 데이터의 모든 컬럼(*) 가져오기 
			
			//String sql = "select * from bigdatamember where id='smhrd' and pw= 12345;";	
			String sql = "select * from bigdatamember where id=? and pw=?";  //둘다 맞아야 로그인이 성공함
			// id pw 둘다 일치하는 행을 디비에서 볼수 있다.
			
			psmt = conn.prepareStatement(sql);    // 재사용하므로 변수사용  // jdbc는 인터페이스로 구성됨
			
			//  ? 2개 인자 채워주기 
			// 퀴리문이 psmt에 담겨 있으므로 채워준다	
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			// 4.sql문 실행
			rs = psmt.executeQuery();     // select 퀴리에서 실행하는 코드    //ResultSet 인터페이스
			// ResultSet타입을 반환하는 매서드 == executeQuery()
			// 조회된 데이터를 테이블과 같은 형태로 표현해주는 집합 자료구조!
			// 커서를 가지는데 처음에는 컬럼을 가리킨다
			// 커서가 가리키는 데이터만 가져올수 있음
			// 표를 반환 == 처음 커서는 컬럼행을 가리킨다 데이터를 가져오기 위해서는 커서를 데이터로 한행 내려줘야한다.
			// 우리가 원하는 건 컬럼행이 아닌 튜플 즉 레코드를 보는 것이므로 rs.next();매서드로 한 줄 내려준다.
			// executeUpdate();는 반환타입이 INT
			
			rs.next();         // 여기서 한 커서 내려감
			// rs.next(); == 커서를 한 줄 내리는 작업 
			
		   if(rs.next()==true) {                         // 커서를 한 줄 내려서 true인지 확인 // if문에서 rs.next()를 기록하는 순간 커서 내려감
			  String name  = rs.getString("b_name");
			  int age  = rs.getInt("age");
			  System.out.println(name+"(" + age +") 님 환영합니다");
		   }else {
			   System.out.println("로그인에 실패했습니다");
			   System.out.println("아이디와 비밀번호를 확인해주세요");
		   }
		   	
			
		} catch (Exception e) {   //상위 클래스 Exception //업캐스팅  //두 개의 예외를 다 잡아준다
			e.printStackTrace();
		}finally {
			// db 연결종료   // 여시서는 총 3개의 인태페이스를 사용했음
			try {	
				if(rs!=null)
				rs.close();
				if(psmt!=null)
				psmt.close();
				if(conn!=null)
				conn.close();	
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		 	
	}

}
