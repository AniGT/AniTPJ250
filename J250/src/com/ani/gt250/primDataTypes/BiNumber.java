package com.ani.gt250.primDataTypes;

public class BiNumber 
{
	private int a;
	private int b;
		
	BiNumber(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int add()
	{
		return this.a +this.b;
	}
	
	public int multiply()
	{
		return this.a * this.b;
	}	
	
	//-----------------------------//
	public void Valuedouble()
	{
		this.a = this.a * 2;
		this.b = this.b * 2;
	}
   
	// Getters and setters generated by eclipese
	public int getA() {
		return a;
	}
	// not used
	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}
	// not used
	public void setB(int b) {
		this.b = b;
	}
}