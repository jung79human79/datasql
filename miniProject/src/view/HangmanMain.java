package view;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.HangMemberDTO;
import model.HangmanDAO;




public class HangmanMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random(20);

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
      
				HangmanDAO dao = new HangmanDAO();
				HangMemberDTO dto = dao.login(id, pw);
				
				if (dto != null) {
					// 로그인 성공시~
					System.out.println(dto.getName() + " 님 환영합니다!! (등급:" + dto.getVip() + ", 점수:" + dto.getScore() +")" );
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
					// 로그인 실퍄했을 때
					System.out.println("로그인에 실패했습니다");
					System.out.println("아이디와 비밀번호를 확인해주세요");
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
				
				HangmanDAO dao = new HangmanDAO();
				HangMemberDTO dto = new HangMemberDTO(id, pw, name, 0, null );
				
				int row = dao.join(dto);	
			    
					if (row > 0) {
						System.out.println("회원가입성공");
					} else {
						System.out.println("이미 존재하는 id입니다.");
						System.out.println("회원가입실패");
						
					}

				

			
			}else if (choice == 3) {
				// 회원탈퇴 처리
				System.out.println("회원탈퇴를 수행합니다.");
				System.out.print("탈퇴할 id을 입력하세요 : ");
				String id = sc.next();
				System.out.print("탈퇴할 pw입력하세요 : ");
				String pw = sc.next();

				HangmanDAO dao = new HangmanDAO();
				int row = dao.delete(id, pw);
				
					if (row > 0) {
						System.out.println("회원탈퇴성공");
					} else {
						System.out.println("회원탈퇴실패");
					}
				
				
			}else if (choice == 4) {
				// 랭킹조회 처리
				System.out.println("랭킹조회를 수행합니다.");
				
				HangmanDAO dao = new HangmanDAO();
				ArrayList<HangMemberDTO> reList = dao.selectAll();
				
				for (HangMemberDTO d : reList) {    
				
				System.out.println("닉네임: "+d.getName() + "\t" + "등급 :" + d.getVip() + "\t"+ "점수 :" + d.getScore() );
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




