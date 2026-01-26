package day6;


public class MyMethodsV3 {
	
	void f5() {
		int num1=9;
		int num2=2;
		int num3 = num1%num2;
		System.out.println("REM : "+num3);
	}
	
	void f4() {
		int num1=9;
		int num2=2;
		int num3=num1/num2;
		System.out.println("DIV : "+num3);
	}
	
	void f3() {
		int num1=6;
		int num2=5;
		int num3=num1*num2;
		System.out.println("PRD : "+num3);
	}
	
	void f2() //Name of block is called method
	{//Block Start
		int num1=80; //declare and initialize //Statement-1
		int num2=9; //declare and initialize //Statement-2
		int num3=num1-num2; //declare and initialize by sub //Statement-3
		System.out.println("DIF : "+num3);//accessing the value of num3 //Statement-4
	} //Block End
	
	void f1() {
		//Calculate sum
		int num1=9; //
		int num2=4;
		int num3=num1+num2;
		System.out.println("SUM : "+num3);
	}
	
	void main() {
		//can call from other method
		System.out.println("Hello from PCPS College-2");
	}	
}