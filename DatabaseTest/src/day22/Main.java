package day22;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		//input
		int sid;
		String fullName;
		Double pop, cn, db;
		new InputOutputImplement().printString("Enter SID: ");
		sid=new InputOutputImplement().readInteger();
		new InputOutputImplement().printString("Enter NAME: ");
		fullName=new InputOutputImplement().readString();
		new InputOutputImplement().printString("Enter Marks PoP: ");
		pop=new InputOutputImplement().readDouble();
		new InputOutputImplement().printString("Enter Marks CN: ");
		cn=new InputOutputImplement().readDouble();
		new InputOutputImplement().printString("Enter Marks DB: ");
		db=new InputOutputImplement().readDouble();
		Student student = new Student(sid, fullName, pop, cn, db);
		CalculateResultImplement calculateResult = new CalculateResultImplement(student);
		calculateResult.calculateTotal();
		calculateResult.calculateAverage();
		calculateResult.calculateResult();
		new StudentCRUDImplement().save(student);
		Student s1 = new StudentCRUDImplement().search(1);
		System.out.println(s1);
		List<Student> students = new StudentCRUDImplement().all();
		System.out.println(students);//?
		//process
		//output
		//send to database
		//receive from database
	}
}
