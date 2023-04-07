package kr.co.softsoldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.JdbcBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.mapper.MapperInterface;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("=============================JAVA=============================");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MapperInterface mapper = ctx.getBean("test_mapper", MapperInterface.class);
		
		//insert
/*		JdbcBean bean1 = new JdbcBean();
		bean1.setInt_data(11);
		bean1.setStr_data("Spring Framework");
		mapper.insert_data(bean1);
		System.out.println("저장 완료");
		*/
		
		//update
/*		JdbcBean bean2 = new JdbcBean(); 
		bean2.setInt_data(11);
		bean2.setStr_data("abc"); 
		mapper.update_data(bean2);
		*/
		
		//delete
		mapper.delete_data(11);

		//select
		List<JdbcBean> list = mapper.select_data();
		for(JdbcBean bean : list) {
			System.out.println("int_data : " + bean.getInt_data());
			System.out.println("str_data : " + bean.getStr_data());
			System.out.println("----------------------");
		}
		
		ctx.close();

	}
}
