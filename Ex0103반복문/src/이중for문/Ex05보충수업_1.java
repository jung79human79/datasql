package 이중for문;

public class Ex05보충수업_1 {

	public static void main(String[] args) {

		// 이중 for문 --> for문을 중첩시킨구조
		// i=0 ,j=0  ..출력 
		// i=0 ,j=1  ..출력
		// i=0 ,j=2  ..미
		// i=1 ,j=0  ..출력
		for (int i=0; i<3; i++) {
			for (int j=0; j<2; j++) {
				System.out.println("출력"); 
			}
			System.out.println();
		}
	}

}
