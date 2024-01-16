package 페스티벌;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//        System.out.print("총 입금액 : ");
//        int money = sc.nextInt();
//        System.out.println();
//        System.out.println("잔돈 : " + money  + "원");
//        System.out.println("10000원 : " +money/10000  + "개");
//        System.out.println("5000원 : " + money%10000/5000 + "개");
//        System.out.println("1000원 : " +money%10000%5000/1000  + "개");
//        System.out.println("500원 : " + money%10000%5000%1000/500  + "개");
//        System.out.println("100원 : " + money%10000%5000%1000%500/100 + "개");
//        
        
        
//        Scanner sc = new Scanner(System.in);
//		System.out.print("총금액 입력 : ");
//		int money = sc.nextInt();
//		System.out.println("");
//		
//		// if문
//		if(money > 0) {
//			System.out.println("잔돈 : " + money);
//			System.out.println("10000원 : " + money/10000 + "개");
//			System.out.println("5000원 : " + money%10000/5000 + "개");
//			System.out.println("1000원 : " + money%5000/1000 + "개");
//			System.out.println("500원 : " + money%1000/500 + "개");
//			System.out.println("100원 : " + money%500/100 + "개");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력 : ");
//		int num = sc.nextInt();
//		if(num%10>5) {
//			num = num/10*10 + 10;
//		}else {
//			num = num/10*10;
//		}
//        System.out.println("반올림수 : " + num);
	
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자입력 : ");
		int num = sc.nextInt();
		System.out.print("두번째 숫자입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num*(num2%100%10));   //  num2%10
		System.out.println(num*(num2%100/10));
		System.out.println(num*(num2/100));
		System.out.println(num*num2);
		
		
	}

}
