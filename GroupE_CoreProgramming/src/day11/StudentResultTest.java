package day11;

import java.util.Scanner;

public class StudentResultTest {

	public static void main(String[] args) {
		int sid=1;
		String fullName="Asim Yadav";
		int pop=45;
		int dcn=89;
		
		//Reading value from user
		System.out.print("Enter SID ");
		sid = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter NAME ");
		fullName = new Scanner(System.in).nextLine();
		System.out.print("Enter Marks - PoP ");
		pop = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter Marks - DCN ");
		dcn = Integer.parseInt(new Scanner(System.in).nextLine());
		//Set value to student
		Student s1 = new Student(sid, fullName, pop, dcn);
		//Set student to student result
		StudentResult sr=new StudentResult(s1);
		//process data
		sr.calculateTotal();
		sr.calculateAverage();
		sr.calculateResult();
		//print result
		System.out.println(sr.getStudent());
	}
}