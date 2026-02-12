package day15;

public class Class1 {
	private int num1;
	//Constructors, setters, getters and toString
	public Class1() {
		this.num1=0;
	}
	public Class1(int num1) {
		this.num1=num1;
	}
	public Class1(Class1 c1) {
		this.num1=c1.num1;
	}
	//Getter
	public int getNum1() {
		return this.num1;
	}
	public void setNum1(int num1) {
		this.num1=num1;
	}
	@Override
	public String toString() {
		return (Integer.toString(this.num1));
	}
}
