package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pizza implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void afterPropertiesSet() throws Exception{
		System.out.println("Eating Pizza: Init");
	}
	public void destroy() throws Exception{
		System.out.println("Done Eating Pizza: Destroy");
	}
	

}
