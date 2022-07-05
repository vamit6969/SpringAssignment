package com.yash.Que5;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages  = "com.yash.numbers_Maximum_5")
public class Config {
	
	@Bean
	public NumberClass numberClass()
	{
		NumberClass nc=new NumberClass();
		nc.setNumbers(Arrays.asList(12,38,43,224,64,42,67,54,90));
		return nc;
	}

}
