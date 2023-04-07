package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean1 {

}
//IoC 컨테이너 객체를 생성할 때 자동으로 객체가 생성
//기본형은 타입 주입
//Singleton으로 주입되며 config에 @Bean으로 등록한 것과 같다