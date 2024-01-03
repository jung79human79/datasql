package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//int num = 0;                                // 0은 초기화
		int num1= 0;                                 //num1 += num; 은 전역에서는 안됨  //누적시킬 변수가 필요함 //전역에 두어야 한다                                     
		
		while(true) {
			System.out.print("정수입력: ");
			int num = sc.nextInt();                       // 전역에 변수를 선언할 필요없다.                    
			                                             // 변수를 출력전에 선언해줘야함
			num1 += num;                                 // num1 = num+num1; 같은 내용  //누적증감
			System.out.println("누적결과: " + num1);
			
			if (num==-1 ) {
				System.out.print("종료되었습니다.");
				break;
			}
			
		}
		
		
		
		
		
	}

}
