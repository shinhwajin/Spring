package kr.co.softsoldesk.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod 호출1");
		
		// 원래의 메소드를 호출하여 실행시점 명시하기
		Object obj = pjp.proceed();
		
		System.out.println("aroundMethod 호출2 ");
		
		return obj;
	}
	
	public int aroundIntMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundIntMethod 호출1");
		
		// 원래의 메소드를 호출하여 실행시점 명시하기
		int a1 = (Integer)pjp.proceed();
		
		System.out.println("aroundIntMethod 호출2 ");
		
		return a1;
	}
	
	// 정상적으로 끝났을 때
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod => 정상종료");
	}
	
	// 예외가 발생했을 때
	public void afterThrowingMethod() {
		System.out.println("afterThrowingMethod => 예외발생");
	}

}
