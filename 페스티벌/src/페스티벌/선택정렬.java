package 페스티벌;

public class 선택정렬 {

	public static void main(String[] args) {

		int[] arr = {6,5,7,2,8,9};
		sort(arr);
		
		System.out.print("정렬된 배열: ");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
	}
	
	public static void sort (int[] ccc) {
		
		int a = ccc.length;
		for (int i = 0; i < a-1; i++) {
			int b = i;
			for (int j = i+1; j < a; j++) {
				if(ccc[j]<ccc[b]) {
					b=j;
				}
			}
			
			if(b!=i) {
			int temp = 	ccc[i];
			ccc[i] = ccc[b];
			ccc[b]=temp;
			}
			
		}	
	}

}
