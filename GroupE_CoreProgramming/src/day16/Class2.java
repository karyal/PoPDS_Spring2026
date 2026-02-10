package day16;

abstract class Class01{
	abstract public void f1(); //Must override in sub class
	public void f2() {
		System.out.println("Hello from f2");
	}
}

class Class02 extends Class01{
	
	@Override
	public void f1() {
		System.out.println("Hello from f1 of Class02");
	}
	//Optional to override
	@Override
	public void f2() {
		System.out.println("Hello from f2 of Class02");
	}
}

public class Class2 {
	
}