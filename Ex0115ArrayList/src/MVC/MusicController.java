package MVC;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicController {

	// Controller : 실제 기능에 관여하는 부분 = 기능들을 가지고 있는 도구  =[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료
	// 매서드로 따로 구성
	
	//1.필드
	// 사용자가 MP3Player가 달라지지 않기 때문에 그냥 바로 생성!!
	private MP3Player mp3 = new MP3Player();  
	private ArrayList<Music> MusicList = new ArrayList<Music>(); // <>안에 자료형 넣음
	private int i = 0;                // 몇 번째 곡인지 의미 기억하고 있는 변수
	
	
	//2.매서드
	public MusicController () {
		String comPath = "C:\\Users\\SMHRD\\Desktop\\javabackend\\Ex0115ArrayList\\player\\"; 
		Music m1 = new Music("HypeBoy", "뉴진스", 180, comPath + "HypeBoy.mp3");  
		MusicList.add(m1); 
		MusicList.add(new Music("IAM", "아이브", 198, comPath + "IAM.mp3")); 
		MusicList.add(new Music("LoveLee", "악동뮤지션", 200, comPath + "LoveLee.mp3")); 
		MusicList.add(new Music("Smoke", "다이나믹듀어", 210, comPath + "Smoke.mp3")); 
		MusicList.add(new Music("한페이지가될수있게", "Day6", 185, comPath + "한페이지가될수있게.mp3")); 
	}
	
	// 2. 재생 매서드 만들기
	public Music play (int num) {
		if(mp3.isPlaying()) {
			mp3.stop();
		}	 
		mp3.play(MusicList.get(num-1).getPath());	
	 return MusicList.get(num-1);
	}
	
	// 3. 정지 매서드 만들기
	public boolean stop() {             // 재생 중인지 아닌지~~
		boolean result = false;         
		if(mp3.isPlaying()) {
			mp3.stop();                 // 리턴값과 실행되는 것을 구별하자.
			result=true;                
		}
		return result;
	}
	// 4. 이전 곡 재생하는 매서드 만들기
	public Music pre() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		i--;
		if(i >=0) {                    
			mp3.play(MusicList.get(i).getPath());
			return MusicList.get(i);
		}else{
			i=0;
			return null;   // return MusicList.get(i);은 ??   // i가 0보다 작으면 아무값도 반환하지 않겠다. 
		}	                                     //  i가 0보다 작으면 i=0으로 대입시키고 리턴은 널이다. 구별해야 한다
	}
	// 5.다음 곡 재생하는 매서드 만들기
	public Music next() {
		if(mp3.isPlaying()) {
			
			mp3.stop();
		}
		i++;
		if(i<MusicList.size()) {                       
			mp3.play(MusicList.get(i).getPath()); 
			return MusicList.get(i);
		}else {
			i= MusicList.size()-1;  
			return null;
		}
	}
		
		//6.종료  ---> 3번 정지매서드를 사용하면 됨.

		
		
	}
	
	
	
	

