package com.ani.gt250.intro_OOP;

public class MotorBike
{   
	// State
	private int speed;		// Should not allow to be accessed through object
	
	
	// Behaviour
	void setSpeed(int speed) 
	{
		this.speed = speed;
		
		System.out.println("Input speed value "+ speed);
		System.out.println("Class speed value "+ this.speed);
	}
	
	void start()
	{
		System.out.println("Bike Started");
	}
	
}
