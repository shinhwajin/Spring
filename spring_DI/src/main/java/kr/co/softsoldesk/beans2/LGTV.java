package kr.co.softsoldesk.beans2;


public class LGTV implements TV {
	
	private int price;
	private AppleSpeaker speaker;
	
	public LGTV() {
		System.out.println("===> LGTV 객체 생성");
	}

	public LGTV(int price, AppleSpeaker speaker) {
		this.price = price;
		this.speaker = speaker;
	}
	
	public int getPrice() {
		System.out.println("price : "+price);
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public AppleSpeaker getSpeaker() {
		System.out.println("speaker : "+speaker);
		return speaker;
	}

	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("LGTV --- 전원 켠다");
		System.out.println("가격 : " + price);
	}

	public void powerOff() {
		System.out.println("LGTV --- 전원 끈다");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
		
	}

}
