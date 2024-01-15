package PokemonGame;

import java.util.Scanner;

public class PokemonMain {

	public static void main(String[] args) {
		// 입력도구
		Scanner sc = new Scanner(System.in);
		// 게임 실행공간
		// 두마리 포겟몬 생성 = 두개의 객체 생성
		// 메타몽/노멀/변신하기/hp:80/atk:10
		// 피카츄/전기/백만볼트/hp:100/atk:15 // atk1대맞으면 hp15감소

		Pokemon meta = new Pokemon("메타몽", 80, 10, "변신하기", "노멀");
		// meta.setName("매타몽"); // setter 함수로 각각 넣어줘도 된다.

		Pokemon pica = new Pokemon("피카츄", 100, 15, "백만볼트", "전기");

		while (true)
		// 사용자로부터 선택을 받는 로직 //반복문 시작
		{
			System.out.println("포켓몽을 선택하세요.");
			System.out.print("[1]메타몽 [2]피카츄 >> ");
			int choice = sc.nextInt(); // 1을 입력하면 메타몽 2을 입력하면 피카츄

			if (choice == 1) {
				// 메타몽선택
				// 공격 혹은 스킬공격 선택 여부
				System.out.println("공격을 선택하세요");
				System.out.print("[1]일반공격 [2]스킬공격 >>");
				int choiceAtk = sc.nextInt();
				if (choiceAtk == 1) {
					// 메타몽이 피카츄를 일반공격하겠다.
					// 1.메타몽은 atk만큼 피카의 hp가 감소
					// 피카츄의 현재 hp = 피카의 현재hp-메타몽의 atk
					// 2.두마리 포켓몬의 현재 hp 출력
					// int hp = pica.getHp()-meta.getAtk();
					// pica.setHp(hp);

					pica.setHp(pica.getHp() - meta.getAtk());

					System.out.println("피카츄" + pica.getHp());
					System.out.println("메타몽" + meta.getHp());

				} else if (choiceAtk == 2) {
					// 메타몽이 피카츄를 스킬공격하겠다.
					// 1.메타몽의 atk의 1.5배만큼 피카츄 hp감소
					// 피카츄의 현재 hp=피카의 현재hp-메타몽의 atk*1.5
					// 2.두마리 포켓몬의 현재 hp 출력

					pica.setHp((int) (pica.getHp() - meta.getAtk() * 1.5)); // int*double=double 자동형변환 //강제형변환해야함

					// 2_1 메타몽의 스킬을 출력
					System.out.println(meta.getName() + "!!!" + meta.getSkill());

					System.out.println("피카츄" + pica.getHp());
					System.out.println("메타몽" + meta.getHp());

				} else {
					System.out.println("번호를 잘못 누르셨어요.");
				}

			} else if (choice == 2) {
				// 피카츄 선택
				System.out.println("공격을 선택하세요");
				System.out.print("[1]일반공격 [2]스킬공격 >>");
				int choiceAtk = sc.nextInt();
				if (choiceAtk == 1) {
					// 피카츄가 메타몽를 일반공격하겠다.
					// 1. 피카츄atk만큼 메타의hp감소
					// 메타의hp = 메타의hp -피카츄atk
					// 2. 두개의 hp출력
					meta.setHp(meta.getHp() - pica.getAtk());
					System.out.println("피카츄hp" + pica.getHp());
					System.out.println("메타몽hp" + meta.getHp());

				} else if (choiceAtk == 2) {
					// 피카츄가 메타몽를 스킬공격하겠다.
					// 1. 피카츄atk*1.5 만큼 메타의hp감소
					// 메타의hp = 메타의hp -피카츄atk*1.5
					// 2. 두개의 hp출력
					// 3. 피카츄 !!! 백만볼트!!! 출력
					meta.setHp((int) (meta.getHp() - pica.getAtk() * 1.5));
					System.out.println(pica.getName() + "!!!" + pica.getSkill() + "!!!");
					System.out.println("피카츄hp" + pica.getHp());
					System.out.println("메타몽hp" + meta.getHp());

				}else {
					System.out.println("번호를 잘못 누르셨어요.");
				}

			} else {
				System.out.println("번호를 잘못 누르셨어요.");
			}
			// 공격 끝나고 다시 선택을 할때 게임을 끝내는 로직을 작성해야 한다(  게임종료 후 hp를 확인하고 종료 그전에 승자파악한다
			// 둘중의 한마리의 포켁몬의hp가 0보다 작거나 같을 때 프로그램 종료
			// 둘중의 승자를 출력
			// 단 포켓몬 설계도는 건들리지 말 것
			if (pica.getHp() <= 0 || meta.getHp() <= 0) {

				//if (pica.getHp() > meta.getHp()) {         // break;을 먼저쓰면 에러
			//		System.out.println("피카츄승");
			//	} else {
			//		System.out.println("메타몽승");
			//	}
				break;
			}

		} // 반복문 마지막
		
//		if (pica.getHp() > meta.getHp()) {
//			System.out.println("피카츄승");
//		} else {
//			System.out.println("메타몽승");
//		}

	}

}

// <강사님 종료 방법> 
//if(pica.getHp() <= 0) {
//	System.out.println("메타몽승");  // break;을 먼저쓰면 에러
//	break;
//	
//}else if(meta.getHp() <= 0) {
//	System.out.println("피카츄승");
//	break;
//}





