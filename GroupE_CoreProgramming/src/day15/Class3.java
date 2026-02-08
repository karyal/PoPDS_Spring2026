package day15;

public class Class3 extends Class1 {
	//Fields
	private int num2;
	//Constructors
	public Class3() {
		this.num2=0;
	}
	public Class3(int num2) {
		this.num2=num2;
	}
	public Class3(Class3 c2) {
		this.num2=c2.num2;
	}
	//Getters
	public int getNum2() {
		return (this.num2);
	}
	//Setters
	public void setNum2(int num2) {
		this.num2=num2;
	}
	//toSting
	@Override
	public String toString() {
		return Integer.toString(num2);
	}
}
