package day13.second_class;

class Class1 {
	private int num1;//instance variable or field of class
	//Constructors - Methods with same name but different parameters
	//is known as method overloading
	
	//Set Multi-value
	public Class1() { 
		this.num1=0;
	}
	public Class1(int num1) { 
		this.num1=num1;
	}
	public Class1(Class1 c1) {
		this.num1=c1.num1;
	}
	//Setter /Mutator - Value store - Single Value
	public void setNum1(int num1) {
		this.num1=num1;
	}
	//Getter /Accessor - Value retrieve - Single Value
	public int getNum1() {
		return this.num1;
	}
	@Override
	public String toString() {
		return Integer.toString(this.num1); //convert int to String and return
	}
}

public class EncapsulationTest {

}
