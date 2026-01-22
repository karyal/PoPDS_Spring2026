package day4;

public class MyCalculatorTest {

	public static void main(String[] args) {
		//Basic Type -> Variable
		//Class Type -> Object
		
		//Declare an Object
		MyCalculator mc1;
		
		//Initialize an Object (Allocate memory to object)
		mc1 = new MyCalculator();
		
		//Store Value
		mc1.num1=9;
		mc1.num2=4;
		
		//Calculate sum
		mc1.calcSum();
		
		//Retrieve
		System.out.println(mc1.num1+", "+mc1.num2+", "+mc1.num3);
		
		//Calculate and display the difference of num1, and num2
		//Calculate and display the product of num1, and num2
		//Divide num1 by num2 and display the result.
		//Divide num1 by num2 and display remainder.
		
		
	}

}
