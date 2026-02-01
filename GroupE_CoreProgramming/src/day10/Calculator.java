package day10;
//private is not permitted
//default, public, abstract, final
 public class Calculator {
	int num1;
	int num2;
	int num3;
	
	public Calculator(){ //default Constructor
		this.num1=-1;
		this.num2=-1;
		this.num3=-1;
	}
	
	Calculator(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
		this.num3=-1;
	}
	Calculator(int num1, int num2, int num3){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	Calculator(Calculator c){
		this.num1=c.num1;
		this.num2=c.num2;
		this.num3=c.num3;
	}
	//Setters - Store/Update value on field
	public void setNum1(int num1) {
		this.num1=num1;
	}
	public void setNum2(int num2) {
		this.num2=num2;
	}
	public void setNum3(int num3) {
		this.num3=num3;
	}
	//Getters - Retrieve value of field
	public int getNum1() {
		return this.num1;
	}
	public int getNum2() {
		return this.num2;
	}
	public int getNum3() {
		return this.num3;
	}
	// Return all the fields
	@Override
	public String toString() {
		return this.num1+", "+this.num2+", "+this.num3;
	}
}








