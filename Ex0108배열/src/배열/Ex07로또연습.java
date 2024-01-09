package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex07로또연습 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] lotto = new int[5];

//		lotto[0] = ran.nextInt(10) + 1;
//		
//		lotto[1] = ran.nextInt(10) + 1;
//		if (lotto[0] == lotto[1]) {
//			lotto[1] = ran.nextInt(10) + 1;
//		}
//		
//		lotto[2] = ran.nextInt(10) + 1;
//		if (lotto[0] == lotto[2]) {
//			lotto[2] = ran.nextInt(10) + 1;
//		}
//		if (lotto[1] == lotto[2]) {
//			lotto[2] = ran.nextInt(10) + 1;
//		}
//		
//		lotto[3] = ran.nextInt(10) + 1;
//		if (lotto[0] == lotto[3]) {
//			lotto[3] = ran.nextInt(10) + 1;
//		}
//		if (lotto[1] == lotto[3]) {
//			lotto[3] = ran.nextInt(10) + 1;
//		}
//		if (lotto[2] == lotto[3]) {
//			lotto[3] = ran.nextInt(10) + 1;
//		}
//		
//		lotto[4] = ran.nextInt(10) + 1;
//		if (lotto[0] == lotto[4]) {
//			lotto[4] = ran.nextInt(10) + 1;
//		}
//		if (lotto[1] == lotto[4]) {
//			lotto[4] = ran.nextInt(10) + 1;
//		}
//		if (lotto[2] == lotto[4]) {
//			lotto[4] = ran.nextInt(10) + 1;
//		}
//		if (lotto[3] == lotto[4]) {
//			lotto[4] = ran.nextInt(10) + 1;
//		}
//		
//		System.out.println(Arrays.toString(lotto));
		
		
		for (int i = 0; i < 5; i++) {
			lotto[i]=ran.nextInt(10) + 1;
			
			if (lotto[0] == lotto[1]) {
				lotto[1] = ran.nextInt(10) + 1;
			}
			if (lotto[0] == lotto[2] || lotto[1] == lotto[2]) {
				lotto[1] = ran.nextInt(10) + 1;
				lotto[2] = ran.nextInt(10) + 1;
			}
			if (lotto[0] == lotto[3] || lotto[1] == lotto[3] || lotto[2] == lotto[3]) {
				lotto[1] = ran.nextInt(10) + 1;
				lotto[2] = ran.nextInt(10) + 1;
				lotto[3] = ran.nextInt(10) + 1;
			}
			if (lotto[0] == lotto[4] || lotto[1] == lotto[4] || lotto[2] == lotto[4] ||lotto[3] == lotto[4]) {
				lotto[1] = ran.nextInt(10) + 1;
				lotto[2] = ran.nextInt(10) + 1;
				lotto[3] = ran.nextInt(10) + 1;
				lotto[4] = ran.nextInt(10) + 1;
			}	
		}
		
		System.out.println(Arrays.toString(lotto));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
