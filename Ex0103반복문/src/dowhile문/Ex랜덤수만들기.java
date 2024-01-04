package dowhile문;

import java.util.Random;

public class Ex랜덤수만들기 {

	public static void main(String[] args) {

		//랜덤한 숫자를 뽑아내는 방법
		//1.랜덤한 숫자를 뽑아내는 도구 꺼내오기
		Random ran = new Random();
		//2.랜덤한 수를 생성하기
		//0부터 시작해서 추출하고 싶은 숫자의 갯수를 적기
		//1~9까지 추출하기
		int ranNum = ran.nextInt(9)+1;           // +1을 안주면 0~8까지 랜덤    
		System.out.print(ranNum);
		
	}

}
