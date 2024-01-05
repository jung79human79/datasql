package 이중for문;

public class Ex04공포의별짓기 {

	public static void main(String[] args) {

		// System.out.print(" "+"*");
		// * -> space 4번 ,*1번
		// **
		// ***
		// ****
		// *****

		for (int i =1; i < 6; i++) {             //출력이 2개 반복 고로 for문도 2개 사용

			for (int j = 0; j < 5-i; j++) {         // 4-3-2-1-0   //먼저 4개찍고 다음 for문으로~
				System.out.print(" ");
			}
			for (int j = 0; j <i; j++) {            // 1-2-3-4-5   //*1개 찍고 다음 개행
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
