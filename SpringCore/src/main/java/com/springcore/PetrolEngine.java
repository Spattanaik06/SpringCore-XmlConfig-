package com.springcore;

public class PetrolEngine implements Engine
{
	
	public PetrolEngine() 
	{
		super();
		System.out.println("Petrol Engine : Constructor started");
	}
	@Override
	public void start() {
		System.out.println("Petrol engine started");
		
	}

}
