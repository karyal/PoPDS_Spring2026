package day10;
//1
import day10.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		//2 Object
		Calculator c1 = new Calculator();
		
		//3 Call methods
		c1.num1=9;//direct access the field of class
		c1.setNum1(10); //indirect access the field of class
		System.out.println(c1.getNum1());
		System.out.println(c1);//retrieve all the fields
		

	}

}
