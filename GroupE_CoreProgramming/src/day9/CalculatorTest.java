package day9;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(4,5,0);
		MyCalculator mc1=new MyCalculator();
		System.out.println(c1);
		c1 = mc1.sum(c1);
		System.out.println(c1);
				
		/*
		//Call default Constructor
		Calculator c1=new Calculator(); 
		
		//Call Parameterized Constructor
		Calculator c2 = new Calculator(34, 23, 0);
		
		//Call Copy Constructor
		Calculator c3 = new Calculator(c2);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		*/
		
		
		

	}

}
