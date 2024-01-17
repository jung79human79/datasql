package MVC;

public class Music {
	// MVC중에 모델역할 --> 데이터를 관라함.

	// 뮤직 플레이어안에서 사용할 우리만의 음악 자료형 설계
	
	// 1.노래데이터의 제목
	private String title ;
	// 2.노래데이터의 가수
	private String singer;
	// 3.노래데이터 재생시간
	private int PlayTime; 
	// 4.위치(경로 ,주소값)
	private String path;

	
	
	// ---매서드 생성---
	//1. 모든 필드 값을 채울 수있는 생성자
	public Music(String title, String singer, int playTime, String path) {
		super();
		this.title = title;
		this.singer = singer;
		PlayTime = playTime;
		this.path = path;
	}

	// getter 매서드 만들기 setter은 미생성 

	public String getTitle() {
		return title;
	}	
//	public void setTitle(String title) {
//		this.title = title;
//	}
	public String getSinger() {
		return singer;
	}
	//public void setSinger(String singer) {
	//	this.singer = singer;
	//}
	public int getPlayTime() {
		return PlayTime;
	}
	//public void setPlayTime(int playTime) {
	//	PlayTime = playTime;
	//}
	public String getPath() {
		return path;
	}
	//public void setPath(String path) {
	//	this.path = path;
	//}	
}
