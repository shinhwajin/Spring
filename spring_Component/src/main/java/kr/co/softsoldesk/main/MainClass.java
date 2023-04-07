package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans2.TestBean3;
import kr.co.softsoldesk.beans2.TestBean4;
import kr.co.softsoldesk.beans3.TestBean5;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("===============XML===============");
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		//type으로 가져오기
		System.out.println("-----------------type으로 가져오기-----------------");
		TestBean1 xml1 = ctx1.getBean(TestBean1.class);
		System.out.println("xml1 : " + xml1);
		
		//이름으로 가져오기
		System.out.println("-----------------이름으로 가져오기-----------------");
		TestBean2 xml2 = ctx1.getBean("xml2",TestBean2.class);
		System.out.println("xml2 : " + xml2);
		TestBean2 xml3 = ctx1.getBean("xml3",TestBean2.class);
		System.out.println("xml3 : " + xml3);
		System.out.println();
		
		//Component
		System.out.println("-----------------이름으로 가져오기-----------------");
		TestBean3 xml4 = ctx1.getBean(TestBean3.class);
		System.out.println("xml4 : " + xml4);
		TestBean4 xml5 = ctx1.getBean("bean4",TestBean4.class);
		System.out.println("xml5 : " + xml5);
		
		//여러 개를 지정할 경우
		System.out.println("-----------------여러 개를 지정할 경우-----------------");
		TestBean4 xml100 = ctx1.getBean("xml100",TestBean4.class);
		System.out.println("xml100 : " + xml100);
		TestBean4 xml200 = ctx1.getBean("xml200",TestBean4.class);
		System.out.println("xml200 : " + xml200);

		ctx1.close();
		
		System.out.println("===============JAVA===============");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		//type으로 가져오기
		System.out.println("-----------------type으로 가져오기-----------------");
		TestBean1 java1 = ctx2.getBean(TestBean1.class);
		System.out.println("java1 : " + java1);
		
		//이름으로 가져오기
		System.out.println("-----------------이름으로 가져오기-----------------");
		TestBean2 java2 = ctx2.getBean("java2",TestBean2.class);
		System.out.println("java2 : " + java2);
		TestBean2 java3 = ctx2.getBean("java3",TestBean2.class);
		System.out.println("java3 : " + java3);
		System.out.println();

		//Component
		System.out.println("-----------------이름으로 가져오기-----------------");
		TestBean3 java4 = ctx2.getBean(TestBean3.class);
		System.out.println("java4 : " + java4);
		TestBean4 java5 = ctx2.getBean("bean4",TestBean4.class);
		System.out.println("java5 : " + java5);
		
		//여러 개를 지정할 경우
		System.out.println("-----------------여러 개를 지정할 경우-----------------");
		TestBean4 java100 = ctx2.getBean("java100",TestBean4.class);
		System.out.println("java100 : " + java100);
		TestBean4 java200 = ctx2.getBean("java200",TestBean4.class);
		System.out.println("java200 : " + java200);
		
		System.out.println();
		TestBean5 java55 = ctx2.getBean(TestBean5.class);
		System.out.println("java55 : " + java55);

		ctx2.close();

	}

}
