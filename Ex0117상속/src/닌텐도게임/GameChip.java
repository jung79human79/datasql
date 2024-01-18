package 닌텐도게임;

//객체지향 4가지 속성 중 추상추가
// 추상클래스도 일반 매서드 가질 수 있다 
// 추상매서드 1개라도 있다면 반드시 클래스도 추상되어야함
// 일반 매서드만 가지고 있더라도 추상 클래스 만들수 있음
// 객체 생성 할 수 없다
public abstract class GameChip {

	// 닌텐도에 들어갈 수있는 모든 게임칩의 공통의 부모클래스
	
	// 공통 규격을 담는 함수 = gameStart()를 생성
	// 부모클래스에서는 굳이 로직은 필요하지 않지만 서브클래스가 반드시 실행되야할 매서드이다 즉 공통틀이 되므로 추상화 매서드로 표현 
	// 서브클래스를 가 보면 반드시 gameStart()매서드가 있다 없다면 구현(=implement)해야한다 부모에서 추상화 매서드를 만들었기 때문에 따라야 한다.
	// 한마디로 부모건 자식이건 반드시 있어야 할 공통 클래스라고 보면 된다.
	public abstract void gameStart(); // abstract 추가
	// 1.추상매서드
	// --> {}가 없는 매서드
	// 선언(틀: 매서드명 매개변수 리턴타입)은 되어 있으나 로직{}이 구현되지 않은 매서드
	// abstract 라는 키워드를 사용한다
	// 추상매서드는 서브클래스(자식클래스)에서 오버라이딩 필수

}
