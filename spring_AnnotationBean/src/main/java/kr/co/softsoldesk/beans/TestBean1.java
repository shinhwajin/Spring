package kr.co.softsoldesk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {
	
	private int data1;
	private DataBean1 data2;
	//자동 주입을 변수에 설정한다. getter만 추가
	//자동으로 setter메소드가 추가되어 setter로 주입을 완료함
	
	@Autowired  // getter만 필요
	private DataBean1 data3;
	
	@Autowired  // getter만 필요
	@Qualifier("obj4")  // 정의되어 있지 않으면 obj5와 같은 주소로 인식하여 ERROR 발생
	private DataBean2 data4;
	
	@Autowired  // getter만 필요
	@Qualifier("obj5")
	private DataBean2 data5;
	
	@Autowired(required = false)  // required = false : DataBean2 라는 클래스가 없으면 무시하고, 있으면 자동주입  // getter만 필요
	@Qualifier("obj6")
	private DataBean2 data6;
	
	// ===================================================================================

	public int getData1() {
		return data1;
	}
	
	//@Requireds 는 5.0 이상에서는 지양하므로 생성자를 통해 필수 속성 주입을 권장함
/*	public TestBean1(int data1) {
		this.data1 = data1;
	}		*/
	
	@Required  //반드시 주입해야하는 속성. 스프링 버전 5.0 이하에서만 가능
	public void setData1(int data1) {
		this.data1 = data1;
	}

	public DataBean1 getData2() {
		return data2;
	}

	// 자동주입(타입)
	@Autowired
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	public DataBean1 getData3() {
		return data3;
	}

	public DataBean2 getData4() {
		return data4;
	}

	public DataBean2 getData5() {
		return data5;
	}

	public DataBean2 getData6() {
		return data6;
	}
	
}
