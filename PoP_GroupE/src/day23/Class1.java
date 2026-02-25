package day23;

//Encapsulation
public class Class1 {
	//Variables - fields
	//Methods
		//General method
		//Method Overloading
	//Access Specifiers
	//this
}

//Inheritance
class Class2 extends Class1{
	//Variables - fields
		//Methods
			//General method
			//Method Overloading
			//Method Overriding
		//Access Specifiers
	//super
}
//Abstract Class must have abstract method
//Abstract class must be extends
abstract class Class3 {
	abstract void f1(); //will be complete in future
}

class Class4 extends Class3{
	@Override
	void f1() {
		System.out.println("Hello");
	}
}

class Class5 extends Class3{
	@Override
	void f1() {
		System.out.println("Welcome to PCPS");
	}
}

interface Inf1{
	void f2(); //abstract method - default; must override in sub class
}

class Class6 implements Inf1{
	@Override
	public void f2() {
		System.out.println("Hello form f2 of Class5");
	}
}













