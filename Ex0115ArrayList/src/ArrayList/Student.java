package ArrayList;

public class Student {

	// 필드 속성 데이터
	// 이름 나이
	private String name;
    private int age;
    
    
    
    // 매서드 기능 로직 행위
 	// get set 매서드=필드를 프라이빗으로 한다는 의미
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// 생성자(모든 필드값을 채우는 생성자)
	public Student(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
}
