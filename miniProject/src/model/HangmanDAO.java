package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HangmanDAO {

	private ResultSet rs = null;
	private PreparedStatement psmt = null;
	private Connection conn = null;

	private void getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/hangman";

			String user = "root";

			String pass = "12345";

			conn = DriverManager.getConnection(url, user, pass);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getClose() {

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

//=======================================================================================================================

	// 로그인-------

	public HangMemberDTO login(String id, String pw) {

		HangMemberDTO dto = null;

		try {
			getConn();

			String sql = "select * from hangman.user where id=? and pw=?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next() == true) {
				String name = rs.getString("nickname");
				String vip = rs.getString("vip");
				int score = rs.getInt("score");
				// rs에 있는 데이터 MemberDTO 옮기기
				dto = new HangMemberDTO(null, null, name, score, vip);
			} else {

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return dto;

	}
//===================================================================================================================================

	// 회원가입-------
	public int join(HangMemberDTO dto) {

		int row = 0;
		try {
			getConn();
			String sql = "INSERT INTO hangman.user(id,pw,nickname,score,vip) VALUES (?,?,?,0,'bronze')";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());

			row = psmt.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			getClose();
		}

		return row;
	}

//================================================================================================================================

	// 회원탈퇴
	public int delete(String id, String pw) {
		int row = 0;

		try {
			getConn();

			String sql = "delete from hangman.user where id=? and pw=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;

	}
//=================================================================================================================

	// 랭킹조회
	public ArrayList<HangMemberDTO> selectAll() {

		ArrayList<HangMemberDTO> list = new ArrayList<HangMemberDTO>();

		try {
			getConn();

			String sql = "select * from hangman.user order by score desc";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("nickname");
				String vip = rs.getString("vip");
				int score = rs.getInt("score");

				list.add(new HangMemberDTO(null, null, name, score, vip));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return list;

	}

}
