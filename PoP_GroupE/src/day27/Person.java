package day27;

public class Person {
	private int pid;
	private String fullName;
	private String address;
	private String email;
	private String phone;
	private String gender;
	private String dob;
	private String qualification;
	
	public Person() {
		this.pid = 0;
		this.fullName = "";
		this.address = "";
		this.email = "";
		this.phone = "";
		this.gender = "";
		this.dob = "";
		this.qualification = "";
	}
	
	public Person(int pid, String fullName, String address, String email, String phone, String gender, String dob,
			String qualification) {
		this.pid = pid;
		this.fullName = fullName;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.dob = dob;
		this.qualification = qualification;
	}
	
	public Person(Person person) {
		this.pid = person.pid;
		this.fullName = person.fullName;
		this.address = person.address;
		this.email = person.email;
		this.phone = person.phone;
		this.gender = person.gender;
		this.dob = person.dob;
		this.qualification = person.qualification;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", fullName=" + fullName + ", address=" + address + ", email=" + email
				+ ", phone=" + phone + ", gender=" + gender + ", dob=" + dob + ", qualification=" + qualification + "]";
	}
	
	
}
