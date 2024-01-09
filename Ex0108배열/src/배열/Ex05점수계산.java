package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05점수계산 {

	public static void main(String[] args) {

		// 변수 3개 max, min, sum 선언

		Scanner sc = new Scanner(System.in);

		// 1 성적 데이터를 저장하는 배열 생성
		int[] score = new int[5];
		// 2 성적입력(5개)
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번째 점수입력: ");     // 출력문도 5번 반복
			score[i] = sc.nextInt();               // 처음 입력값은 0번째 입력 두번째는 1번째 인덱스로~
		}

		// 3입력받은 데이터 전부 출력
		//System.out.println("입력된 점수 : " + Arrays.toString(score));

		// 4 max min sum 변수선언
		int max = 0;
		int min = score[0];      // 인덱스 1번을 적용 0을 쓰면 안됨. 0번째 부터 비교하므로~  //int min = 100; --> 100점이 가장 큰 값이므로
		int sum = 0;

		// 5 배열안에 모든 데이터와 max를 비교하면서 최고점수 구하기 비교하려면 한번씩 돌아야함 고로 for문
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];                        //값저장
			}
			// 6 배열안에 모든 데이터와 min를 비교하면서 최저점수 구하기 한번씩 돌아야함 고로 for문
			if (score[i] < min) {
				min = score[i];                         //값저장
			}
			// 7 배열안의 모든 데이터를 더해서 총합 구하기
			sum += score[i];                           // sum= sum+ score[i];
		}
		// 8 결과값들 출력하기(평균은 소수점이 나오도록!)
		System.out.println("입력된 점수 : " + Arrays.toString(score));
		System.out.println("최고점수 : " + max);
		System.out.println("최저점수 : " + min);
		System.out.println("총합 : " + sum);
		System.out.print("평균 : " + (float)sum/score.length);     //소숫점
	}

}
