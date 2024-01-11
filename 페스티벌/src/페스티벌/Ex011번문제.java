package 페스티벌;

import java.util.Scanner;

public class Ex011번문제 {

	public static void main(String[] args) {

		
    System.out.print("일한시간을 입력하세요: ");
   
    Scanner sc = new Scanner(System.in); 
    int hour = sc.nextInt();
    
    int add = 0;
    int money = 0;
    if( hour>8) {
    	add= hour-8;
    	money = (int)(5000*add*1.5)+(5000*8);
    }else {
    	money = 5000*hour;
    }
    System.out.print("총 임금은 " + money + "원 입니다.");
	
	}
}
