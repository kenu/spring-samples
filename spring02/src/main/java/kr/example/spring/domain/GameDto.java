package kr.example.spring.domain;

public class GameDto {
    private int myIdx;
    private int comIdx;
    private String myImg;
    private String comImg;
    private String result;
	public GameDto(int myIdx, int comIdx, String myImg, String comImg,
			String result) {
		super();
		this.myIdx = myIdx;
		this.comIdx = comIdx;
		this.myImg = myImg;
		this.comImg = comImg;
		this.result = result;
	}
	public GameDto() {
	}
	public int getMyIdx() {
		return myIdx;
	}
	public void setMyIdx(int myIdx) {
		this.myIdx = myIdx;
	}
	public int getComIdx() {
		return comIdx;
	}
	public void setComIdx(int comIdx) {
		this.comIdx = comIdx;
	}
	public String getMyImg() {
		return myImg;
	}
	public void setMyImg(String myImg) {
		this.myImg = myImg;
	}
	public String getComImg() {
		return comImg;
	}
	public void setComImg(String comImg) {
		this.comImg = comImg;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
