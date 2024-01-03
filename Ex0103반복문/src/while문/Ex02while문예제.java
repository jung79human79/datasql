package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 변수선언
		int num = 0;                             // 전역변수
	//	while(num<10) {
			// 2.출력문 작성
	//		System.out.print("정수입력: ");
			// 3.정수 입력받기
	//		num = sc.nextInt(); 
	//	}
		// 2~3번 구간 반복
	//	System.out.print("종료되었습니다.");
		
		// 무한반복문
		while(true) {                             //false 줄수없음
			System.out.print("정수입력: ");
			num = sc.nextInt();
			if (num>=10 ) {
				System.out.print("종료되었습니다.");
				break;                               //안주면 멈추지 않는다. 무한반복이므로~
			}
		}
		
	}

	
	
}
