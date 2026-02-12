package day9;

public class Calculator {
	int num1;
	int num2;
	int num3;
	
	//Constructors
	Calculator(){//default
		this.num1=0;
		this.num2=0;
		this.num3=0;
	}
	
	Calculator(int num1, int num2, int num3){ //Parameterized
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	
	Calculator(Calculator calculator){//Copy
		this.num1=calculator.num1;
		this.num2=calculator.num2;
		this.num3=calculator.num3;
	}
	
	//Setters for all
	public void setNum1(int num1) {
		this.num1=num1;
	}
	
	public void setNum2(int num2) {
		this.num2=num2;
	}
	
	public void setNum3(int num3) {
		this.num3=num3;
	}
	
	//Getters of all
	public int getNum1() {
		return this.num1;
	}
	public int getNum2() {
		return this.num2;
	}
	public int getNum3() {
		return this.num3;
	}
	//toString
	@Override
	public String toString() {
		return this.num1+", "+this.num2+", "+this.num3;
	}
}