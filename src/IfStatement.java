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
		int Firstvalue = scnObj.nextInt();
		
		System.out.println("Input Sec Number..\r\n");
		int Secvalue = scnObj.nextInt();

		//Conditional Statement
		
		//Syntax
		/*
		 if(conditional Statement) {
			//business Logic
		}
		*/
		//case 1:
		//if first num is > Sec num ,then we have to substract sec from First

		if(Firstvalue > Secvalue) {
			int Result = Firstvalue - Secvalue;
			System.out.println("First number is Greater than Sec num and Result is : " + Result);
		}
		
		//case 2:
		//if first num is < Sec num ,then we have to substract First from Sec
		if(Firstvalue < Secvalue)
		{
			int result = Secvalue-Firstvalue;
			System.out.println("First number is less than Sec num and Result is : " + result);
		}

		//case 3:
		//if first num is EQUAL to Sec num ,then we have to add first and Sec num
		//== : equality operator
		if(Secvalue==Firstvalue)
		{
			int result = Firstvalue + Secvalue;
			System.out.println("First number is equal to Sec num and Result of addition is : " + result);
		}
		
		

		
	}
}
