package model;

public class HangMemberDTO {
	
	 private String id;
	 private String pw;
	 private String name;
	 private int score;
	 private String vip;
	 
	 
	public HangMemberDTO(String id, String pw, String name,int score,String vip) {
		//super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.score = score;
		this.vip = vip;
		
	}
	
	


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getVip() {
		return vip;
	}
	public void setVip(String vip) {
		this.vip = vip;
	}
	
	
	

	 
}
