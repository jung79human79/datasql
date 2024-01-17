package 닌텐도게임;

public class GameMain {

	public static void main(String[] args) {

		
		// 게임실행공간
		// 게임칩 가지고 오기
		Pokemon p = new Pokemon();
		// 게임칩 끼우기
		insert(p);       // Pokemon 자료형 변수
		
		// 마리오 젤다 게임칩 가져오기
		Mario m = new Mario();
		insert(m);                     // 상속되있으므로 형변환 =업캐스팅 자동형변환= Pokemon이 부모 마리오는 부모를 받는다. 
		                               // 오버라이드됨 = 밑에 매서드가 적용되므로 로직이 변화된 것임.
		Zelda z = new Zelda();
		insert(z);                     // 상속되있으므로 형변환  업캐스팅 자동형변환 Pokemon이 부모.  
		                               // 서브(하위)클래스가 부모(슈퍼,상위)클래스 타입으로 자동 형변환하는 것=업캐스팅 
		
	}
	
	// 게임칩을 끼우는 기능
	
	private static void insert (Pokemon game) {
		game.gameStart();	   // 매서드 호출
	}
	
//	private static void insert (Mario game) {     // 매서드 오버로딩 //코드가 길어진다 // 상속을 통한 오버라이딩이 더 유용함
//		game.gameStart();	
//	}
//	private static void insert (Zelda game) {
//		game.gameStart();	
//	}
	
	
	
	
	
	

}
