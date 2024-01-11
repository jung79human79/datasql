package 매서드;

import java.util.Scanner;

public class Ex05완전수구하기 {

	public static void main(String[] args) {
        // 완전수:자기자신을 제외한 약수들의 합이 자기자신인 수!
		// 6 = 1,2,3,6 인데 1+2+3=6 6이면 6은 완전수
		// 10 = 1+2+5=8 10은 완전수 아니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isdivisor(num1,num2);
		System.out.println(divisor);
		System.out.println(getSum(6));    // 간단표현
		System.out.println(getSum2(10));
		System.out.println(isperfect(6));
	}

	// 1. 약수찾기 매서드
	// 매소드명:isdivisor 
	// 매개변수:2개 int
	// 리턴타입:boolean
	
	private static boolean isdivisor(int num1, int num2) {
		boolean result = false;
		// num2가 num1의 약수이니?
		if(num1%num2==0) {
			result = true;
		}
		return result;
	}
	
	
	
	// 2. 자신을 제외한 약수의 총합을 구하는 매서드
	 
	
	private static int getSum (int num) {
		int result= 0;
		// 1.입력된 숫자의 약수를 구한다
		// --> 1~num 중에 num을 제외한 범위
		// 2. 나 자신을 제외한 숫자들의 합을 구한다=누적합계
		
		for(int j = 1; j <num; j++) {
			 // ** 매서드를 호출한 로직
		     // 매서드 구조안에 매서드를 새롭게 구현은 안되지만
			// 매서드 자체를 호출하여 사용은 가능~ 이미 만들어진 매서드는 메인밖에서도 사용가능
			if(isdivisor(num,j) == true) {			
            	 result += j;
             }
		}
		 return result;
	}
	
	// 2. 자신을 제외한 약수의 총합을 구하는 매서드 다른 방법
	   private static int getSum2 (int num) {
		   int result= 0;                                     // 초기화
		   for(int j = 1; j <num; j++) {
			   if(num%j==0) {
				   // j는 num의 약수
			   result += j;                 // 누적합계
		     }
		   } 
		   return result;           //반드시 리턴은 함수의 영역 마지막에 넣어야 리턴이 적용됨
	   }
	
	
	
		 // 3.완전수인지 확인하는 매서드
	     // 매서드명:isperfect
	    // 리턴타입:boolean
	    // 매개변수: int 1개
		 
		 private static  boolean isperfect(int num1) {
			 boolean result = false;                          // 초기화
			 
			 if(getSum(num1)==num1) {
				 // num1은 완전수!
				 result = true;
			 }
			  return result;		 
	}
		 
}
	
	

	
	
	
	
	
	
	
	
	

