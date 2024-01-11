package 매서드;

import java.util.Scanner;

public class Ex02매서드계산기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		char op = '*';                                // 이 코드 중요 변경하면서 출력해보기~
		System.out.println(cal(num1,num2,op));        // 결과값은 int 간단표현으로 함수 불러오기~
	}
	
	// private=여기서만 사용=다른 클래스는 접근 및 사용 불가능하게 하는 접근제한자
	public static int cal (int num1,int num2,char op) {    // 매개변수 타입이 서로 달라도 최종 반환값(return)타입이 함수 반환타입과 일치하면 된다 
		int result =0;                               // 매개변수를 선언하면 {}영역에서는 변수이름을 재사용가능~
		// op가 어떤 연산자가 들어있는지 판별
		if(op == '+') {
			result = num1+num2; 
			// return num1+num2;                    // num1+num2도 정수 // 밑에 return result;과 위에 int result =0;도 필요없음 //단 반드시 else문 넣어야함
		}else if (op == '-') {
			result = num1 >= num2 ? num1-num2 :  num2-num1;
		}else if (op == '*') {
			result = num1*num2;
		}else if (op == '/') {
			result = num1/num2;
		}else {
			return 0;                           // 어차피 0도 정수 //조건에 맞지 않는 연산자가 들어올때~
		}
		return result;                // 반환값이 int
	}
	
	
	
	
	

}
