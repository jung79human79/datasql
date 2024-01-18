package 월급계산프로그램;

public class PartTimeEmpioyee  extends Emplotee{
	
	//private String empno;
	//private String name;
	//private int pay;
	private int workDay;
	
	
	public PartTimeEmpioyee(String empno, String name, int pay, int workDay) {
		super(empno,name,pay);
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
		this.workDay = workDay;
	}
	
	public int getMoneyPay() {

		return pay * workDay;             // 구현 즉 오버라이딩해야함 재정의 햐야함

	}

	//public String print() {

	//	return empno + " : " + name + " : " + pay;

	//}
	
	
	
//=====================================================================================================================	

//	public String getEmpno() {
//		return empno;
//	}
//
//	public void setEmpno(String empno) {
//		this.empno = empno;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getPay() {
//		return pay;
//	}
//
//	public void setPay(int pay) {
//		this.pay = pay;
//	}
//
//	public int getWorkDay() {
//		return workDay;
//	}
//
//	public void setWorkDay(int workDay) {
//		this.workDay = workDay;
//	}
	
	
	
	
	

}
