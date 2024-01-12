package 매서드;

import java.util.Scanner;

public class Ex04가까운수찾기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		int result = cldse10(num1,num2);
		System.out.print("10에 가까운 수 : " + result);
		
	}
    // 내가 했지만 실패같다
//	private static int cldse10(int num1, int num2) { 
//		// 거리값을 나타내는 값 = -없애는 방법 = |-1|은 1이다 
//		// - 없애는 방법 *이나 제곱
//		int min = 0;
//		//char min2 = '**';
//		if(10-num1*num1>10-num2*num2) {
//			return num1;		
//		}else if(10-num1*num1<10-num2*num2){
//			return num2;
//		}else if(10-num1==10-num2) {
//			return 0;
//		}else {
//			return 0;
//		}
		
		
		// 교수님 방식
		private static int cldse10 (int num1, int num2) {
			// 5,9 는 10에 가까운 수 =9
			// 10-5=5 / 10-9=1 
			// 11,15 10에 가까운 수 = 11
			// 10-11=-1 / 10-15=-5 더 작은 쪽이 10에 근처다고 할 수 없다
			// -1,-5에서 -를 빼는 방법 --> 제곱해주기 -한 결과값을 제곱해주기
		
			
//			if((10-num1)*(10-num1)> (10-num2)*(10-num2)) {
//				return num2;
//			}else if((10-num1)*(10-num1)< (10-num2)*(10-num2)) {
//				return num1;
//			}else{
//				return 0;
//			}
		
			// 절대값 = 수직선상위에서 거리를 나타내는 값
			// 다른 방식=자바에서 절대값 만들기 = |-1|=1            // 수학식을 빼기 위해서는 Math.을 사용 
			if(Math.abs(10-num1) > Math.abs(10-num2)) {      // abs는 절대값 표현= -빼기  ,abs()함수이므로 ()넣어준다
				return num2;
			}else if(Math.abs(10-num1) < Math.abs(10-num2)) {
				return num1;
			}else{
				return 0;
			}
	}	
}
