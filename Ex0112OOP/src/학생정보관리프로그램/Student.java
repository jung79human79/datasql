package 학생정보관리프로그램;

public class Student {
    
	// 필드 입력  소중한 학생정보이므로 접근제한 private
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	
	// 객체를 생성하는 순간에 실행되는 매서드
	// --> alt shift s 단축키로 생성가능 --> 제네래이트 constructor using fields 버튼
	
	// 필드에 있는 데이터를 객체를 생성하는 순간에 초기화(초기값)를 시켜줄 수 있도록 로직 작성
	public Student(String name, String number, int age) {   
	      this.name = name ;
	      this.number = number;
	      this.age = age;	
	}

	    // 생성자 = constructor   // 리턴타입이 없다 // 이름이 클래스와 동일해야함 // 생성자도 결국 메서드이다. 
		// 매개변수가 아무것도 없는 생성자 즉 기본생성자 라고 부는데 생략 가능하다 (디폴트 constructor)
	    // 단 새로운 나만의 생성자를 만들게 되면 기본 생성자는 덮어씌워진다(사라진다)
	    // 생성자도 오버로딩 (중복정의) 가능하다
		// 오버로딩: 매서드의 이름과 리턴타입이 동일한 상태에서 매개변수의 개수와 타입을 다르게 중복으로 정의하는 매서드 정의 기법
	
	public Student() {    // 중복으로 생성자 만듬  // 다트에서는 동일표현 public Student();가능 {}생략가능 
	}                     // 매개변수가 아무것도 없는 생성자 즉 기본생성자
	
	
	



	public String getName() {                      // 값을 출력
		return name;                               // 리턴타입이 있으면 출력문은 사용안됨
	}                                              // 함수를 메인에서 호출하려면 함수의 입력값이 있다면 ()안에 타입에 맞게 넣어야함
	                                               // 예)stu1.setName("dd");
	
	public void setName(String name) {             // 값을 입력
		this.name = name;
		System.out.println("정대주");
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
		System.out.println("정재은");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public int getScoreAndroid() {
		return scoreAndroid;
	}
	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	
    
		// getter 매서드
		// --> 클래스 내부에 있는 필드값을 외부(다른클래스)에서 가져갈 수 있는 매서드 예)메인함수등
		// 가지고 있는 것을 그냥 돌려준다
		
		
		// setter 매서드 
		// set= 수정 = 클래스 내부에 있는 필드 값을 외부(다른 클래스)에서 수정하도록 하는 매서드 
	    //--> 외부로부터 입력받아 수정 예)메인함수로부터 받은 입력값을 적용

	    // getter,setter 매서드 자동완성 단축키= alt shift s --> 제네레이트 옵션누르기
		// 단축키 안되면 마우스 우클릭 --> 소스 -->  제네레이트 옵션
	
	
	
	
	

	
	
	
	
	
	
	
}
