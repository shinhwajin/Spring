package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{

	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV 켜기");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV 끄기");
		
	}

	@Override
	public void volumUp() {
		System.out.println("volumUp");
		
	}

	@Override
	public void volumDown() {
		System.out.println("volumDown");
		
	}

}
