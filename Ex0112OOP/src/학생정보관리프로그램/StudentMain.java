package 학생정보관리프로그램;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1 = new Student();      //stu1.은 private 이므로 자동완성에서 보면 필드들이 안보인다. 두가지 옵션을 선택한다
		stu1.setName("임경남");              // 그중 getter,setter 매서드를 설계 클래스에 만드는 방법을 선택함.
		stu1.setNumber("20220458");       // get변수명 set명수명 을 이름으로 갖는 매서드가 설계 클래스에 생성된다
		stu1.setAge(20);                  // 메인에서는 값을 입력시에 set변수명 이라는 매서드를 호출하여 타입에 맞게 값을 입력한다.
		stu1.setScoreJava(90);           // 필드 즉 변수에 값을 주는 거라면 = 인데 함수를 호출하는 것이므로 함수의 입력값을 주는 것
		stu1.setScoreWeb(30);
		stu1.setScoreAndroid(60);
		
		// 이름, 자바 점수 출력
		stu1.getName();                                // 출력문 정대주 출력
		stu1.getNumber();                              // 출력문 정재은 출력
		
		System.out.println(stu1.getName());            // 함수를 호출함= 리턴값을 출력함 = 프린트함수 필요
		System.out.println(stu1.getNumber());
		stu1.setName("ㅋㅋ");                   //함수안에 출력문이 있으니 출력문울 적을 필요는 없다 근데 함수안에 입력이 있으니 입력은 타입에 맞게 넣어준다
		System.out.println(stu1.getName());     
		
		// 매서드 이름위에 마우스 올리면 리턴타입 확인가능
		// 예)String a = stu1.getName(); 출력도 할 수있고 동일 타입의 변수에도 적용가능하다.  
		
		
		// Student 자료형으로 stu2 객체 형성
		Student stu2 = new Student("김기순","20242222",19);
		// new Student() --> 새로운 객체를 생성하는 순간에 실행되는 매서드!=생성자 매서드
		// 새로운 객체를 생성시 ()안에 필드값을 직접 입력시에는 반드시 ***생성자(constructor)***반드시 필요함
		
		// Student 클래스에는 원래 필드 6개를 디폴트로 선언했다.
		// stu2.setScoreAndroid(200);   // 직접 입력을 안하고 객체 공간이 생성되는 곳에 바로 입력함 
		System.out.println(stu2.getName());
		System.out.println(stu2.getAge());
		System.out.println(stu2.getScoreAndroid());    // 값을 미지정하여 int 기본값0 출력
		
		
		
		
		
		
	}

}
