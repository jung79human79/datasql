package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class Main {

	public static void main(String[] args) {
		// 디자인 패턴 중의 하나인 mvc패턴
		// -->다지인 패턴은 계속 같은 문제가 발생해서 이문제를 해결하고자 형식 규칙을 지정해놓은 것
		// mvc 패턴
		// --> 모델 : 데이터를 저장하가나 조작하기 위한 코드들의 모음
		// --> 뷰: 사용자에게 직접 보여지는 부분
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
				// 1) dao 꺼내오기(객체생성)
				MemberDAO dao = new MemberDAO();
				// 2)dao에게 보내줄 데이터 한번에 묶어주기(객체생성)
				MemberDTO dto = new MemberDTO(id, pw, name, age, score);

				// 3) dao가 가진 회원가입매서드 기능 사용하기
				int row = dao.join(dto); // join 매서드 리턴타입은 int

				if (row > 0) {
					System.out.println("회원가입성공");
				} else {
					System.out.println("회원가입실패");
				}

			} else if (input == 2) { // 사용자가 입력한 값이 곧 dao의 매서드의 매개변수
				System.out.println("====로그인화면====");
				System.out.print("id입력 : ");
				String id = sc.next();
				System.out.print("pw입력 : ");
				String pw = sc.next();

				// dao가 가진 로그인 매서드 기능 사용하기
				MemberDAO dao = new MemberDAO();

				// MemberDTO dto = new MemberDTO(id, pw, null, 0, 0);

				// dto = dao.login(id, pw);
				MemberDTO dto = dao.login(id, pw); // login매서드 리턴값 대입

				// 로그인 성공유무 판단
				if (dto != null) {
					// 로그인 성공시~
					System.out.println(dto.getName() + "(" + dto.getAge() + ") 님 환영합니다");
				} else {
					// 로그인 실퍄했을 때
					System.out.println("로그인에 실패했습니다");
					System.out.println("아이디와 비밀번호를 확인해주세요");
				}

			} else if (input == 3) {
				System.out.println("====회원탈퇴====");
				System.out.print("탈퇴할 id을 입력하세요 : ");
				String id = sc.next();
				System.out.print("탈퇴할 pw입력하세요 : ");
				String pw = sc.next();

				// DAO에 있는 회원 탈퇴기능 사용하기
				MemberDAO dao = new MemberDAO();
				// MemberDTO dto = dao.delete(id, pw);
				int row = dao.delete(id, pw); // delete 매서드의 리턴타입의 값이 저장됨

				if (row > 0) {
					System.out.println("회원탈퇴성공");
				} else {
					System.out.println("회원탈퇴실패");
				}

			} else if (input == 4) {

				System.out.println("=====전체 회원 조회======");
				System.out.println("id\t이름\t나이\t점수");

				MemberDAO dao = new MemberDAO();

				ArrayList<MemberDTO> reList = dao.selectAll();     //리턴값(=list)이 저장된다  dao의 selectAll()매서드의 리턴값을 줘야한다. 그래야 reList변수를 사용가능하다
				
			//	reList.get(0);
			//	reList.get(0).getId();  //0은 0번째 객체인덱스
				
			//	for(int i=0; i<reList.size(); i++) {
			//		System.out.println(reList.get(i).getId() + "\t" +reList.get(i).getName() + "\t" + reList.get(i).getAge() + "\t" +reList.get(i).getScore() );
			//	}

				
				// for-each문
				for (MemberDTO d : reList) {    
					System.out.println(d.getId() + "\t" + d.getName() + "\t" + d.getAge() + "\t" + d.getScore());
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
				
				MemberDAO dao = new MemberDAO();                       // 객체생성 -> 그래야 MemberDAO의 매서드,필드등을 사용할 수 있다 
				MemberDTO dto = new MemberDTO(id, pw, nscore,nage);    // 생성자를 기반으로 새로운 객체 생성  //사용자 입력이 바로 
				
				int row = dao.up(dto);
				
				if (row > 0) {
					System.out.println("수정성공");
				} else {
					System.out.println("수정실패");
					System.out.println("아이디나 비밀번호를 다시 확인해주세요");
				}

				

			} else {                                            // 다른 숫자 입력하면 프로그램 종료
				System.out.println("번호를 잘못 입력하셨습니다");
				System.out.println("종료합니다");
				//break;
				MemberDAO dao = new MemberDAO();
				 boolean b = dao.end(input);
				 if(b) {
					 break;
				 }

			}

		}

	}

}
