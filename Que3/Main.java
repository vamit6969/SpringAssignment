package com.yash.Que3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
			ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yash/emi_3/Config.xml");
			EMI emi=(EMI)ctx.getBean("emi");
			double rate=emi.getInterestRate();
			System.out.println(emi.emiCalculate(rate));
		
	}
}
