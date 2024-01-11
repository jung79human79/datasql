package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08보충수업 {

	public static void main(String[] args) {

		// 배열이해(강사)
		// 배열이란 ---> 여러개의 데이터를 일괄된 순서로 한번에 다룰 수 있는 데이터 구조(자료구조)
		
		// 숫자 데이터 5개를 담을 수 있는 array배열을 만들자
		
		int[]array = new int[5];   // new = 공간을 만들겠다
        //array [0]=10;
        //array [1]=20;
		
		int num =10 ;
        for(int i=0; i<array.length; i++) {        
        	array [i]=num;
        	num = num+10;          // num+=10;
        }
        
        
        // 정수 데이터 10개를 담을 수 있는 numArrary를 만들자
        // numArrary에 사용자가 입력한 값을 전부 채워라
       
        int[]numArrary = new int[10];
        Scanner sc = new Scanner(System.in);
         
        for(int i=0; i<numArrary.length; i++) {
        System.out.print("입력값 : ");
        //int num1 = sc.nextInt();
        numArrary [i]= sc.nextInt();
       }
        System.out.print(Arrays.toString(numArrary));		     
	}

}
