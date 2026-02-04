package day12;

public class Calculator {
	private int num1;
	private int num2;
	private int num3;
	
	public Calculator() {
		this.num1=-1;
		this.num2=-1;
		this.num3=-1;
	}
	
	public Calculator(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		this.num3=-1;
	}
	
	//same name but different parameters - method overloading
	
}
