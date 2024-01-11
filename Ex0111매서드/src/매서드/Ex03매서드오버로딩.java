package 매서드;

public class Ex03매서드오버로딩 {

	public static void main(String[] args) {

	    // 매서드 사용
		// 매개변수의 개수를 다르게하거나 타입을 다르게 해서 이름을 똑같이 부여한다.
		System.out.println(add(4.2,5));   // 타입에 해당하는 값을 입력해주면 알아서 해당함수을 선택해준다.
		System.out.println(add(3,5));      
		System.out.println(add(3.2,5.2));
		
		
		
		
	}
	// 매서드 오버로딩 = 중복정의 책209페이지 참조
	// 매서드 이름 중복
	// 매개변수를 다르게 해줘야 해당 매서드를 선택
	
	// 매서드 오버로딩 성립조건 
	// 1 매서드 이름이 같아야 한다
	// 2.매개변수의 개수 혹은 자료형 타입이 달라야한다
	// 3.매개변수와 매소드 이름이 같고 리턴 타입이 다른 경우는 오버로딩이 아니다.  // 영상참조하자
	
	// *매서드 오버라이드와는 다르다
	private static double add ( double num1, int num2) {      // 매개변수타입에 무조건 한개는 리턴타입과 같은 타입을 주어야 함 
		return num1+num2;
	}
	
	private static int add (int num1,int num2) {
		return num1+num2;
	}
	
	private static double add (double num1, double num2) {
		return num1+num2;
	}
	
	
	
	
	
	

}
