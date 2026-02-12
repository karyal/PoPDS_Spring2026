package day13;

public class Class2Test {

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		//c1 is an object of Class1
		//c1 can access the resources of class1
		//same package - default, public, protected, private
		c1.num1=9; //default
		c1.num2=90; //public
		c1.num3=89; //protected
		//c1.num4=32; //private //Cann't access the private
		
		Class2 c2 = new Class2();
		c2.num1=90; //default of Class1 (Super Class)
		c2.num2=87; //public of Class1 (Super Class)
		c2.num3=34; //protected of Class1 (Super Class)
		//c2.num4=10; //Cann't access the private resource of super class
		

	}

}











