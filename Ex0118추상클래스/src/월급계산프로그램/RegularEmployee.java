package 월급계산프로그램;


public class RegularEmployee extends Emplotee {
	
//===============================================필드변수선언======================================================
	//private  String empno;
	//private String name;
	//private int pay;
	private int bonus;
	
//====================생성자매서드(리턴타입안함,클래스와 동일명)==============================================================================	
// 4개의 변수를 가진 생성자로써 객체생성시 4개의 변수를 초기화
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno,name,pay);  // 부모클래스 생성자 매서드를 불러준다. 그것이 super() 근데 매개변수 있으므로 파라미터를 적어준다. 동일 변수명을 적는다.
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
		this.bonus = bonus;
	}
	
//=============================매서드생성==========================================================================================	
	// 월급여를 계산해서 리턴
	public int getMoneyPay () {      // 구현 즉 오버라이딩해야함 재정의 햐야함.
		
		return (pay+bonus)/12;
		
	}
	
	//public String print () {
		
	//	return empno +" : " + name + " : " + pay;       // ""안함
		
	//}

//==================================get,set 매서드=======================================================================

//	public String getEmpno() {
//		return empno;
//	}
//
//
//
//	public void setEmpno(String empno) {
//		this.empno = empno;
//	}
//
//
//
//	public String getName() {
//		return name;
//	}
//
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//
//	public int getPay() {
//		return pay;
//	}
//
//
//
//	public void setPay(int pay) {
//		this.pay = pay;
//	}
//
//
//
//	public int getBonus() {
//		return bonus;
//	}
//
//
//
//	public void setBonus(int bonus) {
//		this.bonus = bonus;
//	}
	
	
	

}



