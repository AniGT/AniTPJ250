package com.ani.gt250.conditinoals;

import java.util.Scanner;

public class MenuOperRunner {

	public static void main(String[] args) 
	{
		MenuOperation mo = new MenuOperation();
		System.out.println("Enter Number 1: ");
		Scanner scnr1 = new Scanner(System.in);
		int a = scnr1.nextInt();
		
		System.out.println("Enter Number 2: ");
		Scanner scnr2 = new Scanner(System.in);
		int b = scnr2.nextInt();
		
		//System.out.println("You have entered two number as "+ a+" and "+b);
		System.out.println("Enter your choice -");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		
		Scanner scnr3 = new Scanner(System.in);
		int c = scnr3.nextInt();
		
		mo.OperUsingIfElse(a, b, c);
		mo.OperUsingSwitch(a, b, c);
	}

}
