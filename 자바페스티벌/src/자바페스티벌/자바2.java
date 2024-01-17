package 자바페스티벌;

import java.util.Scanner;

public class 자바2 {

	public static void main(String[] args) {

				
				Scanner sc = new Scanner(System.in);
				System.out.print("총금액 입력 : ");
				int money = sc.nextInt();
				System.out.println("");
				
				System.out.println("잔돈 : "+money);
				int[] currency = {10000, 5000, 1000, 500, 100};
				for(int i = 0; i<currency.length; i++) {
					System.out.println(currency[i] + "원 : " + money/currency[i] +"개" );
					money %= currency[i];
				
				}
				
			}

		
		
		
	
}




