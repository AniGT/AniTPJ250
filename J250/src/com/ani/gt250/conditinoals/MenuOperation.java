package com.ani.gt250.conditinoals;

public class MenuOperation
{
	public void OperUsingIfElse(int n1, int n2, int choice)
	{
		if(choice == 1) //additions
		{
			System.out.println("Result after addition is : "+ (n1 + n2));
		}
		else if (choice == 2) // subtraction
		{
			System.out.println("Result after subtration is : "+ (n1 - n2));
		}
		else if (choice == 3) // multiplication
		{
			System.out.println("Result after multilpication is : "+ (n1 * n2));
		}
		else if (choice == 4) // division
		{
			System.out.println("Result after division is : "+ (n1 / n2));
		}		
		else
		{
			System.out.println("Please enter a valid choice");
		}
	}

	public void OperUsingSwitch(int n1, int n2, int choice) 
	{
		switch (choice)
		{
			case 1 :  
				System.out.println("Result after addition is : "+ (n1 + n2));
				break;
			case 2 :  
				System.out.println("Result after subtration is : "+ (n1 - n2));
				break;
			case 3 :  
				System.out.println("Result after multilpication is : "+ (n1 * n2));
				break;
			case 4 :  
				System.out.println("Result after division is : "+ (n1 / n2));
				break;
			default : 
				System.out.println("Please enter a valid choice");
//				break;
		}
		
	}
	
}
