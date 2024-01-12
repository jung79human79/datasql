package 매서드;

public class Ex01매서드더하기 {
	
	// 매소드 : 반복적인 코드를 최소화 --->유지보수
	// 리턴타입 이나 매개변수는 사용 안할수 있음
	// 리턴타입x --> void
	// 매소드 중복정의 (오버로딩)
	//   --> 매서드 이름 동일하게 하고 매개변수타입이나 개수를 다르게 함으로써 중복을 정의하는 기법
	// {}안에 알고리즘 로직 + return;(리턴타입과 동일)
	

	public static void main(String[] args) {    // static=저장공간=이공간에 매서드를 저장= 출력시 제일 먼저 실행되는 공간
                                                 // public=접근제한자 ,여기서는 공용 프라이빗도 있음
	  
		// 매서드 사용하기 메인영역 안쪽에서 사용       // 주장,요지,논쟁=args=argument= 파라미터
		// 매서드 이름=addDouble 부르기
	//	double result = addDouble(4.2,3.14);      // 풀어쓴 표현                  
	//	System.out.println(result);
		System.out.println(addDouble(4.2,3.14));    // 간단표현
		
		System.out.println(subNum(7,3));
		
		//int result2 = subNum(1,2);
		//System.out.println(result2);
		
		printHello();     // 5번  //출력문이 이미 매서드에 들어있음
		printHello();     // 10번

	}
	
	// 빼기 매서드 생성
	// 리턴타입 : int / 매개변수 : int 2개 / 매서그명 : subNum
	// 매개변수로 받아온 데이터 2개를 뺀 결과값을 돌려주는 매서드
	// 단 큰수에서 작은수를 뺀 결과를 돌려주기
	public static int subNum (int num1,int num2) {
		int result =0;
		// 삼항연산자
        // 조건식 ? 참 : 거짓	
		result = num1 >= num2 ? num1-num2 :  num2-num1;
		return result; 
	    
	}
	// 매서드 생성 메인 영역 벗어나서~ 매서드안에 매서드 생성 안됨
	// 리턴타입 : double / 매개변수 :2개 double / 매서드명:addDouble
	 public static double addDouble (double num1,double num2) {     // 같은 메인 공간 static에 저장한다는 의미= 여기서는 콘솔창에 표현 = 나중에 객체지향 프로그램하면 static말고 다른것 사용함 
		 // 매서드는 리턴을 만나면 데이터를 반환하고 끝난다.
		 // 즉 return 키워드 위쪽에 코드를 작성할 것!
		 double result = num1+num2;
		 return result;                // 가장 마지막 코드 
	 }
	 
	 // hello world 를 5번 출력하는 매서드 (값을 저장하는 것이 아닌 출력하는 행위자체)
	 // 반환타입,매개변수 필요 없는 경우
	 public static void printHello () {
		 System.out.println("hello world");      //   return 필요없음
		 System.out.println("hello world");
		 System.out.println("hello world");
		 System.out.println("hello world");
		 System.out.println("hello world");
	 }
	 

}
