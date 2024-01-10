package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex07로또연습 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] lotto = new int[5];

		//lotto[0] = ran.nextInt(10) + 1;
		
		for(int j = 0; j <lotto.length ; j++) {
			lotto[j] = ran.nextInt(10) + 1;            
			for (int i = 0; i < j; i++) {
				if(lotto[i] == lotto[j]) {
					//lotto[j] = ran.nextInt(10) + 1;
					j--;
		     		break;                              // 바로위의 for문을 단절
				}	
			}
		}
		
		
		
		
//		for(int i = 0; i < 1; i++) {
//		lotto[1] = ran.nextInt(10) + 1;
//		if (lotto[i] == lotto[1]) {
//			lotto[1] = ran.nextInt(10) + 1;
//		}
//		}
//		
//		for(int i = 0; i < 2; i++) {
//		lotto[2] = ran.nextInt(10) + 1;
//		if (lotto[i] == lotto[2]) {
//			lotto[2] = ran.nextInt(10) + 1;
//		}
//		}
//		
//		
//		for(int i = 0; i < 3; i++) {
//		lotto[3] = ran.nextInt(10) + 1;
//		if (lotto[i] == lotto[3]) {
//			lotto[3] = ran.nextInt(10) + 1;
//		}
//		}
//		
//		
//		for(int i = 0; i < 4; i++) {
//		lotto[4] = ran.nextInt(10) + 1;
//		if (lotto[i] == lotto[4]) {
//			lotto[4] = ran.nextInt(10) + 1;
//		}
//		}
		
		System.out.println(Arrays.toString(lotto));
		
		
		
		
		
		
		
		
		
		
//		for (int i = 0; i < 5; i++) {
//			lotto[i]=ran.nextInt(10) + 1;
//			
//			if (lotto[0] == lotto[1]) {
//				lotto[1] = ran.nextInt(10) + 1;
//			}
//			if (lotto[0] == lotto[2] || lotto[1] == lotto[2]) {
//				lotto[1] = ran.nextInt(10) + 1;
//				lotto[2] = ran.nextInt(10) + 1;
//			}
//			if (lotto[0] == lotto[3] || lotto[1] == lotto[3] || lotto[2] == lotto[3]) {
//				lotto[1] = ran.nextInt(10) + 1;
//				lotto[2] = ran.nextInt(10) + 1;
//				lotto[3] = ran.nextInt(10) + 1;
//			}
//			if (lotto[0] == lotto[4] || lotto[1] == lotto[4] || lotto[2] == lotto[4] ||lotto[3] == lotto[4]) {
//				lotto[1] = ran.nextInt(10) + 1;
//				lotto[2] = ran.nextInt(10) + 1;
//				lotto[3] = ran.nextInt(10) + 1;
//				lotto[4] = ran.nextInt(10) + 1;
//			}	
//		}
//		
//		System.out.println(Arrays.toString(lotto));
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
