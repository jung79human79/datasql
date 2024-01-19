package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {

	// 데이터 엑세스 오브젝트 : 데이터에 접근하는 것을 도와주는 객체 == DAO
	// DB를 연결해서 인서트 딜리트 업데이트 셀렉트 하는 코드들의 모음
	// 매서드 형태로 코드 작성
	
	// 회원가입 매서드 만들기
	public int join (MemberDTO dto) {         //int row = psmt.executeUpdate(); 이므로  리턴타입int
		PreparedStatement psmt = null;
		Connection conn = null;
		int row=0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest";

			String user = "root";

			String pass = "12345";

			conn = DriverManager.getConnection(url, user, pass); // 매개변수 위의 3개 // Connection 인터페이스

			String sql = "INSERT INTO bigdatamember(id,pw,b_name,age,score) VALUES (?,?,?,?,?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setInt(5, dto.getScore());

			row = psmt.executeUpdate();

			

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return row;    // 항상 마지막
	}
}
