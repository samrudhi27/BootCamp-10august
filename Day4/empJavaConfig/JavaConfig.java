package com.springcore.empjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Dept getDept() {
		return new Dept();
	}
	
	
	@Bean(name= {"employee","member","temp"})
	public Employee getEmployee() {
		//creating a new Employee object
		Employee emp = new Employee(getDept());
		return emp;
	}
	

}
