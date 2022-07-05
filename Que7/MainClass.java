package com.yash.Que7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

			ApplicationContext context = new ClassPathXmlApplicationContext(
					"com/yash/merge_two_array_7/Config.xml");
			Array1 array1 = (Array1) context.getBean("array1");
			Array2 array2 = (Array2) context.getBean("array2");

			int lengthOfMergedArray = array1.getArray1().length + array2.getArray2().length;
			Integer[] newMergerArray = new Integer[lengthOfMergedArray];

			int i = 0;
		
			for (int a : array1.getArray1()) {
				newMergerArray[i] = a;
				i++;
			}
			
			for (int a : array2.getArray2()) {
				newMergerArray[i] = a;
				i++;
			}

			List<Integer> listArray = Arrays.asList(newMergerArray);
			int maximumNumber = listArray.stream().max(Integer::compare).get();
			System.out.println(maximumNumber);

	
	}
}
