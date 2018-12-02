package com.ani.gt250.primDataTypes;

import java.math.BigDecimal;

public class Simple_Interest_Calculator 
{
	
	BigDecimal amount;
	BigDecimal intRate;
	BigDecimal intRateConverter = new BigDecimal("100.00");
	BigDecimal numOfMonthsInYear = new BigDecimal("12.0");
	
	Simple_Interest_Calculator(String amount, String intRate)
	{
		this.amount = new BigDecimal(amount);
		this.intRate = new BigDecimal(intRate);
		
	}
	
	public BigDecimal calculateMonthlyInterest()
	{
		BigDecimal monthlyInterest;
		monthlyInterest = this.amount.multiply(this.intRate).divide(numOfMonthsInYear).divide(intRateConverter);
		return monthlyInterest;
	}
	
}
