package day4;

public class PersonTest {
	public static void main(String[] args) {
		/*
		//step1
		Person p1, p2;
		
		//step2
		p1=new Person();
		p2=new Person();
		
		//step3
		p1.pid=1;
		p1.fullName="Krishna";
		p1.address="Balkhu";
		
		
		//step4
		System.out.println(p1.pid+","+p1.fullName+", "+p1.address);
		
		
		//step5
		//Auto
		*/
		
		//Declare and initialize an object
		Person p3=new Person(); 
		p3.pid=3;
		p3.fullName="Keshor Rai";
		p3.address="Kopundole";
		System.out.println(p3.pid+", "+p3.fullName+", "+p3.address);
		
		Person p4=p3; //Assign the reference of an object to another object
		System.out.println(p4.pid+", "+p4.fullName+", "+p4.address);
	}
}










