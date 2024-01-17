package 페스티벌;

import java.util.Random;
import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {

		int[] array = new int[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번 째 정수입력 >> ");
			array[i] = sc.nextInt();
		}
		System.out.print("3의 배수 : ");
		int num = 0;
		for (int j = 0; j < array.length; j++) {
			if (array[j] % 3 == 0) {
				num = array[j];
				System.out.print(num + " ");
			}

		}
	}

}
