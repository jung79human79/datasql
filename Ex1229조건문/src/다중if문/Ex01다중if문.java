package 다중if문;

import java.util.Scanner;

public class Ex01다중if문 {

	public static void main(String[] args) {
        // 사용자로부터 정수입력
		// 짝수인지 홀수이닞 0인지 판단하는 프로그램
		
		//입력도구꺼내기
		Scanner sc = new Scanner(System.in);
		//숫자를 입력하세요 출력문 작성
		System.out.print("숫자를 입력하세요: ");
		//숫자입력받기
		int num = sc.nextInt();
		//조건식을 판단해서 홀수,짝수,0인지 판단 = 다중if문 사용
		if(num ==0) {
			System.out.print("0입니다");      //0을 짝수가 아닌 0를 처리하는 방법
		}else if(num%2 ==1){
			System.out.print("홀수입니다");
		}else{
			System.out.print("짝수입니다");   //홀수가 아니면 나머지는 짝수가 된다.
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
