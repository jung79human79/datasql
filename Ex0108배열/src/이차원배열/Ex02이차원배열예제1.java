package 이차원배열;

public class Ex02이차원배열예제1 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		int num = 21;
		
		// 데이터를 입력시 위~아래
		System.out.println(array.length);                 //답=5
		
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[i][j] = num++;
			}
		}
        // 데이터를 출력시 왼~오른
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + "\t");      //역슬래시탭
			}
			System.out.println();              // 개행반복위치 확인필요 = 첫번째 for문 끝난 후 개행반복되므로 위의 for문안에 넣는다.
		}
		
	}
}


