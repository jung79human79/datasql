package dowhile문;

import java.util.Scanner;

public class Ex02dowhile문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int week1 = 0;
		int week2 = 0;
		int week3 = 0;
		int week4 = 0;
		
		System.out.print("현재몸무게: ");
		int num1 = sc.nextInt();
		System.out.print("목표몸무게: ");
		int num2 = sc.nextInt();
		
		do { 
			if (num1<=num2) {
				System.out.print((num1-week1-week2-week3-week4)+"kg 달성!! 축하합니다!!");
			}
		}while(true);
		
		//1.입력도구꺼내기
		//2.현재몸무게 입력받기
		//3.목표몸무게 입력받기
		//4.주차별 감량 몸무게 입력받기
		//--> 언제 다이어트 성공할지모름! 주차도 변수 선언하기
		//5-1. 현재몸무게=원래몸무게-감량몸무게(변수 더 만들필요 없음)
		//5-2. 현재몸무게가 목표몸무게에 도달했는지 조건을 판단
			
		
	}
	

}
