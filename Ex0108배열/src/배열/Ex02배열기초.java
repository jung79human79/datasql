package 배열;

public class Ex02배열기초 {

	public static void main(String[] args) {

		
		int [] numbers = new int[5];
		
		// 배열의 길이 보는 법
		// 변수명.length;  // 변수에 담아 출력
		int  length = numbers.length;
		System.out.println(length);
		
		// 배열의 각 칸을 5의 배수로 초기화해 주세요
		
		for(int i=0; i<numbers.length; i++ ) {      // length을 쓰는이유 한 번에 코드 수정(유지보수)
		numbers[i] = (i+1)*5;
//		System.out.print(numbers[i]+ " ");       // 안에 넣어도 됨.
		}
		
		for(int i=0; i<numbers.length; i++ ) {
		System.out.print(numbers[i] + " "); 
		}
//		numbers[0] = 5;
//		numbers[1] = 10;
//		numbers[2] = 15;
//		numbers[3] = 20;
//		numbers[4] = 25;
		
		System.out.println();
		
		// 배열을 생성함과 동시에 데이터를 집어넣는 방법
		String[] names = {"이도연","강우석","정대주"} ;   // 3칸짜리

	   // 강우석 데이터 출력
		System.out.println(names[1]);
		
		
	}

}
