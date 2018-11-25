package com.ani.gt250.intro_OOP;

public class MotorBike
{   
	// State
	private int speed;		// Should not allow to be accessed through object
	
	
	// Behaviour
	
	void start()
	{
		System.out.println("Bike Started");
	}

	// Genereated by eclipse
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
		this.speed = speed;
	}
	
	public void increaseSpeed(int howMuch)
	{
		//this.speed += howMuch;
		setSpeed((this.speed + howMuch));
	}
	
	public void decreaseSpeed(int howMuch)
	{
		if(this.speed - howMuch > 0)
			setSpeed((this.speed - howMuch));
		//this.speed -= howMuch;
	}	 
	
	// Contructor - for object - Method Gets called after creating an object
	// Default constructor
	MotorBike()			// Notice same method name as class and no return type, can have input arg
	{	
		//this.speed = 1;   // initialized the speed
		// OR 
		this(1);			// Calling another constructor method with a parameter
		System.out.println("Bike Started");
	}
	
	MotorBike(int a)			// Notice same method name as class and no return type, can have input arg
	{	
		this.speed = a;   // initialized the speed
		

		System.out.println("Bike Started");
	}	
	
}
