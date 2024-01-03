package 스위치문;

import java.util.Scanner;

public class Ex02자판기프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요.");
		int price = sc.nextInt();
		System.out.println("메뉴를 입력하세요");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >>");
		int menu = sc.nextInt();
		
		int result = price;    // 메엔변수      
	
		if (menu==1) {
			//System.out.print("잔돈: " + (price-700) +" 원")
			if(price >=700) {
				result = price-700;
			}else {
				System.out.println("돈이 부족해요ㅠㅠ");
			}
		}else if(menu==2) {
			//System.out.print("잔돈: " + (price-1000) +" 원");
			if(price >=1000) {
				result = price-1000;
			}else {
				System.out.println("돈이 부족해요ㅠㅠ");
			}
			
		}else if (menu==3){
			//System.out.print("잔돈: " + (price-500) +" 원");
			if(price >=500) {
				result = price-500;
			}else {
				System.out.println("돈이 부족해요ㅠㅠ");
			}
			
		}else {
			System.out.println("메뉴를 다시 골라주세요");
		}
	
		System.out.println("잔돈: " + result +" 원");
		
		System.out.print("천원: " + result/1000 + "개 ");  
		System.out.print("오백원: " + result%1000/500 + "개 ");
		System.out.print("백원: " + result%1000%500/100 + "개 ");
		
		
		
		
	}

}
