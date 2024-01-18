package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		// 실행공간 즉
        // 4개의 클래스의 객체생성
		RegularEmployee regular = new RegularEmployee("0001","정우성",7000,700);
		
		System.out.println(regular.print());    // 상속받았으므로 실행정상 //regular클래스에는 해당 함수가 없지만 부모에게 있으므로 사용가능.
		
		RegularEmployee regular1 = new RegularEmployee("0001","정재은",8500,700);
		
		System.out.println(regular1.print());
		
		TempEmployee temp = new TempEmployee("0002","장동건",4000);
		
		System.out.println(temp.print());
		
		PartTimeEmpioyee part = new PartTimeEmpioyee("0003","아이유",30,20);
		
		System.out.println(part.print());
		System.out.println(part.getMoneyPay());
		System.out.println(part.name);
		
	}

}
