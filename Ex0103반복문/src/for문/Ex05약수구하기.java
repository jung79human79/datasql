package for문;

import java.util.Random;
import java.util.Scanner;

public class Ex05약수구하기 {

	public static void main(String[] args) {
		
 
		//Random ran = new Random();
		//int ranNum = ran.nextInt();
		//Scanner sc = new Scanner(System.in);
		//System.out.print("정수입력: ");
		//int num = sc.nextInt();
		//for(int i=1; i==num; i++) {
			//if (num%ranNum==0) {
			//System.out.println(i+" ");
			//}
		//}
		
		
		//약수구하기
		//1입력도구
		Scanner sc = new Scanner(System.in);
		//2.정수입력받기
		System.out.print("정수입력: ");
		int input = sc.nextInt();
		//3.약수출력하기
		for( int i=1; i<=input; i++ ) {
			if(input%i==0 ) {                   //임의의 수가 i변수
				//약수인 경우
				System.out.print(i+", ");
			}
			
		}
		
		
	}

}
