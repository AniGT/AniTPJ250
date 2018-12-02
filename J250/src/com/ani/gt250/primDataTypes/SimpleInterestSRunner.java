package com.ani.gt250.primDataTypes;

import java.math.BigDecimal;

public class SimpleInterestSRunner {
	
	public static void main(String[] args) 
	{   
		BigDecimal monthlyInterest;
		Simple_Interest_Calculator calc = new Simple_Interest_Calculator("4000000.00","7.7775");
		monthlyInterest = calc.calculateMonthlyInterest();
		System.out.println("Monthly interest is "+monthlyInterest);
	}

}
