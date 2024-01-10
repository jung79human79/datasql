package 이차원배열;

import java.util.Arrays;

public class Ex01이차원배열생성 {

	public static void main(String[] args) {

		
		// 이차원배열:배열안에 또 다른 배열이 있는 형태
		// 참조가 2번 일어나는 형태(참조의 참조다)
		
		// 1. 이차원 배열 선언 방법
		// 지료형 [][] 변수명 = new 자료형 [행][열];
		int[][] array = new int[3][3];
		
		//System.out.println(array[0][0]);
		array[1][1]=5;
		//System.out.println(array[1][1]);
		
		// 2차원 배열이 값넣기!(1~9)
		
		int num =1;
		
		for (int j = 0; j < array.length; j++) {
			
		for (int i = 0; i < array.length; i++) {
		array[j][i]=num++;
		//array[0][1]=num++;
		//array[0][2]=num++;
		  }
		}
		//for (int i = 0; i < array.length; i++) {
		//array[1][i]=num++;
		//array[1][1]=num++;
		//array[1][2]=num++;
		//}
		
		//for (int i = 0; i < array.length; i++) {
		//array[2][i]=num++;
		//array[2][1]=num++;
		//array[2][2]=num++;
	//	}
	//	System.out.println(array[2][2]);
		
		System.out.println(array.length);
//		System.out.println(Arrays.toString(array[0]));
//		System.out.println(Arrays.toString(array[1]));
//		System.out.println(Arrays.toString(array[2]));
		
		
		
		for (int j = 0; j < array.length; j++) {
			
		for (int i = 0; i < array.length; i++) {
		System.out.print(array[j][i]+"\t");
		//System.out.print(array[0][1]+"\t");
		//System.out.print(array[0][2]+"\t");
		//System.out.println();
		}
		//for (int i = 0; i < array.length; i++) {
		//System.out.print(array[1][i]+"\t");
		//System.out.print(array[1][1]+"\t");
		//System.out.print(array[1][2]+"\t");
	//	System.out.println();
	//	}
	//	for (int i = 0; i < array.length; i++) {
	//	System.out.print(array[2][i]+"\t");
		//System.out.print(array[2][1]+"\t");
		//System.out.print(array[2][2]+"\t");
	//	System.out.println();
	//	}
		System.out.println();
		}
		
		//System.out.println();
		
		
		
	}

}
