package com.ani.gt250.loops;

public class forloop_triangle 
{
	public static void main(String[] args) 
	{
		int i;
		
		for(i = 1; i <= 5 ; i++)
		{	
			for(int j = 1; j <= i; j++)
				{
					System.out.print(j + " ");
				}
			System.out.println();
		}
	}

}
