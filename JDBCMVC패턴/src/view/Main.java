package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class Main {

	public static void main(String[] args) {
		//디자인 패턴 중의 하나인 mvc패턴 
        // -->다지인 패턴은 계속 같은 문제가 발생해서 이문제를 해결하고자 형식 규칙을 지정해놓은 것
		// mvc 패턴
		// --> 모델 : 데이터를 저장하가나 조작하기 위한 코드들의 모음
		// --> 뷰:    사용자에게 직접 보여지는 부분
        // --> 컨트롤러 : 실제 기능이 일어나는 부분
		
		
		// 사용자에게 보여주는 부분이므로 뷰이고 메인함수 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("====빅데이터반 회원괸리 프로그램==========");

		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]회원삭제 [4]회원정보조회 [5]회원정보수정 >> ");
			int input = sc.nextInt();

			if (input == 1) {
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
				
				// 데이터베이스에 접근해서 데이터 추가하기!
				// --> 앞으로 데이터베이스에 접근과 관련된 모든 역할은 dao가 담당!!
				//1) dao 꺼내오기(객체생성)	
				MemberDAO dao  = new MemberDAO();
				//2)dao에게 보내줄 데이터 한번에 묶어주기(객체생성)
				MemberDTO  dto = new MemberDTO(id, pw, name, age, score);
				
				//3) dao가 가진 회원가입 기능 사용하기
			     int row = dao.join(dto);  // join 매서드 리턴타입은 int
			 
				
				
				if (row > 0) {
					System.out.println("회원가입성공");
				} else {
					System.out.println("회원가입실패");
				}

				
			} else if (input == 2) {
				System.out.println("====로그인화면====");
				System.out.print("id입력 : ");
				String id = sc.next();
				System.out.print("pw입력 : ");
				String pw = sc.next();

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

					String sql = "select * from bigdatamember where id=? and pw=?";

					psmt = conn.prepareStatement(sql);

					psmt.setString(1, id);
					psmt.setString(2, pw);

					rs = psmt.executeQuery();

					rs.next();

					if (rs.next() == true) {
						String name = rs.getString("b_name");
						int age = rs.getInt("age");
						System.out.println(name + "(" + age + ") 님 환영합니다");
					} else {
						System.out.println("로그인에 실패했습니다");
						System.out.println("아이디와 비밀번호를 확인해주세요");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {

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

			} else if (input == 3) {
				System.out.println("====회원탈퇴====");
				System.out.print("탈퇴할 id을 입력하세요 : ");
				String id = sc.next();
				System.out.print("탈퇴할 pw입력하세요 : ");
				String pw = sc.next();

				Connection conn = null;
				PreparedStatement psmt = null;

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url = "jdbc:mysql://localhost/jdbctest";
					String user = "root";
					String pass = "12345";
					conn = DriverManager.getConnection(url, user, pass);

					if (conn != null) {
						System.out.println("연결성공");
					} else {
						System.out.println("연결실패");
					}
					String sql = "delete from bigdatamember where id=? and pw=?";

					psmt = conn.prepareStatement(sql);

					psmt.setString(1, id);
					psmt.setString(2, pw);
					int row = psmt.executeUpdate();

					if (row > 0) {
						System.out.println("회원탈퇴성공");
					} else {
						System.out.println("회원탈퇴실패");
					}
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

			} else if (input == 4) {
				ResultSet rs = null;
				PreparedStatement psmt = null;
				Connection conn = null;

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost/jdbctest";
					String user = "root";
					String pass = "12345";
					conn = DriverManager.getConnection(url, user, pass);

//					if (conn != null) {
//						System.out.println("db연결성공");
//					} else {
//						System.out.println("db연결실패");
//					}

					String sql = "select * from bigdatamember";

					psmt = conn.prepareStatement(sql);

					rs = psmt.executeQuery();

					System.out.println("=====전체 회원 조회======");
					System.out.println("id\t이름\t나이\t점수");
					if (rs != null) {

						while (rs.next() == true) {
							String id = rs.getString("id");
							String name = rs.getString("b_name");
							int age = rs.getInt("age");
							int score = rs.getInt("score");
							System.out.println(id + "\t" + name + "\t" + age + "\t" + score);
						}

					} else {
						System.out.println("정보가 없습니다");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
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
			} else if (input == 5) {
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
					if (conn != null) {
						System.out.println("연결성공");
					} else {
						System.out.println("연결실패");
					}
					String sql = "update bigdatamember set score =? , age = ? where id=? and pw =?";

					psmt = conn.prepareStatement(sql);

					psmt.setString(3, id);
					psmt.setString(4, pw);
					psmt.setInt(1, nscore);
					psmt.setInt(2, nage);

					int row = psmt.executeUpdate();

					if (row > 0) {
						System.out.println("수정성공");
					} else {
						System.out.println("수정실패");
						System.out.println("아이디나 비밀번호를 다시 확인해주세요");
					}
				} catch (ClassNotFoundException | SQLException e) {
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

			} else {   // 다른 숫자 입력하면 프로그램 종료
				System.out.println("번호를 잘못 입력하셨습니다");
				System.out.println("종료합니다");
				break;

			}

		}

	
	}

}
