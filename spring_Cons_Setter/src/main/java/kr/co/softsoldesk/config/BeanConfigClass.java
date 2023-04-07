package kr.co.softsoldesk.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;

@Configuration
public class BeanConfigClass {
	
	//생성자 주입
	@Bean
	public TestBean1 java1() {
		return new TestBean1(200,"soldesk", new DataBean1());
	}

	//setter 주입
	@Bean
	public TestBean1 java2() {
		TestBean1 t1 = new TestBean1();
		t1.setData1(400);
		t1.setData2("soft");
		t1.setData3(new DataBean1());
		
		return t1;
	}
	
	//--------------------------------
	public DataBean2 data1() {
		return new DataBean2();
	}
	
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	//spring 5.1부터 권장하지 않음(@Deprecated)
	@Bean (autowire = Autowire.BY_NAME)
	public TestBean2 java3() {
		return new TestBean2();
	}
	
	//--------------------------------
	public DataBean3 data100() {
		return new DataBean3();
	}
	
	@Bean (autowire = Autowire.BY_TYPE)
	public TestBean3 java4() {
		return new TestBean3();
	}
	
}
