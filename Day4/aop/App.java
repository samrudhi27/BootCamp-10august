package com.aopconcept.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aopconcept.services.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("com/aopconcept/aop/config.xml");
        PaymentService ps=context.getBean("payment", PaymentService.class);
    		ps.makePayment(123);
    }
}
