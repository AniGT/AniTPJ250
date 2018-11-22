package com.ani.gt250.intro_OOP;

public class MotorBikeRunner {

	public static void main(String[] args) 
	{
		MotorBike jawa = new MotorBike();
		MotorBike honda = new MotorBike();
		
		jawa.start();
		honda.start();
		
	//	jawa.speed = 45; // Not a good practice to directly access instance varaible
	//	honda.speed = 40; // of a class, it should be done with the methods of that class - Encapsulation
		
		jawa.setSpeed(45);
		jawa.setSpeed(40);
		
		jawa.setSpeed(15);
		jawa.setSpeed(10);
	}

}
