package com.springemployee.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Employee emp1=(Employee) context.getBean("emp1");
        System.out.println(emp1);
        @SuppressWarnings("resource")
		ApplicationContext context1= new ClassPathXmlApplicationContext("config.xml");
       Employee emp2=(Employee) context1.getBean("emp2");
        System.out.println(emp2);
    }
}
