package day6;

public class MyMethodsTestV4 {

	public static void main(String[] args) {
		int num1=1;
		int num2=3;
		//send values (value of num1, and num2)  to f1
		//new MyMethodsTestV4().f1(num1, num2);
		int num3 = new MyMethodsTestV4().f2(num1, num2);
		System.out.println("Sum :"+num3);
	}
	
	//Non-Parameterized; Return Type
	int f4() {
		return 8;
	}
	
	//Non-Parameterized; No Return Type
	void f3() {
		System.out.println("Hello form f3");
	}
	
	//Parameterized; Return Type
	int f2(int a, int b) {
		int num3=a+b;
		return num3;
	}
	
	//Parameterized; No Return Type
	void f1(int a, int b)//Listeners
	{
		int num3=a+b;//create local variable num1
		System.out.println("SUM "+num3);
	}
	
	
}
