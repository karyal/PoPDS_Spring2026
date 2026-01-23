package day5;

public class FunctionTest {

	//What is function in Java?
	//Block of statement that perform specific task and runs when it call
	
	public static void b6() {
		//Calculate rem
		int num1, num2, num3;
		num1=89;
		num2=7;
		num3=num1%num2;
		System.out.println("REM : "+num3);
	}
	
	public static void b5() {
		//Calculate div
		int num1, num2, num3;
		num1=89;
		num2=7;
		num3=num1/num2;
		System.out.println("DIV : "+num3);
	}
	
	public static void b4() {
		//Calculate prd
		int num1, num2, num3;
		num1=89;
		num2=7;
		num3=num1*num2;
		System.out.println("PRD : "+num3);
	}
	
	public static void b3() {
		//Calculate diff
		int num1, num2, num3;
		num1=89;
		num2=7;
		num3=num1-num2;
		System.out.println("DIFF : "+num3);
	}
	
	public static void b2() {
		//Calculate sum
		int num1, num2, num3;
		num1=89;
		num2=7;
		num3=num1+num2;
		System.out.println("SUM : "+num3);
	}
	
	public static void b1()
	{
		//Statement(s)
		//(Expression-1, Expression-2, Expression-3 - Valid)
		int num1; //declare variable - allocate memory to num1 on stack
		num1=45;//Assign - Store value
		System.out.println(num1); //Accessing/Retrieve the value of num1
	}
	
	public static void main(String[] args) {
		//System.out.println("Hello");
		//How to call?
		//b1(); //call
		//b1();
		//b1();
		
		//b2(); //sum
		//b3(); //dif
		//b4(); //prd
		//b5(); //div
		//b6(); //rem
		
		
	}
}
