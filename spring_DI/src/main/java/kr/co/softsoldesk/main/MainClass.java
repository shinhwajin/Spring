package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TV;

public class MainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//기본
		TestBean t1 = new TestBean();
		t1.printData();
		System.out.println("------------------------");
		TestBean obj1 = ctx.getBean("obj1", TestBean.class);
		System.out.println("obj1 : " + obj1);
		System.out.println("========================");
		
		//int
		TestBean t2 = new TestBean(100);
		t2.printData();
		System.out.println("------------------------");
		TestBean obj2 = ctx.getBean("obj2", TestBean.class);
		obj2.printData();
		System.out.println("========================");
		
		//double
		TestBean t3 = new TestBean(11.11);
		t3.printData();
		System.out.println("------------------------");
		TestBean obj3 = ctx.getBean("obj3", TestBean.class);
		obj3.printData();
		System.out.println("========================");
		
		//String
		TestBean t4 = new TestBean("soldesk");
		t4.printData();
		System.out.println("------------------------");
		TestBean obj4 = ctx.getBean("obj4", TestBean.class);
		obj4.printData();
		System.out.println("========================");
		
		//속성 모두 주입
		TestBean t5 = new TestBean(200,22.22,"software");
		t5.printData();
		System.out.println("------------------------");
		TestBean obj5 = ctx.getBean("obj5", TestBean.class);
		obj5.printData();
		System.out.println("========================");
		
		//속성 모두 주입 시 순서 변경 - 자바 불가능
		//TestBean t6 = new TestBean("softsoldesk",200,22.22);
		//t6.printData();
		TestBean obj6 = ctx.getBean("obj6", TestBean.class);
		obj6.printData();
		System.out.println("========================");
		
		//index 이용하여 속성 모두 주입
		TestBean obj7 = ctx.getBean("obj7", TestBean.class);
		obj7.printData();
		System.out.println("========================");
		
		
		//객체 2개 각각 받을 경우
		DataBean d1 = new DataBean();
		DataBean d2 = new DataBean();
		TestBean1 test = new TestBean1(d1, d2);
		test.printData();
		System.out.println("------------------------");
		TestBean1 obj8 = ctx.getBean("obj8", TestBean1.class);
		obj8.printData();
		System.out.println("========================");
		
		//미리 생성하여 객체 주입
		TestBean1 obj9 = ctx.getBean("obj9", TestBean1.class);
		obj9.printData();
		System.out.println("========================");
		
		//활용
		TV tv = (TV)ctx.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

		ctx.close();
		
	}

}
