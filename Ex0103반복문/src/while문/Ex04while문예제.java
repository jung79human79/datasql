package while문;

import java.util.Scanner;

public class Ex04while문예제 {

	public static void main(String[] args) {
		
		//1.입력도구꺼내기
		//2.정수 입력 출력하기
		//3.정수 입력 받기
		//4.입력받은 정수가 짝수라면 짝수의 개수를 +1
		//--> 짝수의 개수와 홀수의 개수를 구할 변수 하나씩 필요
        //5.입력받은 정수가 홀수라면 홀수의 개수를 +1
		//6.짝수와 홀수의 개수 출력하기
		//2~6까지 반복! -1을 입력하면 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;                                  //짝수변수
		int num2 = 0;                                  //홀수변수
		while(true) {
			System.out.print("정수입력: ");
			int num = sc.nextInt();
			if(num%2==0) {
				num1++;	                                      //1씩 누적 증가
			//System.out.println("짝수개수: "+num1);	
			//System.out.println("홀수개수: "+num2);
			}else if(num%2 ==1) {                                 // num%2 !=0 으로 주면 안됨
  			    num2++;
  			//System.out.println("짝수개수: "+ num1);
			//System.out.println("홀수개수: "+ num2);
	        }else if (num ==-1 ) {
				System.out.println("종료되었습니다.");
				break;
		 }
			System.out.println("짝수개수: "+num1);
			System.out.println("홀수개수: "+num2);
		}
		
	}
			
		
	}


