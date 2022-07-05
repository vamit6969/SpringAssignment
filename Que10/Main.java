package com.yash.Que10;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/studentdetails_10/Config.xml");
		StudentDetails studentDetails=(StudentDetails)context.getBean("studentDetails");
		//System.out.println(studentDetails.getStudents());
		Map<String,Double> students= studentDetails.getStudents();
		students.entrySet()
		  .stream()
		  .sorted(Map.Entry.<String, Double>comparingByKey())
		  .forEach(System.out::println);
	}
}
