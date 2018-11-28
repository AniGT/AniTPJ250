package com.ani.gt250.primDataTypes;

public class Bin_Num_Runner 
{

	public static void main(String[] args) 
	{
	
		BiNumber numbers = new BiNumber(2,3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.Valuedouble(); // doubles the value of the class variables
		System.out.println(numbers.getA());
		System.out.println(numbers.getB());
	}

}
