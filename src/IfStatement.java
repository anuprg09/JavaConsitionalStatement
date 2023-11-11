import java.util.Scanner;

public class IfStatement {

	//PS 1: take two user input and perform a comparison
	//and output the result

	//PS 2: take two user input
		//case 1:
		//if first num is > Sec num ,then we have to substract sec from First

		//case 2:
		//if first num is < Sec num ,then we have to substract First from Sec

		//case 2:
		//if first num is EQUAL to Sec num ,then we have to add first and Sec num
	
	
	
	
	
	//First Number
	//Sec number
	//2, 5
	//> < =
	
	public void NumberCompare()
	{
		Scanner scnObj = new Scanner(System.in);

		System.out.println("Input First Number..\r\n");
		int FirstNum = scnObj.nextInt();
		
		System.out.println("Input Sec Number..\r\n");
		int SecNum = scnObj.nextInt();

		//Conditional Statement
		
		//Syntax
		/*
		 if(conditional Statement) {
			//business Logic
		}
		*/
		
		if(FirstNum > SecNum)
		{
			System.out.println("First Number is Greater than Sec Number");
		}
		
		if(FirstNum < SecNum)
		{
			System.out.println("Sec Number is Greater than First Number ");
		}
		
		if(FirstNum == SecNum)
		{
			System.out.println("Sec Number is EQUAL to First Number ");
		}

		
	}
}
