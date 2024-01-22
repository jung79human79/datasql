package model;

public class MemberDTO {

	// 모델역할 == 내가 설계한 나만의 자료형
	// DTO --> 데이터 트랜스퍼 오브젝트--> getter , setter매서드 
	
	// VO  -- > 밸류 오브젝트 --> getter 매서드만 
	
	// 1. 필드 (id pw 이름 나이 정수)
	
	 private String id;
	 private String pw;
	 private String name;
	 private int age;
	 private int score;
	 
	 
	// 2. 매서드(모든매개변수를 받는 생성자 )
//======================================================================================	 
	public MemberDTO(String id, String pw, String name, int age, int score) {     //회원가입에서 생성자
		//super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public MemberDTO(String id2, String pw2, int score, int age) {            // 회원정보수정에서 생성자 
		this.id = id2;
		this.pw = pw2;
		this.score = score;
		this.age = age;
	}
//====================================getter매서드,setter매서드============================================================
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
	 public void setId(String id) {
			this.id = id;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setScore(int score) {
			this.score = score;
		}
	
	
}
