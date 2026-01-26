package day7;

import java.lang.Math;

public class CoreProgramming7 {

	public static void main(String[] args) {
		//1. Characters Set
		//2. Keywords - 50
		//3. Identifiers
		//4. Data Types 
		//5. Variables
		//6. Class & Object
		//7. Operators
		//a. Assignment Operator
		//i. Simple Assignment =
		//Assign value from right to left
		int num1;
		num1=5; //5 assign to num1
		System.out.println(num1);
		int num2 = num1; //value to num1 assign to num2
		System.out.println(num2);
		
		//ii. Short-hand assignment operator
		//+=, -=, *=, /=, %=
		int num3=9;
		num3+=2; //num3 = num3 + 2;
		System.out.println(num3); //11
		
		//iii. Multiple Assignment operator
		// = = = value
		int num5, num6, num7;
		num7 = num6 = num5 = 9;
		System.out.println(num7); //9
		
		//b. Arithmetic Operator
		//+, -, *, /, %  : byte, short, int, long, float, double
		
		//Power
		//java.lang.Math - Class
		//static double pow(double a, double b) - Method
		//How to call?
		
		//Step-1 : By create object - Non Static Method
		//Step-2 : Direct Call - Static Method
		double result = Math.pow(4, 3);
		System.out.println(result);
		
		//Root
		//static double sqrt(double a)
		double result2 = Math.sqrt(16);
		System.out.println(result2);
		
		//c. Relational Operator (==, !=, >, >=, <, <=)
		
		//Compare two values and return boolean result
		//Equals to ==
		//Return true if both values are equals
		
		//Not equals !=
		//Return true if both values are not equals
		
		// > Greater Than
		// < Less Than
		// >= GT or EQ
		// <= LT or EQ
		
		int num8=90;
		int num9=99;
		boolean result3 = (num8!=num9);
		System.out.println(result3);		
	}
}