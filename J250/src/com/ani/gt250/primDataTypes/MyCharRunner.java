package com.ani.gt250.primDataTypes;

public class MyCharRunner {

	public static void main(String[] args) 
	{
		MyChar ch = new MyChar('1');
		System.out.println(ch.isVowel());
		
		System.out.println(ch.isNumber());
		
		System.out.println(ch.isAlphabet());
	}
	

}
