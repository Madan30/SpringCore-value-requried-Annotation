package com.NepalCode.SpringvalueAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config file is success");
		Student s = context.getBean("student", Student.class);
		s.displayStudentInfo();
	}

}
