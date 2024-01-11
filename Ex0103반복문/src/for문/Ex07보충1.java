package for문;

public class Ex07보충1 {

	public static void main(String[] args) {
             // for : 반복 횟수가 정해져 있을때 (~언제부터~언제까지)
		      // i=0 ...0
		    // i=1 ...1
		    // i=2 ...2
		   // i=3 ...3 조건부에서 끝남
		for (int i=0; i<3; i++) {
			System.out.print(i);      // i의 값마지막은 3이다. 출력은 2
		}
		System.out.println();
		
		// 1부터 9까지 출력..
		for (int i=1; i<10; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		// 구구단 2단
		for (int i=1; i<10; i++) {
			System.out.print(i*2 + " ");    // println도 함수이다.
		}
		System.out.println();
		
		// 2*1=2 출력
		for (int i=1; i<10; i++) {
			// int result = 2*i;
			System.out.println(2+"*" + i + "=" + 2*i + " ");
		}
		System.out.println();
		
		// (문제1)
		// 1~100까지 출력
		// 2. 짝수-->음수로 출력  홀수-->양수로 출력
		// 3. 총합
		int total = 0;
		for(int i=1; i<101; i++) {
			if(i%2 == 0) {
				System.out.print(-i+" ");     // -> -1*i = -i  // i=-i로 대입연산자를 넣어야 음수가 된다.
				total = total-i;
			}else {
				System.out.print(i+ " ");
				total = total+i;
			}
		}
		System.out.println();
		System.out.println("결과 : " + total );
		
		// 
	}

}
