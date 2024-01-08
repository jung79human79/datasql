package 배열;

import java.util.Random;

public class Ex03가장큰수찾기 {

	public static void main(String[] args) {

		int [] arrary = new int[5];
		Random ran = new Random();
		
		for (int i=0; i<arrary.length; i++ ) {
			arrary [i] = ran.nextInt(100) + 1;
		}
		System.out.print("arrary에 들어있는 홀수는  ");
		int count =0;
		for (int i=0; i<arrary.length; i++ ) {
			if (arrary [i]%2==1) {
				count++;
				System.out.print(arrary [i]+" ");
			}
			
		}
		System.out.println("이며, ");
		System.out.println("총 "+ count +"개 입니다.");
		
		
	}

}
