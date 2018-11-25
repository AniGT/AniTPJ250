package com.ani.gt250.intro_OOP;

public class MotorBikeRunner {

	public static void main(String[] args) 
	{
		MotorBike jawa = new MotorBike();
		MotorBike honda = new MotorBike(5);
		System.out.println("Speed retrieved from getter for Jawa  after created obt - def constructor " + jawa.getSpeed());
		System.out.println("Speed retrieved from getter for Honda  after created obt - manual constructor " + honda.getSpeed());
		
		//jawa.start();
		//honda.start();
		 
	//	jawa.speed = 45; // Not a good practice to directly access instance varaible
	//	honda.speed = 40; // of a class, it should be done with the methods of that class - Encapsulation
		
		jawa.setSpeed(45);
		jawa.setSpeed(40);
		
		jawa.setSpeed(15);
		jawa.setSpeed(10);
		//jawa.setSpeed(-100);		// Logic to handle such case has to be in class - Encapsulation
		
		System.out.println("Speed retrieved from getter for Jawa " + jawa.getSpeed());
		
		jawa.increaseSpeed(30);
		
		System.out.println("Speed retrieved from getter for Jawa  after increasing " + jawa.getSpeed());
		
		jawa.decreaseSpeed(20);
		
		System.out.println("Speed retrieved from getter for Jawa  after decreasing " + jawa.getSpeed());
	}

}
