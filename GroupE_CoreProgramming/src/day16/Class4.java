package day16;
import p1.Class1;

abstract class Class04 { 
	//must extends to use
	abstract void f1(); //abstract method - must override
	final void f2() { //Cann't override
		System.out.println("Hello from f2");
	}
	void f3() {//General method; can override if needed
		System.out.println("Hello from f3");
	}
}

final class Class041{
	//cann't extends
}

 class Class042 {
	 //can extends
	 
 }
 
public class Class4 {
public static void main(String[] args) {
	new Class1().f1();//Call the method
}
}
