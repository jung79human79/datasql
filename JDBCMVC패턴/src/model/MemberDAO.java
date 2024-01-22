package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.text.AbstractDocument.BranchElement;

public class MemberDAO {

	// 데이터 엑세스 오브젝트 : 데이터에 접근하는 것을 도와주는 객체 == DAO
	// DB를 연결해서 인서트 딜리트 업데이트 셀렉트 하는 코드들의 모음
	// 매서드 형태로 코드 작성
//==============================================================================================================================================

	// 필드 생성 --> 공통된 것을 필드로~
	private ResultSet rs = null;
	private PreparedStatement psmt = null;
	private Connection conn = null;

	// 공통으로 사용할 매서드(중복된 부분 매서드로~) == 데이터베이스 연결하는 매서드
	private void getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest";

			String user = "root";

			String pass = "12345";

			conn = DriverManager.getConnection(url, user, pass); // 매개변수 위의 3개 // Connection 인터페이스

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 사용한 자원을 반납하는 매서드 == 공통으로 사용할 매서드(중복된 부분 매서드로~)
	private void getCldse() {

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

	//====================================================================================================================================
	
	// 회원가입 매서드 만들기 //매서드를 실행하기 위해 필요한 재료==매개변수(입력값)=회원가입을 위한 5가지를 따로따로가 아닌 하나로=MemberDTO
	public int join(MemberDTO dto) { // int row = psmt.executeUpdate(); 이므로 리턴타입int
		// PreparedStatement psmt = null; // 회원가입을 위한 재료는(매개변수)는 5가지 즉 MemberDTO
		// Connection conn = null;
		int row = 0;

		try {
			getConn();
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
			getCldse();
		}

		return row; // 항상 마지막
	}
//========================================================회원가입매서드끝====================================================	
	// 로그인화면 매서드 만들기

	public MemberDTO login(String id, String pw) { // 매서드를 실행하기 위해 필요한 재료==매개변수(입력값)= 로그인 확인을 위한 재료는 2가지

		// ResultSet rs = null;
		// PreparedStatement psmt = null;
		// Connection conn = null;
		MemberDTO dto = null;

		try {
			getConn();

			String sql = "select * from bigdatamember where id=? and pw=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			// rs.next();

			if (rs.next() == true) {
				String name = rs.getString("b_name");
				int age = rs.getInt("age");
				// rs에 있는 데이터 MemberDTO 옮기기
				dto = new MemberDTO(null, null, name, age, 0);
			} else {
				// 필요없음 삭제가능
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getCldse();
		}

		return dto; // 99행 리턴

	}

	// ===============================================로그인끝======================================================================

	// 회원탈퇴 매서드 만들기
	public int delete(String id, String pw) { // 매서드를 실행하기 위해 필요한 재료==매개변수(입력값)= 로그인 확인을 위한 재료는 2가지

		// Connection conn = null;
		// PreparedStatement psmt = null;
		int row = 0;

		try {
			getConn();

			String sql = "delete from bigdatamember where id=? and pw=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			row = psmt.executeUpdate(); // 삭제가 성공이면 row=0에서 1이된다.==없는 초기값에서 있는 것이 된다.

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getCldse();
		}

		return row; // 151행의 row

	}
	// ============================================회원탈퇴끝=============================================================

	// 회원 전체 조회 매서드

	public ArrayList<MemberDTO> selectAll() { // 사용자 입력 정보 필요 없어서 매개변수 필요 없음... 쿼리문에 들어가는 물음표인자가 사용자 입력 정보

		// ResultSet rs = null;
		// PreparedStatement psmt = null;
		// Connection conn = null;
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>(); // 전역변수로 해야 리턴이 가능

		try {
			getConn();

			String sql = "select * from bigdatamember";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery(); // 표로 구현됨 //실행문

			while (rs.next()) { // 서로 다른 자료형을 하나로 만든 것이 dto.
				String id = rs.getString("id");
				String name = rs.getString("b_name");
				int age = rs.getInt("age");
				int score = rs.getInt("score");
				// 조회결과(rs)에 있는 데이터 dto로 옮겨 담기 --> 이러면 데이터 한 줄(객체)만 생성됨.==마지막데이터만 생성 == dto1개는
				// 사람 한명 return dto;는 한명만 반환된것임
				// --> 내 생각에 dto객체를 5개를 만들긴 하는데 리턴이 dto 1개 이므로 마지막 하나만 리턴이 된다.
				// 따라서 ArrayList을 이용해 dto 여러개 묶어주기
				list.add(new MemberDTO(id, null, name, age, score)); // dto는 클래스이므로 매서드를 사용한다.(여기서는 add())

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getCldse();
		}

		return list; // 203행 리턴 //배열자체를 리턴함 // 리스트를 리턴한것임...
	}
//================================================================회원 전체 조회 끝==============================================================

	// 회원정보수정 매서드
	public int up(MemberDTO dto) { // 입력타입과 리턴 타입은 다를 수 있다.

		// PreparedStatement psmt = null;
		// Connection conn = null;
		int row = 0;

		try {
			getConn();

			String sql = "update bigdatamember set score =? , age = ? where id=? and pw =?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(3, dto.getId());
			psmt.setString(4, dto.getPw());
			psmt.setInt(1, dto.getScore());
			psmt.setInt(2, dto.getAge());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getCldse();
		}

		return row;
	}

//=========================================================회원정보수정=============================================================================	

	// 필요없는 코드이지만 만들었다
	public boolean end(int num) {
		if (num <= 0 || num >= 6) {
			return true;
		}
		return false;
	}

}
