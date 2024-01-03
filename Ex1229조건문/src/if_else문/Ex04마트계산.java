package if_else문;

import java.util.Scanner;

public class Ex04마트계산 {

	public static void main(String[] args) {
		// 만원짜리 물건 구매시 지불금액계산 단 11개상 구매시 전체금액의 1%할인
				Scanner sc = new Scanner(System.in);
				System.out.print("상품갯수: ");
				int gift = sc.nextInt();
				int money = 0;
				// 선물세트 구입시 지불할 금액계산
				if (gift>=11) {
					//11개 이상 구매시 전체금액에서 10%할인 (1세트:10000)
					money = (int) (10000*gift*0.9);  //값에 소수점이 있어 더블자료형이므로 정수자료형으로 형변환
				} else {
					//그렇지 않으면 정가로 구매
					money = 10000*gift;
				}
				//가격출력하기
				System.out.print("가격은 " + money + "원 입니다.");
	}

}
