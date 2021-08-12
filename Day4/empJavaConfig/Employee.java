package com.springcore.empjavaconfig;

//import org.springframework.stereotype.Component;

//@Component("firstemp")
public class Employee {
	
	public Dept dept;
	
	

	

	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public void work()
	{
		this.dept.display();
		System.out.println("Employee is working");
	}
	public Employee(Dept dept) {
		super();
		this.dept = dept;
	}
	

}
