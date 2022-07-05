package com.yash.Que8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
	public static void main(String[] args) {
	
			ApplicationContext ctx = new ClassPathXmlApplicationContext("com/yash/list_iteam_8/Config.xml");
			Items items=(Items)ctx.getBean("items");
		//	System.out.println(items.getItems());
			
			List<Item> ascendingOrderList=items.getItems().stream().sorted((e1,e2)->e1.getItemName().compareTo(e2.getItemName())).distinct().collect(Collectors.toList());
			System.out.println(ascendingOrderList);
			
			
			List<Item> descendingOrderList=items.getItems().stream().sorted((e1,e2)->e2.getItemName().compareTo(e1.getItemName())).distinct().collect(Collectors.toList());
			System.out.println(descendingOrderList);
			
	}

}
