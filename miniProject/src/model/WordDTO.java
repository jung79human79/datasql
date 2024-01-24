package model;

public class WordDTO {
		
	 private String word;
	 private String mean;
	 private String hint1;
	 private String hint2;
	 private String hint3;
	 
	 
	public WordDTO(String word, String mean, String hint1, String hint2, String hint3) {
		//super();
		this.word = word;
		this.mean = mean;
		this.hint1 = hint1;
		this.hint2 = hint2;
		this.hint3 = hint3;
	}


	public String getWord() {
		return word;
	}


	public void setWord(String word) {
		this.word = word;
	}


	public String getMean() {
		return mean;
	}


	public void setMean(String mean) {
		this.mean = mean;
	}


	public String getHint1() {
		return hint1;
	}


	public void setHint1(String hint1) {
		this.hint1 = hint1;
	}


	public String getHint2() {
		return hint2;
	}


	public void setHint2(String hint2) {
		this.hint2 = hint2;
	}


	public String getHint3() {
		return hint3;
	}


	public void setHint3(String hint3) {
		this.hint3 = hint3;
	}
}
