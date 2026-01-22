package day3;

public class CoreProgramming {
	public static void main(String[] args) {
		//Comment - Single Line
		/*
		 * Comment - Multi-Line
		 */
		
		//1. Characters Set - Total Characters?
		//Alphabets
		//Digits
		//Symbols
		//Whitespace
		//Other
		
		//2. Keywords - 50 Keywords
		//Pre-defined words in Java
		//public, class, package, void
		
		//3. Identifiers
		//User given name to Class, Object, Method, Package
		//Cann't be keyword
		//Must start with alphabet
		//NoSpace
		//Length-Any number
		
		//4. Data Types
		//Basic Type - Value store in Stack
		//byte, short, int, long - whole number
		//float, double - real number
		//char  - 'A'
		//boolean - true/false
		
		//Reference Type - Value store in Heap
		//Declare in Stack, and refer value on Heap
		
		//String - "Value"
		//User defined classes
		
		//5. Operators
		//Characters Set (All Characters)
		//2 Value Based
		//+ Add - Instruction to CPU - Operator
		//3 Value Based
		
		//+, -, *, /, %
		//=, +=, -=, *=, /=, %=, = ... = ... = ...
		//==, !=, >, >=, <, <=
		//!, &&, ||
		//,, ., [], {}, ()
		//?, others
		
		//Calculate sum
		int x, y, z; //identifiers of basic type
		x=9;
		y=8;
		z=x+y;
		System.out.println(z);
		
		//6. Basic InputOutput
		//Reading value from user
		//Scanner -> nextLine()
		
		//Display value on Screen
		//System.out.print(); \n
		//System.out.println();
		
		//7. Arithmetic Operators
		int num1, num2, num3, num4, num5, num6; //Declare variables
		num1=34;//Value Assign
		num2=56;
		num3=num1+num2; //Calculate sum
		num4=num1-num2;
		num5=num1*num2;
		// /, %, pow, sqrt
		num6 = num1/num2;
		
		System.out.println("SUM : "+num3);//Display output
		System.out.println("DIF : "+num4);
		System.out.println("PRD : "+num5);
		System.out.println("DIV : "+num6);
		
		//8. Variable
		//Declare Variable
		
		//Syntax
		//DataType variableName (Identifier - user given word)
		//byte, short, int, long, float, double - default is 0
		//char, boolean
		
		int num7; //declare variable with default value
		int num8; 
		int num9;
		int num10;
		num7=9; //Value Assign
		num8=5;
		num9=num7/num8;
		num10=num7%num8;		
		
		System.out.println(num10); //Value Access
		//Assignment Operator
		
		
		
		
	}
}











