package day24;

public class Student {
	private int sid;
	private String fullName;
	private double pop;
	private double db;
	private double cn;
	private double total;
	private double average;
	private String result;
	
	public Student() {
		this.sid = 0;
		this.fullName = "NA";
		this.pop = 0.0;
		this.db = 0.0;
		this.cn = 0.0;
		this.total = 0.0;
		this.average = 0.0;
		this.result = "NA";
	}
	
	public Student(int sid, String fullName, double pop, double db, double cn) {
		this.sid = sid;
		this.fullName = fullName;
		this.pop = pop;
		this.db = db;
		this.cn = cn;
		this.total = 0.0;
		this.average = 0.0;
		this.result = "NA";
	}
	
	public Student(Student student) {
		this.sid = student.sid;
		this.fullName = student.fullName;
		this.pop = student.pop;
		this.db = student.db;
		this.cn = student.cn;
		this.total = student.total;
		this.average = student.average;
		this.result = student.result;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getPop() {
		return pop;
	}

	public void setPop(double pop) {
		this.pop = pop;
	}

	public double getDb() {
		return db;
	}

	public void setDb(double db) {
		this.db = db;
	}

	public double getCn() {
		return cn;
	}

	public void setCn(double cn) {
		this.cn = cn;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fullName=" + fullName + ", pop=" + pop + ", db=" + db + ", cn=" + cn
				+ ", total=" + total + ", average=" + average + ", result=" + result + "]";
	}
}




