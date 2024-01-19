package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {

	public static void main(String[] args) {

		// 회원탈퇴
		// 1. 사용자에게 id pw 입력받기
		
		// 2. 회원탈퇴 성공 --> 회원탈퇴 성공
		//    회원탈퇴 실패 --> 회원탈퇴 실패
		
		// Delete 문은 회원가입 코드를 사용하면됨
		// 로그인은 dml쿼리문이 아닌 select문이다.
		
		Scanner sc = new Scanner(System.in);
		   System.out.println("====회원탈퇴====");
		   System.out.print("탈퇴할 id을 입력하세요 : ");
		   String id = sc.next();
		   System.out.print("탈퇴할 pw입력하세요 : ");
		   String pw = sc.next();
		   
		   Connection conn = null;
		   PreparedStatement  psmt = null;
		   
		   try {
			  // 1.드라이버 동적로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// db연결 통로 열기위한 3가지 요소	
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String pass = "12345";
			// 자바--> 통로(conn) --> 디비
			conn = DriverManager.getConnection(url, user, pass);
			
			if(conn != null) {	
				System.out.println("연결성공");
			}else {
				System.out.println("연결실패");
			}
			// 3. sql 쿼리문 작성
			String sql = "delete from bigdatamember where id=? and pw=?";
			
			// 4. 퀴리문 담는 수레 작성 
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			// 5.쿼리문 실행
			int row = psmt.executeUpdate();   // dml 쿼리문에서만 사용 (삭제 수정 추가)  (조회는 안됨== 조회는 executeQuery();)
			
			if(row>0) {
				System.out.println("회원탈퇴성공");
			}else {
				System.out.println("회원탈퇴실패");
			}					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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

// 삭제 후 mysql에서 테이블을 확인해보자
// 혹은 로그인클래스에서 삭제한 id,pw 을 콘솔값에 입력해 보면 로그인에 실패했습니다,아이디와 비밀번호를 확인해주세요 
// 라는 출력문이 생성되면 삭제 성공한 것이다.



