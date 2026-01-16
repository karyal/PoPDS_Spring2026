package day2;

import java.util.Scanner;

public class BasicIO2 {
	public static void main(String[] args) {
		//Read and display the following information of Student
		//full name
		//address
		//email
		//phone
		//course
		//section
		
		System.out.print("Enter fullname : ");//prompt for user
		Scanner sc1 = new Scanner(System.in);
		String fullname=sc1.nextLine(); //read name
		
		System.out.print("Enter address : ");//prompt for user
		Scanner sc2 = new Scanner(System.in);
		String address=sc2.nextLine(); //read address
		
		System.out.print("Enter email : ");//prompt for user
		Scanner sc3 = new Scanner(System.in);
		String email=sc3.nextLine(); //read email
		
		System.out.print("Enter phone : ");//prompt for user
		Scanner sc4 = new Scanner(System.in);
		String phone=sc4.nextLine(); //read phone
		
		System.out.print("Enter course : ");//prompt for user
		Scanner sc5 = new Scanner(System.in);
		String course=sc2.nextLine(); //read course
		
		System.out.print("Enter address : ");//prompt for user
		Scanner sc6 = new Scanner(System.in);
		String section=sc2.nextLine(); //read section
		
		//output
		System.out.println("NAME : "+fullname);
		System.out.println("ADDRESS : "+address);
		System.out.println("EMAIL : "+email);
		System.out.println("PHONE : "+phone);
		System.out.println("COURSE : "+course);
		System.out.println("SECTION : "+section);
		
		
	}
}
