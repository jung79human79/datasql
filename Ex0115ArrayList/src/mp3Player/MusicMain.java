package mp3Player;

import java.util.ArrayList; //클래스 추가
import java.util.Scanner;   //클래스 추가 

//import ArrayList.Music;

import javazoom.jl.player.MP3Player; //클래스 추가

public class MusicMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 노래를 실행시키는 공간
		// 1.노래를 재생시키는 도구 가져오기--> MP3Player
		MP3Player mp3 = new MP3Player();

		// 2. 노래제목 가수이름 재생시간 한번에 이 자료형을 한번에 담을 수 있는 자료형은 없으므로--> 클래스를 생성
		// 노래데이터를 생성해야하는데~~자료형이 없다 고로 새로운 자료형=클래스 생성

		String comPath = "C:\\Users\\SMHRD\\Desktop\\javabackend\\Ex0115ArrayList\\player\\"; // 주소경로 길어서 따로 변수생성

		// 노래 데이터를 전부 저장하는 ArrayList 생성 이름은 MusicList

		ArrayList<Music> MusicList = new ArrayList<Music>(); // <>안에 자료형 넣음
		
		// 3. 노래데이터 생성 =클래스의 객체 생성(Music 자료형 사용하기)
		Music m1 = new Music("HypeBoy", "뉴진스", 180, comPath + "HypeBoy.mp3");  // 0번 인덱스
		MusicList.add(m1); // Music 자료형 말고는 다른 것은 못넣음 0번방에 넣음

		// 나머지 객체 모두 넣기
		MusicList.add(new Music("IAM", "아이브", 198, comPath + "IAM.mp3")); // 1번인덱스
		MusicList.add(new Music("LoveLee", "악동뮤지션", 200, comPath + "LoveLee.mp3")); // 2번인덱스
		MusicList.add(new Music("Smoke", "다이나믹듀어", 210, comPath + "Smoke.mp3")); // 3번인덱스
		MusicList.add(new Music("한페이지가될수있게", "Day6", 185, comPath + "한페이지가될수있게.mp3")); // 4번인덱스

		// 출력해보기
		System.out.println("==========플레이어============");
		int i = 0;              // 몇 번째 곡인지 의미 기억하고 있는 변수
		
		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >> ");
			int input = sc.nextInt();
			
			if (input == 1) {
				System.out.println("====재생====");
				// 재생중인 노래 판단
				if(mp3.isPlaying()) {
					// 재생중이라면 노래 스탑
					mp3.stop();
				}
				// 노래를 재생하기 위해서는 필요한 데이터는? 노래의 주소값
				// 뮤직 리스트에 있는 0번 인덱스의 노래를 재생
				
				 
				mp3.play(MusicList.get(i).getPath());
				// 가수 - 노래재목이 재생중입니다. 출력
				System.out.println(MusicList.get(i).getSinger()+ " - " + MusicList.get(i).getTitle() + "이(가) 재생중입니다");
				
			} else if (input == 2) {
				System.out.println("====정지====");
				// 재생중인지 판단
				if(mp3.isPlaying()) {
					// 재생중이라면 노래 스탑
					mp3.stop();
					System.out.println("노래정지");
				}else {
					// 재생중이 아니라면
					System.out.println("재생중인 노래가 없어요");
				}
			} else if (input == 3) {
				System.out.println("====이전곡====");
				 // 재생중 여부 판단
				if(mp3.isPlaying()) {
					// 재생중이라면 노래 스탑
					mp3.stop();
				}
				// i의 값이 2-->1 / 4-->3
				// 재생중인 노래 정보 출력
				i--;
				
				if(i<MusicList.size() && i >=0) {                    // i >=0 만 해도됨.
					mp3.play(MusicList.get(i).getPath());
					System.out.println(MusicList.get(i).getSinger()+ " - " + MusicList.get(i).getTitle() + "이(가) 재생중입니다");
				}else if(i<0) {
					// 인덱스 미만시 //이전곡이 없다는 의미
					System.out.println("이전곡이 없습니다.");
					// 다시 재생 선택시 첫번째 곡 재생하도록~
					i= MusicList.size()-5;     // i=0;
				}

			} else if (input == 4) {
				System.out.println("====다음곡====");   
				
				// 재생중 여부 판단		
				if(mp3.isPlaying()) {
					// 재생중이라면 노래 스탑
					mp3.stop();
				}
				i++;
				// 뮤직리스트(우리가 만든 ArrayList)에서 다음곡 재생
				// 0-->1 / 1-->2 / 4-->? 에러발생 인덱스 초과
				// 가수 - 노래재목이 재생중입니다. 출력
				// i 인덱스가 4를 초과하는 경우
				if(i<MusicList.size()) {                       // i=인덱스 ,size()함수는 크기(여기서는 5) 
					mp3.play(MusicList.get(i).getPath());    // 반드시 경로 가져와야함
					System.out.println(MusicList.get(i).getSinger()+ " - " + MusicList.get(i).getTitle() + "이(가) 재생중입니다");
				}else {
					// 다음곡이 없다는 의미 
					System.out.println("다음곡이 없습니다."); 
					// 다시 재생을 선택한다면 뮤직리스트 마지막 곡 재생되게 만들기
					//i--;     //재생으로 보내기 전에 인덱스를 1개 줄여서 마지막 곡을 재생  //i--는 누적이 안됨??
					i= MusicList.size()-1;   //같은 표현 //정석코드
				}
				
			} else if (input == 5) {
				System.out.println("====음악종료===="); // 종료 전까지는 계속 반복해야함
				if(mp3.isPlaying()) {
					// 재생중이라면 노래 스탑
					mp3.stop();
				}
                break;     // 반복문 스탑
			} else {
				System.out.println("잘못누르셨어요!!");
			}

		}//반복문

	}

}

// MVC패턴 맛보기
// Model: 데이터 관리를 위한 부분
// View : 실제로 사용자에게 보여지는 부분(콘솔창의 출력문)
// Controller : 실제 기능에 관여하는 부분
