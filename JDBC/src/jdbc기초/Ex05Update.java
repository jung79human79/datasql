package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex05Update {

	public static void main(String[] args) {

		// 회원 정보 수정
		// 사용자에세 ID, PW, 수정할 점수 입력받기
		// UPDATE 퀴리문 사용 executeUpdate();사용
		Scanner sc = new Scanner(System.in);
		System.out.println("====회원정보수정====");
		   System.out.print("id을 입력하세요 : ");
		   String id = sc.next();
		   System.out.print("pw입력하세요 : ");
		   String pw = sc.next();
		   System.out.print("수정할 점수 입력해주세요 : ");
		   int nscore = sc.nextInt();
		   System.out.print("수정할 나이 입력해주세요 : ");
		   int nage = sc.nextInt();
		   
		   PreparedStatement psmt = null;
		   Connection conn = null;
		   
		   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String pass = "12345"; 
			
			conn = DriverManager.getConnection(url, user, pass);
			if(conn != null) {	
				System.out.println("연결성공");
			}else {
				System.out.println("연결실패");
			}
			// 쿼리문 입력
			String sql = "update bigdatamember set score =? , age = ? where id=? and pw =?";
			
			 psmt = conn.prepareStatement(sql);
			 //  수레에 담아서 sql 전송문을 저장하자
			 
			 psmt.setString(3, id);        // 1은 첫번째 sql 컬럼 //기본키 이므로 중복값 입력 안됨.
			 psmt.setString(4, pw);        // ?인자=파라미터 순서로 index 부여됨 == 테이블의 컬럼번호가 아니다 == 퀴리문(sql) 파라미터 순서가 ???이면 인덱스1이 처음?이다.  
			 psmt.setInt(1, nscore);
			 psmt.setInt(2, nage);
			
			 // sql 문 실행.
			 int row = psmt.executeUpdate();
			
			// 결과를 이용한 작업처리
			 if(row>0) {
					System.out.println("수정성공");
				}else {
					System.out.println("수정실패");
					System.out.println("아이디나 비밀번호를 다시 확인해주세요");
				}		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {                     // 자원=여기서는 인터페이스임
			try {  				
				if(psmt!=null)                // 코드하면 에러발생 이때 try,catch문 으로 해결!!
					psmt.close();
					if(conn!=null)                                       
						conn.close();
				} catch(SQLException e) {      
					e.printStackTrace();
				}					
		}	
		
	}

}
