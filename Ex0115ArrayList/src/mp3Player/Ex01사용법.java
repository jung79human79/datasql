package mp3Player;

import javazoom.jl.player.MP3Player;  

public class Ex01사용법 {

	public static void main(String[] args) {

		// jar파일->일종의 자바 프로젝트를 압축해 놓은 확장자->사용자 편하도록 개발자가 만들어 놓은 것
		// 다른사람이 개발해 놓은 class파일들이 모아저 있는 형태 (압축)
		// 일종의 라이브러리
		
		
		// jar 파일 추가하는 법
	    // 프로젝트 선텍-> 마우스 우클릭 > blild path -> configure build path
	    //-> libraries 탭으로 이동 -> class path 선택 > 우측 있는 add jars 선택
	    //-> 원하는 jar파일 추가 후 -> apply and close
		
		// 노래 재생 가능한 도구 꺼내기    // import javazoom.jl.player.MP3Player;
		
		MP3Player mp3 = new MP3Player();   // 클래스이므로 역시 매서드 사용함  // play() stop() 등의 함수사용
		
		// 1.재생하기
		mp3.play("C:\\Users\\SMHRD\\Desktop\\javabackend\\Ex0115ArrayList\\player\\IAM.mp3");    // 스트링 타입의 패쓰= 경로 찾기
		mp3.stop();
		//System.out.println(mp3);    //이거 아니고 ctrl+f11로 바로 재생 
		mp3.play("C:\\Users\\SMHRD\\Desktop\\javabackend\\Ex0115ArrayList\\player\\한페이지가될수있게.mp3");  // 2개가 같이 재생
		
		// 2. 노래 스탑
		mp3.stop();
		
		// 3.재생여부 판단하기
		System.out.println(mp3.isPlaying());     // false는 노래 미재생 // isPlaying() 함수사용
		
		
		
		
		
	}

}
