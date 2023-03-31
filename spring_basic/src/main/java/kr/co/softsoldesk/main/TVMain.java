package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.beans.SamsungTV;
import kr.co.softsoldesk.beans.SoldeskTV;
import kr.co.softsoldesk.beans.TV;

public class TVMain {

	public static void main(String[] args) {

		// 스프링 컨테이너 구동
		// AbstractApplicationContext : Bean + ApplicationContext
		// GenericXmlApplicationContext : 파일과 클래스 관리 설정(xml)
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");

		// 컨테이너로부터 필요한 객체를 요청
		TV tv = (TV) ctx.getBean("tv2");

		tv.powerOn();
		tv.powerOff();
		tv.volumDown();
		tv.volumUp();

		ctx.close();
	}
}
