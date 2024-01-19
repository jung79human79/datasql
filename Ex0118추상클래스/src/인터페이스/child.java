package 인터페이스;

import 월급계산프로그램.Emplotee;  //동일 프로젝트이지만 다른 패키지

public class child extends Emplotee  implements  Temp, Temp2{

	public child(String empno, String name, int pay) {
		super(empno, name, pay);
	}

	@Override
	public void temp() {
		
	}

	@Override
	public int getMoneyPay() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
