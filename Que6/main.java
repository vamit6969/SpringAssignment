package com.yash.Que6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.Que5.Config;

public class main {

	public static void main(String[] args) {
		String[] names = new String[5];
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Name name = (Name) context.getBean("name");
	System.out.println(name);
		names[0] = name.getName1();
		names[1] = name.getName2();
		names[2] = name.getName3();
		names[3] = name.getName4();
		names[4] = name.getName5();
		for (String n : names) {
			for (int i = 0; i < n.length(); i++) {
				if (n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o'
						|| n.charAt(i) == 'u') {
					System.out.println(name + " contains vowel");
					break;
				} else
					continue;
			}
		}

	}

}
