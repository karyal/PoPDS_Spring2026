package day10;

import java.lang.String; // Step-1
import java.util.Scanner;

public class ClassTest {

	public static void main(String[] args) {
		//String Class
		String str1=new String("PCPS College");//Step-2 Declare and initialize
		System.out.println(str1.length());//Step-3 Method Call
		//Explore all the methods of String Class //HW
		
		//char charAt(int index)
		//char ch = str1.charAt(50);
		//System.out.println(ch);
		
		//int compareTo(String anotherString)
		//name of method
		//parameter(s)
		//return type
		String str2 = new String("abc@3543");
		String str3 = new String("abc@6543");
		System.out.print("Enter your password : ");
		str3 = new Scanner(System.in).nextLine();
		int result = str2.compareTo(str3);
		if(result==0) {
			System.out.println("Welcome user!");
		}
		else {
			System.out.println("Password is not correct.");
		}
		
		
		
		
		//Math Class
		//Explore all the methods of Math Class//HW
		
		//Scanner Class
		//Explore all the methods of Scanner Class //HW
		
	}

}
