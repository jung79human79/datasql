package 스위치문;

import java.util.Scanner;

public class Ex01학점계산프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력: ");
		int totalScore = sc.nextInt();
		//SWITCH-CASE 사용
		char grade = 'A';                        // 한글자 변수 // 사용자가 점수를 입력 안하면 진행이 안되므로 값은 아무거나 주어도 된다.
		switch(totalScore/10) {                  // 변수명/10 몫이 9라면 A학점 //<>처럼 참,거짓값이 아니라 딱 떨어지는 숫자를 도출하는 식을 적어야함
		case 10:                                // 몫이 10이면 break없이 case 9로가서 A학점입니다.
		case 9:
			grade = 'A';	
		break;
		case 8:
			grade = 'B';	
		break;
		case 7:                                    // 75점이면 몫은 7인데 break;안주면 다음 코드인 default: 코드로 간다.
			grade = 'C';                           // 출력문이 아니고 변수를 선언한 것임
		break;
		default:                                   // break;안주면 default의 실행코드만 출력됨. 
			grade = 'D'; 
		break;
		}	
		System.out.print(grade + "학점입니다");
	}

}
