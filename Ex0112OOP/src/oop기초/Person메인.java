package oop기초;

import java.util.Random;

public class Person메인 {

	public static void main(String[] args) {

		// 실행가능 공간
		// 1.설계도를 기반으로 객체를 생성하자. 메모리를 할당하는 것
		// 자료형 변수명 = new 자료형();
		// 사람자료형을 만들자!! // 변수명 person = 레퍼런스 변수 = 주소값이 출력 = 필드명(변수명)으로 접근(배열처럼 인덱스로 접근하지 않고 변수명으로 접근)
		
		Person person = new Person();   // new= person 이라는 객체 공간이 생성..
		
		Random sc = new Random();
		System.out.println(person);    // 출력=oop기초.Person@626b2d4a
		
		System.out.println(person.age);       // 가지고 있는 .으로 표시 변수와함수가 자동완성에서 보인다  //여기서는 초기값0출력
		// 필드의 아무것도 안넣으면 기본값으로 세팅
		// 스트링은=널 인트=0
		
		// 데이터를 넣어보자
		person.name = "정대주";                  // 변수 호출해서 값입력(타입은 동일하게~)
		System.out.println(person.name);
		person.age = sc.nextInt(30)+1;
		System.out.println(person.age);
		person.gender = "여";
		System.out.println(person.gender);
		
		
		// 하나의 클래스로 여러개의 객체를 생성
		// 짝꿍 정보를 저장하는 person2 객체를 생성
		// 이름 나이 성별 저장
		// 전부 출력
		Person person2 =new Person();   
		person2.age = 28;  
		person2.name = "강우석";
		person2.gender = "남";
		System.out.println(person2.age);
		System.out.println(person2.gender);
		System.out.println(person2.name);
		
		person2.talk();                  // 매서드 호출  함수안에 출력문이 있으니 출력문울 적을 필요는 없다 입력도 없으니 빈()만 주면됨.
		
		
		
		
		
	}

}
