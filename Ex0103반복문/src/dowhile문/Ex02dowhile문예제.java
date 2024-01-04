package dowhile문;

import java.util.Scanner;

public class Ex02dowhile문예제 {

	public static void main(String[] args) {

		// 1.입력도구꺼내기
		Scanner sc = new Scanner(System.in);
		// 2.현재몸무게 입력받기
		System.out.print("현재몸무게: ");
		int now = sc.nextInt();
		// 3.목표몸무게 입력받기
		System.out.print("목표몸무게: ");
		int goal = sc.nextInt();
		// 4.주차별 감량 몸무게 입력받기
		// --> 언제 다이어트 성공할지모름! 주차도 변수 선언하기
		int week = 1;
		do {                                                  //do에서 반복됨  do는 반복문이란걸 잊지말자
			System.out.print(week+ "주차 감량몸무게 ");
			int minus = sc.nextInt();
			week++;
			// 5-1. 현재몸무게=원래몸무게-감량몸무게(변수 더 만들필요 없음)
			now -= minus; // now = now-minus;
			// 5-2. 현재몸무게가 목표몸무게에 도달했는지 조건을 판단
			if (now <= goal) {
				System.out.print(now + "kg 달성!! 축하합니다!! ");
				break;
			}
		} while (true);                                         // 몸무게 달성하지 못하면 '주차 감량몸무게' 계속 발생함.

	}

}
