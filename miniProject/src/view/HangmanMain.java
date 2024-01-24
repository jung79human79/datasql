package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HangmanMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("=======행맨 게임을 시작합니다!!=======");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠚⠒⠓⠚⠲⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡄⠖⠧⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⢈⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡀⠀⢀⡴⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣻⠉⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣪⣀⡠⡤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀ ");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡪⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠠⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⢨⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⢇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⢐⠅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠔⠉⠀⠀⠙⢢⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀   ⠰⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠓⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀ ");
		System.out.println("⠀⠀⠀      ⠀⢘⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀ ⠀");
		System.out.println("⠀⠀⠐⠒⠒⠒⠒⠒⠒⠒⠚⠒⠒⠖⠖⠔⠤⠢⠔⠔⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀ ⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀ ");
		System.out.println("⠀⠀ ⡀⠀ ⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀    ");
		System.out.println("⠀⠀⠀⢸⡀⣀⠇⠀⠀⠀⢀⠶⡀⠀⠀⢀⡀⠀⡆⠀⠀⠀⠀⠀⠀⠀⠀ ⢠⣆⣰⡄⠀⠀ ⢀⣤⡀⠀⠀⠀ ⢠⣄⠀⢸⠀⠀");
		System.out.println("⠀⠀⠀⣸⠍⠈⡇⠀⠀⢠⠏⠉⢧⠀⠀⢸⠱⣄⡇⠀⠀⠀⠀⠀⠀ ⠀⠀⡕⠈⠁⡇⠀⠀ ⡼⠒⡆⠀ ⠀ ⢸⠈⠣⡼⠀⠀");
		System.out.println("⠀⠀⠀⣀⣀⣀⣀⣀⠀⣀⣀⣀⣀⠀ ⢈⣀⣀⣈⣁⠀⣀⣀⣀⣀⠀ ⣀⣀⣀⣀⠀ ⣘⣀⣀⣀⡀⠀⢀⣀⣀⣀⣀⠀");

		while (true) {
			System.out.print("[1]로그인 [2]회원가입 [3]회원탈퇴 [4]랭킹조회 [5]종료 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				// 로그인 처리
				System.out.println("로그인을 수행합니다.");
				System.out.print("id 입력 : ");
				String id = sc.next();
				System.out.print("pw 입력 : ");
				String pw = sc.next();

				ResultSet rs = null;
				PreparedStatement psmt = null;
				Connection conn = null;

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url = "jdbc:mysql://localhost/hangman";
					String user = "root";
					String pass = "12345";
					conn = DriverManager.getConnection(url, user, pass);

					String sql = "select * from hangman.user where id=? and pw=?";

					psmt = conn.prepareStatement(sql);

					psmt.setString(1, id);
					psmt.setString(2, pw);

					rs = psmt.executeQuery();

					if (rs.next() == true) {
						// 로그인 성공시
						String name = rs.getString("nickname");
						String vip = rs.getString("vip");
						int score = rs.getInt("score");
						System.out.println(name + " 님 환영합니다!! (등급:" + vip + ", 점수:" + score+")" );
						
						// 난이도 선택 창
						while (true) {
							System.out.println("난이도를 선택해주세요!!");
							System.out.print("[1]하 [2]중 [3]상 >> ");
							int nan = sc.nextInt();

							if (nan == 1) {
								// 하 게임 실행
								break; // 올바른 입력이면 루프를 빠져나감
							} else if (nan == 2) {
								// 중 게임 실행
								break; // 올바른 입력이면 루프를 빠져나감
							} else if (nan == 3) {
								// 상 게임 실행
								break; // 올바른 입력이면 루프를 빠져나감
							} else {
								System.out.println("숫자를 잘못 입력하였습니다. 다시 선택해주세요."); 
							}
						}
						// 행맨 게임 실행
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
			}else if (choice == 2) {
				// 회원가입 처리
				System.out.println("회원가입을 수행합니다.");
				System.out.print("id 입력 : ");
				String id = sc.next();
				System.out.print("pw 입력 : ");
				String pw = sc.next();
				System.out.print("닉네임 입력 : ");
				String name = sc.next();
				
				PreparedStatement psmt = null;
				Connection conn = null;
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost/hangman";

					String user = "root";

					String pass = "12345";

					conn = DriverManager.getConnection(url, user, pass); 
					
					String sql = "INSERT INTO hangman.user(id,pw,nickname,score,vip) VALUES (?,?,?,0,'bronze')";
					
					psmt = conn.prepareStatement(sql);

					psmt.setString(1, id);
					psmt.setString(2, pw);
					psmt.setString(3, name);
					
					int row = psmt.executeUpdate();

					if (row > 0) {
						System.out.println("회원가입성공");
					} else {
						System.out.println("회원가입실패");
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
			}else if (choice == 3) {
				// 회원탈퇴 처리
				System.out.println("회원탈퇴를 수행합니다.");
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
					
					String sql = "delete from hangman.user where id=? and pw=?";

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
			}else if (choice == 4) {
				// 랭킹조회 처리
				System.out.println("랭킹조회를 수행합니다.");
				
				Connection conn = null;
				PreparedStatement psmt = null;
				ResultSet rs = null;
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url = "jdbc:mysql://localhost/hangman";
					String user = "root";
					String pass = "12345";
					conn = DriverManager.getConnection(url, user, pass);

					String sql = "select * from hangman.user order by  score desc";

					psmt = conn.prepareStatement(sql);

					rs = psmt.executeQuery();
					
		

					while (rs.next() == true) {
						String nickname = rs.getString("nickname");
						String vip = rs.getString("vip");
						int score = rs.getInt("score");
						System.out.println("닉네임: "+nickname + "\t"+ "등급 :" + vip + "\t"+"점수 :" + score );
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
			
		}else if (choice == 5) {
			// 종료 처리
			System.out.println("게임이 종료되었습니다.");
			break;
		} else {
			// 숫자를 잘못 입력 했을 시
			System.out.println("숫자를 잘못 입력하였습니다. 다시 선택해주세요.");
		}
				
		}
		sc.close();
	}
}
