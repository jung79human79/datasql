package ArrayList;

import java.util.ArrayList;   // 클래스 이므로 import

//import PokemonGame.Pokemon;

public class Main {

	public static void main(String[] args) {
        // 클래스들의 집합=여러개의 객체를 보관
		// ArrayList=클래스=자료형
		//:배열은 크기가 고정인데 이것은 크기가 가변적인 배열과 같은 형태을 가진 배열은 아니고 ***클래스이다
		// 1. 도구꺼내오기=ArrayList생성
		// 기본자료형은 저장이 안되고 레퍼런스 타입의 데이터만 저장한다  예) 기본형인 int,double등은 넣을 수 없음
		// 레퍼런스 타입: 클래스객체(나만의 자료형) , 특히 string도 해당
		
		// Pokemon        meta = new Pokemon();  예)객체생성+생성자
		ArrayList<String> list = new ArrayList<String>();    //클래스이므로 객체생성해야함  String대신 나만의 클래스 객체(=타입)를 넣을 수있다 예)Pokemon
		                                                     // <String> 제네릭 기법 String자료형을 넣겠다 혹은 나만의 객체를 넣겠다 어디에 ArrayList에
		                                                     // 제네릭 기법 =자바책 390쪽
		                                                     // new ArrayList<String>(); 자동으로 생성자~ 특히(); ();은 매서드 혹은 생성자라는 의미다.
		// <>안에 머 넣을지 보관할지 정하는 법= 제네릭기법
		// 자 지금은 ArrayList라는 클래스의 list객체에 String데이터를 저장하는 것이다.
		// <>제네릭에 나만의 클래스의 객체를 생성해서 저장할 수 있다 그리고 객체이름.매서드를 불러 데이터를 가변적으로 조절할 수 있다. 
		
		//2.데이터 추가하기 =add 매서드사용=매서드는 입력값이 있다면 입력타입을 보고 값을 넣어야함 
		list.add("ㅎㅎ");                // add함수로 인덱스에 값이 추가됨 //add함수를 실행하면 타입이 String데이터를 저장하기로 했기 때문에 String이 뜬다
		list.add("ㅎㅋ");                // 클래스이므로 이름.자동검색해서 매서드를 찾는다. 배열은 바로 인덱스를 쳐서 추가했다 예)bag[0]=5;
		list.add("ㅎㅍ");                // .변수는 없고 매서드를 선택해서 다룬다.
		
		// 3.데에터 가져오기
		list.get(0);               //   겟 함수를 이용해 인덱스 번호로 가져온다
		list.get(1);
		list.get(2);
		System.out.println(list.get(0));
		
		// 4. 데이터를 특정위치에 추가하기
	    list.add(2,"ㅠㅠ");                     // 인덱스에 넣기 두개 매개변수 사용
	    System.out.println(list.get(2));       // 2번의 기존 값은 3번으로 밀려나감.  // 그래서 가변적임
	    System.out.println(list.get(3));
	    
	    //5. 데이터 삭제하기
	    list.remove(2);                // 인덱스로 삭제
	    System.out.println(list.get(2));    // 3번으로 밀렸던 값이 다시 2번으로
	    
	    // 6.데이터 크기 알아보기
	    list.size();                 // 매개변수 없음
	    System.out.println("리스트의크기는 : "+list.size());   // length는 베열에서 사용  cf)size()라는 매서드를 본다 이것은 클래스이므로
	                                                         // 배열 변수.length  <--> 클래스.매서드
	    //7. 데이터 전체삭제하기
	    list.clear();                                      // clear()라는 매서드 근데 매개변수 없음  //매서드 이므로 항상 매개변수 확인해야함
	    System.out.println("리스트의크기는 : "+list.size());   // 0 출력  //전부 매서드를 부른다 클래스.매서드
		
		
		
		
		
		
		
		
		
		
		
	}

}
