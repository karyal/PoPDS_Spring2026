package day7;

public class Person {
	//Fields
	int pid; //Person ID
	String fullName; //Full Name
	
	//Constructor - default constructor
	public Person() {
		pid=-1;
		fullName="NA";
	}
	
	//Parameterized
	public Person(int pid, String fullName) {
		this.pid=pid;
		this.fullName=fullName;
	}
	
	//Setters
	public void setPid(int pid) {
		this.pid=pid;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	
	//Getters
	public int getPid() {
		return this.pid;
	}
	public String getFullName() {
		return this.fullName;
	}
	
	@Override
	public String toString() {
		return this.pid+", "+this.fullName;
	}
}












