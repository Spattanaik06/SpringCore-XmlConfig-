package com.springcore;

public class TestDrive 
{
	public static void main(String[] args) 
	{
		Car car=new Car(new ElectricEngine());
		car.drive();
	}
}
