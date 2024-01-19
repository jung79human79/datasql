package jdbc기초;

import java.sql.Connection;      //인터페이스 -->    // 자바와 디비 사이의 연결통로
import java.sql.DriverManager;   // ?              // 연결시 준비물 3가지
import java.sql.PreparedStatement; //인터페이스 -->  //통로에 수레를 생성==자바에서 작성한 쿼리문을 디비에 저장하기위해 수레에 담는것 
import java.sql.ResultSet;         //인터페이스 -->  //sql의 테이블같은 표을 반환   //select 쿼리문에서 사용하는 인터페이스
import java.sql.SQLException;      //클래스 -->     // sql 예외사항

public class Ex04selectAll {                                

	public static void main(String[] args) {

		// 전체 회원 조회 == 조회이므로 사용자 입력값은 필요 없음
		// =====전체 회원 조회======
		//     id 이름 나이 점수
		//  예)s1 스마트 20 100
		// select 쿼리문 사용

		

		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String pass = "12345";
			conn = DriverManager.getConnection(url, user, pass);

			if (conn != null) {
				System.out.println("db연결성공");
			} else {
				System.out.println("db연결실패");
			}

			String sql = "select * from bigdatamember";

			// 수레담기
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery(); // select 쿼리문 실행코드     //ResultSet인터페이스는 표을 반환함
			
			System.out.println("=====전체 회원 조회======");
			System.out.println("id\t이름\t나이\t점수");
			if (rs != null) {                // if문 자체가 조건식 == true or false.... //표가 널이 아니라면 (레퍼런스 타입의 초기화는 null)
				                             // rs.next()는 조건식에 코드가 써지면 무조건 한 줄 아래로 이동!!
				while (rs.next() == true) {  // 컬럼행 커서에서 한 줄 내리기해서 참이라면 즉 데이터가 있다면(next()가 타입이 블리언~)
					String id = rs.getString("id"); // 5행으로 커서가 가면 rs.next() == false가 되므로 자동 break; 된다.
					//String pw = rs.getString("pw");
					String name = rs.getString("b_name");
					int age = rs.getInt("age");
					int score = rs.getInt("score");
					System.out.println(id + "\t" + name + "\t" + age + "\t" + score);  // \t는 간격맞춤,\n은 개행
				}

			} else {
				System.out.println("정보가 없습니다");
			}

// 교수님 방법=======================================================================================================
//			System.out.println("=====전체 회원 조회======");
//			System.out.println("id\t이름\t나이\t점수");
//			
//			while(rs.next()) {
//				String id = rs.getString("id");
//				String name = rs.getString("b_name");
//				int age = rs.getInt("age");
//				int score = rs.getInt("score");
//				System.out.println(id + "\t" + name + "\t" + age + "\t" + score);	
//			}
//=====================================================================================================================			
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// db 연결종료 // 여시서는 총 3개의 인태페이스를 사용했음
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
