package com.springcore;

public class ElectricEngine implements Engine
{
	public ElectricEngine() 
	{
		super();
		System.out.println("Electric Engine : Constructor started");
	}
	@Override
	public void start() 
	{
		System.out.println("Electric engine started");
		
	}
}
