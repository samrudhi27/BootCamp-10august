package com.aopconcepts.aspect;

import org.aspectj.lang.annotation.*;


@Aspect
public class MyAspect {
		
		@Before("execution(* com.aopconcepts.services.PaymentServiceImpl.makePayment())")
		public void printBefore() {
			System.out.println("Payment Started...");
		}
		@After("execution(* com.aopconcepts.services.PaymentServiceImpl.makePayment())")
		public void printAfter() {
			System.out.println("Payment Started...");
		}
		
}
