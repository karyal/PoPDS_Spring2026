package day8;

public class Person {
	//Fields
	int pid;
	
	//Default Constructor
	Person(){
		this.pid=0;
	}
	
	//Parameterized Constructor
	Person(int pid){
		this.pid=pid;
	}
	
	//Setter for field
	public void setPid(int pid) {
		this.pid=pid;
	}
	//Getter of field
	public int getPid() {
		return this.pid;
	}
	//toString
	@Override
	public String toString() {
		return this.pid+" ";
	}
}













