package day20.javafx_basic_controls;

public class Person {
	private int pid;
	private String fullName;
	private String address;
	
	public Person() {
		this.pid = 0;
		this.fullName = "NA";
		this.address = "NA";
	}
	
	public Person(int pid, String fullName, String address) {		
		this.pid = pid;
		this.fullName = fullName;
		this.address = address;
	}
	
	public Person(Person person) {		
		this.pid = person.pid;
		this.fullName = person.fullName;
		this.address = person.address;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", fullName=" + fullName + ", address=" + address + "]";
	}	
}
