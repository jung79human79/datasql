package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int num1 = 0;                                        
		
		while(true) {
			System.out.print("정수입력: ");
			num = sc.nextInt();
			num1 = num+num1;
			System.out.println("누적결과: " + num1);
			
			if (num==-1 ) {
				System.out.print("종료되었습니다.");
				break;
			}
			
		}
		
		
		
		
		
	}

}
