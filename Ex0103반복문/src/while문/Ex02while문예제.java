package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		while(num<10) {
			System.out.println("정수입력: " + num);
			num++;
		}
		System.out.print("종료되었습니다.");
	}

}
