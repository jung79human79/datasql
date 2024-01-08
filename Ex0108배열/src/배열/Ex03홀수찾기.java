package 배열;

import java.util.Random;

public class Ex03홀수찾기 {

	public static void main(String[] args) {

		int[] arrary = new int[5];
		Random ran = new Random();

		int count = 0;
		int asd = 0;

		for (int i = 0; i < arrary.length; i++) {
			int ranNum1 = ran.nextInt(100) + 1;
			arrary[i] = ranNum1;
		}
		System.out.print("arrary에 들어있는 홀수는  ");
		for (int i = 0; i < arrary.length; i++) {
			if (arrary[i] % 2 == 1) {
				asd = arrary[i];
				count++;
				System.out.print(asd + " ");
			}
			//System.out.print(asd + " ");         에러=전체 저장된 숫자5개 모두 보임(if절 밖이므로), 카운트는 제대로 계산됨
		}
		System.out.println("이며, ");
		System.out.print("총 " + count + "개 입니다.");
	}

}
