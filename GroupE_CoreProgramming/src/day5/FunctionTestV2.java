package day5;

public class FunctionTestV2 {

	//What is method in Java?
	//Block of statement that perform specific task and runs when it call
	//Method name -> meaningful
	
	public static void calculateRemainder() {
		//Calculate rem
		int num1, num2, num3;
		num1=89;
		num2=7;
		num3=num1%num2;
		System.out.println("REM : "+num3);
	}
	
	public static void calculateQuotient() {
		//Calculate div
		int num1, num2, num3;
		num1=89;
		num2=7;
		num3=num1/num2;
		System.out.println("DIV : "+num3);
	}
	
	public static void calculateProduct() {
		//Calculate prd
		int num1, num2, num3;
		num1=89;
		num2=7;
		num3=num1*num2;
		System.out.println("PRD : "+num3);
	}
	
	public static void calculateDifference() {
		//Calculate diff
		int num1, num2, num3;
		num1=89;
		num2=7;
		num3=num1-num2;
		System.out.println("DIFF : "+num3);
	}
	
	public static void calculateSum() {
		//Calculate sum
		int num1, num2, num3;
		num1=89;
		num2=7;
		num3=num1+num2;
		System.out.println("SUM : "+num3);
	}
	
	//Static method
	public static void testMethod()	{
		//Statement(s)
		//(Expression-1, Expression-2, Expression-3 - Valid)
		int num1; //declare variable - allocate memory to num1 on stack
		num1=45;//Assign - Store value
		System.out.println(num1); //Accessing/Retrieve the value of num1
	}
}