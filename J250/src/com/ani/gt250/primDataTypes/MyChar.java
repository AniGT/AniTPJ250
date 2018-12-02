package com.ani.gt250.primDataTypes;

public class MyChar 
{
	private char c1;
	
	//const
	MyChar(char c1)
	{
		this.c1 = c1;
	}
	
	public boolean isVowel()
	{
		if( c1 == 'a' || c1 == 'e' ||c1 == 'i'||c1 == 'o'||c1 == 'u'
		 || c1 == 'A' || c1 == 'E' || c1 == 'i' || c1 == 'O' ||c1 == 'U')
			return true;
		else
		return false;
	}

	public boolean isNumber()
	{
		if (c1 >=48 && c1<= 57)
			return true;
		else		
		return false;
	}

	public boolean isAlphabet() 
	{
		if ((c1 >=97 && c1<= 122) || (c1 >=65 && c1<= 90))
		return true;
		else
		return false;
	}
}
