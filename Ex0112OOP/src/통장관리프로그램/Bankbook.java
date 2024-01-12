package 통장관리프로그램;

public class Bankbook {
    // 반드시 저장해야함
	// 통장 설계도면 생성 = 통장 자료형 생성 = 통장 클래스 생성
	
	// 1.필드 (속성,데이터) 설정
	// 잔액
	// 필드에도 접근제한자 붙임 가능 = 캡슐화 = 담아서 안보이게 정보은닉함 = 사용자가 임의로 변경하는 것을 막음
	 private int money ;            // 초기값 0
	 
	// 2.매서드(행위,로직,기능) 설정
	// 입금(deposit)
	// 출금(withdraw)
	// 잔액확인(showMoney)
	 public void deposit (int money) {                // 메인클래스에서 사용해야 하므로 public
		 this.money += money;
		 // this : 현재 클래스 자체를 의미하는 키워드
		}
	 public void withdraw (int money) {
		 this.money -= money;	
		 //System.out.println(money);              //리턴이 void 이므로 가능
		}
	 public int showMoney () {                     // static 사용안함 = 객체를 만들면 바로 메서드를 사용가능하므로 필요없다.
		   // 매개변수x
		return money;
		// System.out.println(money);        // 반환타입 있는경우 리턴만 가능함
			
		}
	 // System.out.println(money);      // 반드시 매서드안에~  //출력문은 주로 해당클래스의 메인클래스에서~
	
	
	
	
	
	
	
	
	
	
	
	
	
}
