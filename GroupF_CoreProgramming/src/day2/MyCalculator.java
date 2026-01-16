package day2;

import java.util.Scanner; //input library

public class MyCalculator {
	public static void main(String[] args) {
		
		//Prompt for user
		//Enter first number : _1
		//Enter second number : _4
		
		System.out.print("Enter first number : ");
		Scanner sc1 = new Scanner(System.in); //declare an object of Scanner Class
		String firstnumber = sc1.nextLine();
		
		System.out.print("Enter second number : ");
		Scanner sc2 = new Scanner(System.in); //declare an object of Scanner Class
		String secondnumber = sc2.nextLine();
		
		//Calculation
		//+ ADD
		//String result = firstnumber+secondnumber;
		
		int num1 = Integer.parseInt(firstnumber); //String to Integer
		int num2 = Integer.parseInt(secondnumber); //String to Integer
		int num3 = num1+num2; //Calculate sum
		
		//Output
		//First Number is : 1
		//Second Number is : 4
		
		System.out.println("Number 1 : "+firstnumber);
		System.out.println("Number 2 : "+secondnumber);
		System.out.println("SUM : "+num3);
		
		//String - "value" - "123"
		//Integer - int - numeric - whole number 123
		//Double - double  - numeric - real number 123.456
		
	}
}
