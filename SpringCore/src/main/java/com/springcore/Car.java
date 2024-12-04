package com.springcore;

public class Car 
{
	public Engine eng;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(Engine eng)
	{
		this.eng=eng;
	}
	
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	public void drive()
	{
		if(eng==null)
		
	
		{
			System.out.println("System Failure");
		}
		else
		{
			eng.start();
		}
	}
}
