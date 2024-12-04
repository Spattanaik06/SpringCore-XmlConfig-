package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDriveinXmlFile 
{
	public static void main(String[] args) 
	{
		ApplicationContext ct=new ClassPathXmlApplicationContext("SpringBean.xml");
		Car bean = ct.getBean(Car.class);
		bean.drive();
		
	}
}
