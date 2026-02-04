package day12;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		//Store
		p1.pid=1; //default
		p1.fullName="Roshan Thapa";//public
		//p1.address="Balkhu"; //private Cann't access the private field
		p1.email="roshan@gmail.com";
		
		//Retrieve
		System.out.println(p1.pid);
		System.out.println(p1.fullName);
		//System.out.println(p1.address); ////Cann't access the private field
		System.out.println(p1.email);
		
		//Final Variable
		MyClass1 mc1=new MyClass1();
		mc1.num1=46;//write
		System.out.println(mc1.num1);//read
		//mc1.num2=89;//The final field MyClass1.num2 cannot be assigned
		System.out.println(mc1.num2);
		
		
		
		
		
	}
}