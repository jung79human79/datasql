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
		System.out.print("arrary에 들어있는 홀수는  ");    // 33 10 25 7 12   33 0 25   1 x 1 3
		
		for (int i = 0; i < arrary.length; i++) {         // for문 하나 더 사용
			if (arrary[i] % 2 == 1) {
				asd = arrary[i];                        // asd=홀수만 저장
				count++;                              // 누적되므로 출력문을 따로 빼도 됨
				//System.out.print(asd + " ");          
			}
			System.out.print(asd + " ");         //  asd=  5개 전체 숫자 근데 0(초기값)과 홀수만 나옴  0은 항상 처음부분에 나옴 (if절 밖이므로), 카운트도 비정상
		}                                         // asd 값은 기억됨 count는 1씩 누적됨
		//System.out.print("arrary에 들어있는 홀수는  ");
		System.out.println("이며, ");
		System.out.print("총 " + count + "개 입니다.");
		
		// 강사님 방식-----
//		int [] arrary = new int[5];
//		Random ran = new Random();
//		
//		for (int i=0; i<arrary.length; i++ ) {
//			arrary [i] = ran.nextInt(100) + 1;
//		}
//		System.out.print("arrary에 들어있는 홀수는  ");
//		int count =0;
//		for (int i=0; i<arrary.length; i++ ) {       
//			if (arrary [i]%2==1) {
//				count++;
//				//System.out.print(arrary[i]+" ");   // arrary [i]는 홀수만
//			}
//			System.out.print(arrary [i]+" ");    // arrary [i]는 5개 전체 숫자,정상적으로 홀수도 짝수도 나옴 (if절 밖이므로) 카운트는 정상
//		}
//		System.out.println("이며, ");
//		System.out.println("총 "+ count +"개 입니다.");
		
		
		
		
	}

}

   




