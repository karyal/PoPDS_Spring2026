package day15;

public class Class2 {
	//Fields
	private int num2;
	//Constructors
	public Class2() {
		this.num2=0;
	}
	public Class2(int num2) {
		this.num2=num2;
	}
	public Class2(Class2 c2) {
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
