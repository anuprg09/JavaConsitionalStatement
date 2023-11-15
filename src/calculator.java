import java.util.Scanner;

public class calculator {

	
	Scanner scnObj = new Scanner(System.in);
	String operationType;
	
	public void DoCalc()
	{
		System.out.println("Hey user, pls input your choice of any one type of operation from +, -, * /");
		operationType = scnObj.next();
		calculator objCalc= new calculator();
		
		if(operationType.equals("+"))
		{
			objCalc.Add();
		}
		else if (operationType.equals("-")) {
			objCalc.Sub();
		}
		else if (operationType.equals("*")) {
			objCalc.Mul();
		}
		else if  (operationType.equals("/")){
			objCalc.Division();
		}
		else {
			System.out.println("ERROR!!!, pls select your choice either +, -, * /");
		}
		
		
	}
	
	public void Add() {
		System.out.println("pls input two numbers");
		
		int firstNum = scnObj.nextInt();
		int secNum = scnObj.nextInt();
	
		int total =  firstNum + secNum;
		System.out.println("Result of Addition is " + total);
		
	}
	
	public void Sub() {
		System.out.println("pls input two numbers, your First number should be greater than Sec Number...");
		
		int firstNum = scnObj.nextInt();
		int secNum = scnObj.nextInt();
	
		if(firstNum > secNum) 
		{
			int total =  firstNum - secNum;
			System.out.println("Result of Sub is " + total);
		}
		else {
			System.out.println("Error!!!\r\nPls input first number as greater than sec value Input...");
		}
		
	}
	
	public void Mul() {
		System.out.println("pls input two numbers and make sure none of the number is Zero ...");
		
		int firstNum = scnObj.nextInt();
		int secNum = scnObj.nextInt();
	
		if(firstNum != 0) 
		{
			if(secNum != 0)
			{
				int total =  firstNum * secNum;
				System.out.println("Result of Mul is " + total);
			}
			else {
				System.out.println("Error!!!\r\nPls input NON-ZERO value!!!");
			}
		}
		else {
			System.out.println("Error!!!\r\nPls input NON-ZERO value!!!");
		}
		
	}
	
	public void Division() {
		System.out.println("pls input two numbers and make sure none of the number is Zero ...");
		
		int firstNum = scnObj.nextInt();
		int secNum = scnObj.nextInt();
	
		if(firstNum != 0) 
		{
			if(secNum != 0)
			{
				int total =  firstNum / secNum;
				System.out.println("Result of Div is " + total);
			}
			else {
				System.out.println("Error!!!\r\nPls input NON-ZERO value!!!");
			}
		}
		else {
			System.out.println("Error!!!\r\nPls input NON-ZERO value!!!");
		}
		
	}
	
	
}
