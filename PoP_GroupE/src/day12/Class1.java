package day12;

public class Class1 { //Outer Class
	
	public void c1m1() {
		//How to call c2m1 method of Class2 in Class1
		new Class2().c2m1();
	}
	
	class Class2{ //Inner Class
		void c2m1() {
			System.out.println("Hello from c2f1()");
		}
	}
}

