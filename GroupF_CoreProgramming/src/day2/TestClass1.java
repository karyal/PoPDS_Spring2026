package day2;

public class TestClass1 {
	public static void main(String []args) {
		//code re-use
		//write once; use many
		
		//Style-1
		System.out.print("Welcome\n");
		System.out.print("to\n");
		System.out.print("PCPS College\n");
		
		//Style-2
		System.out.println("Welcome");
		System.out.println("to");
		//System.out.println("PCPS College");
		
		//Single line Comment - is not run what?
		
		/* Multi-line comment
		System.out.println("Welcome");
		System.out.println("to");
		*/
		
		MyClass1 c1 = new MyClass1();
		//c1 is an object of MyClass1 Class
		//by using c1 we can call/use the code of MyClass1
		c1.welcome();//Call welcome method of MyClass1
		c1.welcome();
		c1.welcome();
		c1.welcome();
		c1.welcome();
		
	}
}
