package 다중if문;

import java.util.Scanner;

public class Ex02학점계산프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력: ");
		int totalScore = sc.nextInt();
		// 90점이상 -> A학점입니다
		// 80점 이상90점미만 -> B학점입니다
		// 70점이상 80점미만 -> C학점입니다
		// 70점미만 -> D학점입니다
		if(totalScore>=90) {
			System.out.print("A학점입니다");
		}else if(totalScore>=80){                    // 이미 90점은 거짓으로 판단되었음
			System.out.print("B학점입니다");
	    }else if(totalScore>=70) {                   // 이미 90점,80점은 거짓으로 판단되었음
	    	System.out.print("C학점입니다");           
	    }else {  
	    	System.out.print("D학점입니다");           // 이미 90,80,70점은 거짓으로 판단되었음
        }
}	
}