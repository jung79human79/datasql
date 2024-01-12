package 통장관리프로그램;

public class BankMain {

	public static void main(String[] args) {

		// 실행공간
		// 뱅크북 설계도면을 기반으로 뱅크1이라는 객체를 생성
		// 자료형명= 클래스명
		
		Bankbook bank1 = new Bankbook();      //Bankbook이 설계도 bank1이 객체(설계도로 만들어낸 객체) 하나의 설계도로 여러 객체 만들 수 있다.
		//System.out.println(bank1.money);     //private이므로 에러
		//bank1.money=500;                     //private이므로 에러
		
		// 2. bank1에 500원 입금
		bank1.deposit(500);              // 함수을 호출해서 입력값을 ()안에 주면 함수의 출력이 실행되므로 500원이라는 값이 저장된다
		// 3.출금 300원
		bank1.withdraw(300);
		// 4.잔액확인
		bank1.showMoney();                         // 
		System.out.println(bank1.showMoney());     // return money;를 출력하려면 해당함수를 호출해야함
		
		
		
		
		
	}

}
