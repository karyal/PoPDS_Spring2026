package day19;

public class MyNumber {
	private int num1;
	//Constructors
	public MyNumber() {
		this.num1=0;
	}
	public MyNumber(int num1) {
		this.num1=num1;
	}
	public MyNumber(MyNumber mn) {
		this.num1=mn.num1;
	}
	//Setters
	public void setNum1(int num1) {
		this.num1=num1;
	}
	//Getters
	public int getNum1() {
		return this.num1;
	}
	//toString
	@Override
	public String toString() {
		return Integer.toString(this.num1);
	}
}