package for문;

import java.util.Scanner;

public class Ex03구구단 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력: ");
		int dan = sc.nextInt();                       
		System.out.print("어느 수까지 출력: ");         
		int su = sc.nextInt();
		for (int i=1; i<=su; i++) {                                  //()안에 변수사용가능 숫자값이므로~
			System.out.println(dan + "*" + i + "=" +(dan*i));
		}
		
	}

}
