package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex09로또_보충수업 {

	public static void main(String[] args) {

		// 1차원 배열 2중for문
		// 중복없이 숫자 6개 뽑기
		int [] lotto = new int[6];
		//랜덤값으로 배열에 값 담아주기
		Random ran = new Random();
		//lotto[0] = ran.nextInt();
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = ran.nextInt(45)+1;
			// 앞서 뽑은 숫자와 비교하는 반복문
			for (int j=0; j<i; j++) {
				if(lotto[j] == lotto[i]) {
					// 앞서 뽑은 숫자와 같은 수가 있다면
					// 다시 뽑기 위해서 인덱스 값을 1 감소
					i--;	
				}	
			}
		}
		System.out.print(Arrays.toString(lotto));
	}

}
