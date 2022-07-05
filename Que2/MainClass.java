package com.yash.Que2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
	
	public static void main(String[] args) {
	
			ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/average_2/config.xml");
			AverageNumber averageNumber=(AverageNumber)context.getBean("averageNumber");
			System.out.println(averageNumber.averageOfNumber());	
	}
}
