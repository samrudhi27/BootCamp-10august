package com.springcore.empjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		Employee student= context.getBean("employee",Employee.class);
		System.out.println(student);
		student.work();
		//context.close();
	
	}

}
