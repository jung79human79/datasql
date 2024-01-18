package 월급계산프로그램;

public abstract class Emplotee {    // 부모클래스이다.
	
    // private는 해당 클래스만 사용가능 하므로 (외부 클래스 접근불가)
	// 디폴트:같은 패키지에 있는 클래스만 접근가능
	// 프로텍트:상속관계에 있거나 같은 패키지에 있는 클래스만 접근가능  // 상속은 다른 패키지와 다른 패키지에서도 가능한가?
	// private<<디폴트(아무것도안적은 경우)<<protected<<public
	// 공통 필드이므로 부모에게 놔둔다 어차피 상속이므로 자식들이 사용한다
	// 단 private 접근제한자를 protected로 바꾼다.
	protected String empno;
	protected String name;
	protected int pay;
	
	// 추상매서드
	// getMoneyPay ();매서드는 로직만 다를 뿐 다른 것은 같으므로 공통틀로 사용가능하다.
	// 단 자식에서 매서드를 삭제하면 안된다 == 왜냐면 오버라이딩 해야하므로~
	public abstract int getMoneyPay ();
	
	// public이므로 가져와도 에러 없음  
	// 완전히 같은 매서드 이므로 통으로 부모에게 가져온다 어차피 상속되므로 메인에서
	// 언제든 사용가능 예)regular.print()
	//완전히 동일한 경우는 자식에서 매서드를 삭제한다=코드간소화
	public String print() {

		return empno + " * " + name + " * " + pay;

	}
	
	// 생성자도 공통된 부분만 부모에게 놔둔다    // 추상화가 안된다 == 부모클래스가 없으므로~??
	public Emplotee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;	
	}
	
    //추상 클래스를 왜 쓸까?
	//반드시 따라야만 하는 일종의 규격을 정해줘야 함
	// -->구현의 강제성을 가짐 예)오버라이딩
	// -->개발자들끼리 규약
	

	

}
