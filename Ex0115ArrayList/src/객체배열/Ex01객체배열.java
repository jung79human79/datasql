package 객체배열;

//import PokemonGame.Pokemon;

public class Ex01객체배열 {

	public static void main(String[] args) {

		// 1. 객체 배열 생성
		// 자료형 [] 변수명 = new 자료형[칸수];
		// 포켓몬 자료형 3개 보관하는 bag 배열 생성
		// 클래스 이름 = 자료형
		Pokemon [] bag = new Pokemon[3];   // 각 칸(인댁스)에 
		
		// 객체배열를 0번 방 출력
		
		System.out.println("배열의 0번방: "+ bag[0]);   // 널값
		
		// 객체배열의 0번방에 포켓몬 넣자
		// 피카츄/전기/백만볼트/hp:100/atk:15
		
		Pokemon pica = new Pokemon("피카츄", 100, 15, "백만볼트", "전기");  // 우선 0번째 인덱스에 들어갈 객체를 생성
		
		//bag[0] = pica;
		
		bag[0] = new Pokemon("피카츄", 100, 15, "백만볼트", "전기");   //
		
		System.out.println("배열의 0번방: "+ bag[0].getName());    // bag[0]=변수명=pica
		
		// 1번방에  >> 파이리  /불/ 화염방사/hp:90 /atk:12
		// 2번방  >> 꼬부기 /물 /물대포/ hp:88 /atk:14
		// 배열안의 이름 타입 hp 출력
		
		Pokemon pi = new Pokemon("파이리", 90, 12, "불", "화염방사");
		bag[1] = new Pokemon("파이리", 90, 12, "불", "화염방사"); 
	    	
		Pokemon go = new Pokemon("꼬부기", 88, 14, "물", "물대포");
		bag[2] = new Pokemon("꼬부기", 88, 14, "물", "물대포"); 
		
	
		System.out.println("===== 포켓목 정보 출력====");
		for (int i = 0; i < bag.length; i++) {
			System.out.println(bag[i].getName()+"\t"+bag[i].getType()+"\t"+bag[i].getHp());	  // \t는 띄어쓰고 탭처럼 줄맞추기
		}
		
		
		// for-each문
		// 반복문 모양이 다른 for문
		// 배열과 같이 여러개의 데이터를 저장하는 자료구조와 함께 사용
		//for(Pokemon p : bag) {                                                  // bag안을 반복해서 돌면서 하나씩 돌거야
		//	System.out.println(p.getName()+"\t"+p.getType()+"\t"+p.getHp());     // 하나씩 가지고 중괄호 안으로
			                                                                     // 피카츄 끝나면 파이리를 p에 담아준다.다시 중괄호
		//}                                                                        //
		
		// 배열안에 저장된 데이터를 for문에서 순차작으로 : (콜론) 기준으로 왼쪽에 있는 변수에 담아주는 흐름을 가지고 있다.
		
		// 처음p값은 피카츄 두번째 p값은 파이 마지막 세번째 p값은 꼬부기
	}

}
