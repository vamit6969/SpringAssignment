package com.yash.Que6;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.yash.Vowel_6")
public class Config {
	
	@Bean
	public Name name()
	{
		Name n=new Name();
	//	System.out.println("Bean class");
		n.setName1("Jamunda");
		n.setName2("Ramesh");
		n.setName3("Amay");
		n.setName4("Nitesh");
		n.setName5("Amit");
		return n;
	}

}
