package com.yash.Que4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
			ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/demonstrate_4/Config.xml");
			List<Employee> empList = new ArrayList<Employee>();
			Employee employee1 = (Employee) context.getBean("employee");
			employee1.setEmpId(10434);
			employee1.setEmpName("amay");
			employee1.setEmpSalary(23600);
			empList.add(employee1);
			
			Employee employee2= (Employee) context.getBean("employee");
			employee2.setEmpId(10431);
			employee2.setEmpName("Gurvinder");
			employee2.setEmpSalary(23464);
			empList.add(employee2);
			
			
			Employee employee3 = (Employee) context.getBean("employee");
			employee3.setEmpId(10422);
			employee3.setEmpName("Amit");
			employee3.setEmpSalary(34256);
			empList.add(employee3);
		
			List<Employee> empSortedList=empList.stream().sorted(Comparator.comparing(Employee::getEmpSalary)).collect(Collectors.toList());
			
			System.out.println(empSortedList);
			
	
		}
	}


