package day14;

public class Class1 {
	private int num1;
	//public setter/getter
	
	//Methods with same name = method overloading
	public Class1(){
		this.num1=0;
	}
	public Class1(int num1) {
		this.num1=num1;
	}
	public void setNum1(int num1) {
		this.num1=num1;
	}
}

class Class2 extends Class1{
	public Class2() {
		//super.num1=9;
		//public setter/getter of super class
		//super.setter()
		//super.getter()
		super();//Call super class constructor
	}
	//Method overriding
	public void setNum1(int num1) {
		super.setNum1(num1);
	}
}