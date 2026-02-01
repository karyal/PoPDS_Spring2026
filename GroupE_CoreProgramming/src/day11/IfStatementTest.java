package day11;
import java.lang.Math;

public class IfStatementTest {

	public static void main(String[] args) {
		/*
		//static double	cbrt(double a)
		double result = Math.cbrt(123.456);
		System.out.println(result);
		*/
		
		//Logical AND
		//Example-1
		/*
		int pop=45;
		int dcn=56;
		int PM = 40;
		String result="FAIL";
		if((pop>=PM) && (dcn>=PM)) {
			result="PASS";
		}
		System.out.println("Result : "+result);
		*/
		
		//nested if statement
		//Example-1
		/*
		int pop=50;
		int dcn=15;
		int PM=40;
		String result="FAIL";
		if(pop>=PM)//outer
			if(dcn>=PM)//inner
				result="PASS";
		System.out.println("Result : "+result);
		*/
		
		//else if statement
		//Example-1
		/*
		int num1=9;
		if(num1==1) {
			System.out.println("SUN");
		}
		else if(num1==2) {
			System.out.println("MON");
		}
		else if(num1==3) {
			System.out.println("TUE");
		}
		else if(num1==4) {
			System.out.println("WED");
		}
		else if(num1==5) {
			System.out.println("THU");
		}
		else if(num1==6) {
			System.out.println("FRI");
		}
		else if(num1==7) {
			System.out.println("SAT");
		}
		else {
			System.out.println("Other");
		}
		*/	
		
		//if else statement
		/*
		//Example-2
		int pop=15;
		int PM=40;
		if(pop>=PM) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		*/
		
		/*
		//Example-1
		int num1=3;
		if(num1==1) {
			System.out.println("One");
		}
		else {
			System.out.println("Other");
		}
		*/
		
		//if not statement
		/*
		int pop=45;
		int PM=40;
		if(!(pop<PM)) {
			System.out.println("PASS");
		}
		if(pop<PM) {
			System.out.println("FAIL");
		}
		*/
		
		/*
		int num1=2;
		if(num1==1) {
			System.out.println("One");
		}
		if(num1!=1) {
			System.out.println("Other");
		}
		*/
		
		//if statement
		/*
		int num1=2;
		if(num1==1) {
			System.out.println("One");
		}
		if(num1==2) {
			System.out.println("Two");
		}
		if(num1==3) {
			System.out.println("Three");
		}
		*/

	}

}







