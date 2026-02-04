package day12;

public class MyMethods {
	
	void m1(){//Non-static method
		System.out.println("Hello from m1()");
	}
	
	void m1(String message){//Non-static method
		System.out.println(message);
	}
	
	void m1(double num1){//Non-static method
		System.out.println(num1);
	}
	
	
	static void m2() {//static method
		System.out.println("Hello from m2()");
	}
	
	void m3(Numbers nums) {//Parameter
		System.out.println(nums);
	}
	
	
}
