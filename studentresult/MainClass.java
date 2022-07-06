package com.yash.studentresult;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		list.add((Student)ctx.getBean("student1"));
		list.add((Student)ctx.getBean("student2"));
		list.add((Student)ctx.getBean("student3"));
		list.add((Student)ctx.getBean("student4"));
		list.add((Student)ctx.getBean("student5"));
		System.out.println(list);
		list.forEach(s->{
			
			double totalMarks=s.getResult().getMathsMarks()+s.getResult().getHindiMarks()+s.getResult().getScienceMarks()+s.getResult().getEnglishMarks();
			System.out.println("{ Roll Number : "+s.getRollNo()+" , Name of Student : "+s.getStudentName()+", Class : "+s.getClassName()+", Section : "+s.getSection()+"} => Total Marks : "+totalMarks);
		});
		
	}

}
