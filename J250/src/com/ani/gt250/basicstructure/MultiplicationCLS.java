package com.ani.gt250.basicstructure;

public class MultiplicationCLS 
{
	void printtable(int val)
	{
		for(int i = 0; i <= 10; i++)
		{
			System.out.printf("%d * %d = %d", val, i, val * i).println();
		}
	}
	
	void func1()
	{
		System.out.println("In Function 1");
		func2();
	}

	void func2()
	{
		System.out.println("In Function 2");
		func3();
	}
	
	void func3()
	{
		System.out.println("In Function 3");
	}
}
