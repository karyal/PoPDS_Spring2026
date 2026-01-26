package day7;

public class PersonTest {

	public static void main(String[] args) {
		Person p9=new Person(); //Default Constructor
		Person p10=new Person(10, "Krishnna Aryyal"); //Parameterized Ctor
		
		//Setting values //Store value
		p9.setPid(9);
		p9.setFullName("Rosedip");
		
		p10.setFullName("Krishna Aryal");
		
		//Getting values/Retrieve value
		System.out.println(p9.getPid()); //Getting id
		System.out.println(p9.getFullName()); //Getting name
		
		System.out.println(p10.getPid());
		System.out.println(p10.getFullName());
		
		System.out.println(p9); //Print Object
		System.out.println(p10);
		
		/*
		//Parameterized Constructor
		Person p8=new Person(8, "Kiran Thapa");
		System.out.println(p8.pid);
		System.out.println(p8.fullName);
		
		//Default Constructor
		Person p7=new Person();
		System.out.println(p7.pid);
		System.out.println(p7.fullName);
		*/
		
		/*
		Person p6=new Person(); //Person() - 
		//Constructor Method
		//Method name and class name - same
		//new - new memory allocation to object
		//Person() - set default value on fields (pid, fullName)
		//Default Constructor is created by compiler at compile time
		
		//default value
			//byte, short, int, long - 0
			//float, double - 0.0
			//char
			//boolean - false
			//String - null
		
		System.out.println(p6.pid);
		System.out.println(p6.fullName);
		*/
		
		/*
		Person p3; //Declare an object
		p3=new Person(); //Initialize - allocation of memory
		
		Person p4=new Person(); //Declare and initialize
		
		Person p5=p4; //P5 refer to p4
		*/
		
		/*
		Person p1, p2; //Declare
		
		p1=new Person(); //Initialize
		p2=new Person();
		
		//Set
		p1.pid=2;
		p1.fullName="Rajan Thapa";
		p2.pid=3;
		p2.fullName="Bikram Roka";
		
		//Retrieve
		System.out.println(p1.pid);
		System.out.println(p1.fullName);
		
		System.out.println(p2.pid);
		System.out.println(p2.fullName);
*/
	}

}
