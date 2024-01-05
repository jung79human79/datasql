package 이중for문;

public class Ex01별찍기기초 {

	public static void main(String[] args) {

		// *****

		for (int i = 0; i < 5; i++) {                  // i를 사용안함
			
			for (int j = 0; j < 5; j++) {            // 먼저 5번 반복	j를 사용한함
				
				System.out.print("*");	
				
			}
			System.out.println();                // 별5개찍고 개행 그 후 4번개행
		}

	}

}
