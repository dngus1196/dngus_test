package com.test.diEx;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;		

@Configuration
@ImportResource("classpath:baseball.xml")		// XML설정 내용을 자바코드로 가져오기 
public class ConfigApp {
	
	@Bean
	public Player player1() {
		ArrayList<String> position = new ArrayList<String>();
		position.add("4번타자");
		position.add("3루수");
		
		Player player = new Player("박병호", 28, position);
		player.setHeight(187);
		player.setWeight(80);
		
		return player;
	}
}

/*
@Configuration

public class ConfigApp {
	
	@Bean
	public Player player1() {
		ArrayList<String> position = new ArrayList<String>();
		position.add("4번타자");
		position.add("3루수");
		
		Player player = new Player("박병호", 28, position);
		player.setHeight(187);
		player.setWeight(80);
		
		return player;
	}
}
 */
