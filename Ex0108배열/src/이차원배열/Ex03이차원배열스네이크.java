package 이차원배열;

public class Ex03이차원배열스네이크 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		int num = 21;

		System.out.println(array.length);

		// 입력

		for (int j = 0; j < array.length; j++) {

			if (j % 2 == 0) {
				for (int i = 0; i < array.length; i++) {
					array[j][i] = num++;
				}
			} else {
				for (int i = 4; i >= 0; i--) {
					array[j][i] = num++;
				}
			}

		}

		// 출력
		
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + "\t");

			}
			System.out.println();
		}

//		array[0][0] = num++; // 21
//		array[0][1] = num++;
//		array[0][2] = num++;
//		array[0][3] = num++;
//		array[0][4] = num++; // 25
//
//		array[1][4] = num++; // 26
//		array[1][3] = num++;
//		array[1][2] = num++;
//		array[1][1] = num++;
//		array[1][0] = num++;  //30

//		array[2][0] = num++; 
//		array[0][1] = num++;
//		array[0][2] = num++;
//		array[0][3] = num++;
//		array[0][4] = num++; 

//		array[1][4] = num++; 
//		array[1][3] = num++;
//		array[1][2] = num++;
//		array[1][1] = num++;
//		array[1][0] = num++;  

	}

}
