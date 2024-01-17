package 상속기초;

public class Child extends Ex01Parent {
	
	// 자식 클래스 =새로운 클래스= 서브클래스
	// -->extends사용
	
	// 나만의 짜장면 매서드 만들기
	
	
	// 기능확장(=새로운 매서드) 생성 후 메모장 생성
	/**
	 * @author dj
	 * @since 24.01.17
	 * @return void
	 * @param 매개변수 없음
	 */
	public void makeJjaa() {
		System.out.println("맛있는 짜장면을 만든다!");
	}	
	
	
	
	
	@Override     // 표시해준다.=annotation(특정기능은 없다)   // Override는 자식클래스에서 발생한다= 자식이 부모를 가지고 와서 변화시키므로~ 
	public void makeJjam() {
		System.out.println("맛있는 해물이 가득 짬뽕을 만든다!");
	}
	// 매서드 오버라이딩(overriding) --> 부모 매서드를 수정--> 단,로직만 수정
    // 부모클래스가 가지고 있는 매서드의 틀(매서드명,리턴타입,매개변수)을 그대로 가지고 와서 {}안에 로직만  ***재정의*** 하는 기법	
	// 매서드 오버라이딩(overriding)은 상속이 전제되어 있어야 한다****
	
	
	
	
	

}
