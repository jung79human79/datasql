package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex03가장큰수찾기 {

	public static void main(String[] args) {

		// 1 배열선언
		int[] arrary = new int[5];
		// 2 랜덤한 숫자로 배열 초기화(1~10)
		Random ran = new Random(); // 도구 꺼내옴
		for (int i = 0; i < arrary.length; i++) {                     //반복문
			arrary[i] = ran.nextInt(10) + 1;
		}
		// 3 가장큰수 선언하는 변수 max 선언
		int max = 0;
		// 4 max와 배열안에 들어있는 값 비교하기 (0번부터 인덱스까지~)
		for (int i = 0; i < arrary.length; i++) {                     //반복문
			if (arrary[i] > max) {
				// 5 만약 배열안에 들어 있는 값이 max보다 크면 max을 배열안에 있는 값으로 변경하기
				max = arrary[i];           // max 값 기억 저장됨.
			}
		}
		// 6 배열안에 모든 값을 출력
		System.out.println("배열안에 들어 있는 값 : " + Arrays.toString(arrary)); 
		
		// 7 가장 큰 값 출력
		System.out.println("가장 큰 값은 " + max + "입니다.");

	}

}
