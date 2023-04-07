package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component("t3")
public class TestBean2 {

}
//IoC 컨테이너 객체를 생성할 때 자동으로 객체가 생성
//기본형은 타입 주입
//Singleton으로 주입되며 config에 @Bean으로 등록한 것과 같다

//하나만 생성하여 사용할 경우 type이 효율적
//이름으로 주입할 경우 식별자 역할을 하지만 BeanConfigClass에 여러 개를 주입하여 사용하는 것이 바람직, 그러므로 이름 주입은 잘 사용되지 않음