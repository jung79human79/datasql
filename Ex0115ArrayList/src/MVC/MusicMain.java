package MVC;

import java.util.ArrayList; //클래스 추가
import java.util.Scanner; //클래스 추가 

//import ArrayList.Music;

import javazoom.jl.player.MP3Player; //클래스 추가

public class MusicMain {
	// View : 실제로 사용자에게 보여지는 부분(콘솔창의 출력문) =사용자화면
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 입력도구 이므로 View

		// 노래 재생을 담당하는 Controller 생성하기
		MusicController con = new MusicController();

		// 출력해보기
		System.out.println("==========플레이어============"); // 출력도구 이므로 View

		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >> ");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("====재생===="); // 출력도구 이므로 View

				System.out.print("어떤노래 선택 >> 1=HypeBoy,2=IAM,3=LoveLee,4=Smoke,5=한페이지가될수있게 >> "); // 재생시킬 노래 지정시키고 싶은 경우
				int songN = sc.nextInt();

				Music m = con.play(songN); // play()매서드 호출 //매개변수입력
				System.out.println(m.getSinger() + " - " + m.getTitle() + "이(가) 재생중입니다"); // 출력도구 이므로 View

			} else if (input == 2) {
				System.out.println("====정지====");

				if (con.stop() == true) { // con.stop() 자체가 바로 블리언값
					System.out.println("노래정지");

				} else {

					System.out.println("재생중인 노래가 없어요");
				}

			} else if (input == 3) {
				System.out.println("====이전곡====");
				Music m = con.pre();
				if (m != null) {

					System.out.println(m.getSinger() + " - " + m.getTitle() + "이(가) 재생중입니다");

				} else { // 널이라면~

					System.out.println("이전곡이 없습니다.");

				}

			} else if (input == 4) {
				System.out.println("====다음곡====");
				Music m = con.next();

				if (m != null) {
					System.out.println(m.getSinger() + " - " + m.getTitle() + "이(가) 재생중입니다");
				} else {
					System.out.println("다음곡이 없습니다.");
				}

			} else if (input == 5) {
				System.out.println("====음악종료===="); // 종료 전까지는 계속 반복해야함
				con.stop();
				break;
			} else {
				System.out.println("잘못누르셨어요!!");
			}

		} // 반복문

	}

}

// MVC패턴 맛보기
// Model: 데이터 관리를 위한 부분
// View : 실제로 사용자에게 보여지는 부분(콘솔창의 출력문)
// Controller : 실제 기능에 관여하는 부분
