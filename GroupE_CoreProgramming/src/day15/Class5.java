package day15;

public class Class5 extends Class4{
	private int num3;
	//Constructors
	public Class5() {
		super();
		this.num3=0;
	}
	public Class5(int num1, int num2, int num3) {
		super(num1, num2);
		this.num3=num3;
	}
	public Class5(Class5 c5) {
		super(c5);
		this.num3=c5.num3;
	}
	//Setters
	public void setNum3(int num3) {
		this.num3=num3;
	}
	//Getters
	public int getNum3() {
		return this.num3;
	}
	//toStrig
	public String toString() {
		return super.toString()+", "+this.num3;
	}
}








