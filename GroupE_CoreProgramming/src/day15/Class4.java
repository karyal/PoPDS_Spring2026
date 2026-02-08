package day15;

public class Class4 extends Class1 {
	//Fields
	private int num2;
	//Constructors
	public Class4() {
		super(); //Call default ctr of super class
		this.num2=0;
	}
	public Class4(int num1, int num2) {
		super(num1); //Call parameterized ctr of super class
		this.num2=num2;
	}
	public Class4(Class4 c4) {
		super(c4); //Call copy constructor of super class
		this.num2=c4.num2;
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
		return super.toString()+", "+Integer.toString(num2);
	}
}