package com.springcore;

public class DieselEngine implements Engine
{

	
	public DieselEngine() 
	{
		super();
		System.out.println("Diesel Engine : Constructor started");
	}

	@Override
	public void start() 
	{
		System.out.println(" diesel engine  started");
		
	}

}
