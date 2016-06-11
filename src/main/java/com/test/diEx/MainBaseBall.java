package com.test.diEx;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;		

public class MainBaseBall {

	public static void main(String[] args) {
		xmlContext();
		annotationContext();
	}
	
	// XML설정 내용으로 의존관계 주입
	private static void xmlContext() {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:baseball.xml");	// XML 설정내용을 가져오는 코드
		
		Player player1 = ctx.getBean("player1", Player.class);
		System.out.println("선수이름 : " + player1.getName());
		System.out.println("나이 : " + player1.getAge());
		System.out.println("포지션 : " + player1.getPosition());
		System.out.println("키 : " + player1.getHeight());
		System.out.println("몸무게 : " + player1.getWeight());
		
		System.out.println("=============================================");
		
		Player player2 = ctx.getBean("player2", Player.class);
		System.out.println("선수이름 : " + player2.getName());
		System.out.println("나이 : " + player2.getAge());
		System.out.println("포지션 : " + player2.getPosition());
		System.out.println("키 : " + player2.getHeight());
		System.out.println("몸무게 : " + player2.getWeight());
		
		ctx.close();
	}
	
	// JAVA코드의 Annotation으로 의존관계 주입
	private static void annotationContext() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigApp.class);
		
		Player player1 = ctx.getBean("player1", Player.class);
		System.out.println("선수이름 : " + player1.getName());
		System.out.println("나이 : " + player1.getAge());
		System.out.println("포지션 : " + player1.getPosition());
		System.out.println("키 : " + player1.getHeight());
		System.out.println("몸무게 : " + player1.getWeight());
		
		System.out.println("=============================================");
		
		Player player2 = ctx.getBean("player2", Player.class);
		System.out.println("선수이름 : " + player2.getName());
		System.out.println("나이 : " + player2.getAge());
		System.out.println("포지션 : " + player2.getPosition());
		System.out.println("키 : " + player2.getHeight());
		System.out.println("몸무게 : " + player2.getWeight());
		
		ctx.close();
	}

}
