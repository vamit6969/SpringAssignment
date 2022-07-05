package com.yash.Que1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
			ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/factorymethod_1/Config.xml");
			DeveloperRole dr=context.getBean(DeveloperRole.class);
			dr.role();
			DBRole db=context.getBean(DBRole.class);
			db.role();
	
	}

}
