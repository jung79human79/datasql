package Question6_1;

public class MusicVO {

	private String title ;
	private String singer;
	private int PlayTime;
	
	
	public MusicVO(String title, String singer, int playTime) {
		//super();
		this.title = title;
		this.singer = singer;
		this.PlayTime = playTime;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSinger() {
		return singer;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}


	public int getPlayTime() {
		return PlayTime;
	}


	public void setPlayTime(int playTime) {
		PlayTime = playTime;
	}
	
	public  String toString() {
		
		return "";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
