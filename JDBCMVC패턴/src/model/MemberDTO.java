package model;

public class MemberDTO {

	// 모델역할
	// DTO --> 데이터 트랜스퍼 오브젝트--> getter 매서드 
	
	// VO  -- > 밸류 오브젝트 --> getter, setter 매서드 
	
	// 1. 필드 (id pw 이름 나이 정수)
	 private String id;
	 private String pw;
	 private String name;
	 private int age;
	 private int score;
	 
	 
	// 2. 매서드(모든매개변수를 받는 생성자 1개 getter매서드)
//======================================================================================	 
	public MemberDTO(String id, String pw, String name, int age, int score) {
		//super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.score = score;
	}
//================================================================================================	
	
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getScore() {
		return score;
	}
	
	
}
