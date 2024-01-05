package for문;

public class Ex06곱셈누적77 {

	public static void main(String[] args) {
		
        //int h = 77;
		//for (int i=1; i==h; i++) {
		//	h--;
		//	int g = h*i;
		//	System.out.print(g++);
		//}                                //이중 FOR문의 어렵다
		
		int sum = 0;
		int num =1;
		for (int i=77; i>0; i--) {
			// i: 77-->1 까지 감소
			// num : 1-->77 증가
			sum += (i*num);                 //sum=sum+(i*num);
			num++;	
			//System.out.print(sum);         //여기로 주면 반복됨
		}
		System.out.print(sum);
		
	}

}
