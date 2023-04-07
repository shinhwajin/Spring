package kr.co.softsoldesk.beans;

import javax.annotation.Resource;

public class TestBean5 {
	
	//변수의 이름과 동일한 이름의 Bean 주입
	@Resource  //Autowired + Qualifier
	private DataBean1 data1;
	
	@Resource
	private DataBean2 data2;
	
	public DataBean1 getData1() {
		return data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	
}
