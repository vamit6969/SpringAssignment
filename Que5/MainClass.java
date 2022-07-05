package com.yash.Que5;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
			ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
			NumberClass numberClass = context.getBean(NumberClass.class);
			List<Integer> numberList = numberClass.getNumbers();
			int maxNumber = numberList.stream().max(Integer::compare).get();
			System.out.println("Maximun number is: " + maxNumber);
	

	}

}
