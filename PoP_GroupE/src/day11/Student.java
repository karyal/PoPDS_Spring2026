package day11;
//Class Diagram
//Class Code
public class Student {
	//Fields
	private int sid;
	private String fullName;
	private int pop;
	private int dcn;
	private int total;
	private int average;
	private String result;
	
	//Methods
	//Constructors
	public Student() {
		this.sid=-1;
		this.fullName="NA";
		this.pop=-1;
		this.dcn=-1;
		this.total=-1;
		this.average=-1;
		this.result="NA";
	}
	public Student(int sid, String fullName, int pop, int dcn) {
		this.sid=sid;
		this.fullName=fullName;
		this.pop=pop;
		this.dcn=dcn;
		this.total=-1;
		this.average=-1;
		this.result="NA";
	}
	public Student(Student student) {
		this.sid=student.sid;
		this.fullName=student.fullName;
		this.pop=student.pop;
		this.dcn=student.dcn;
		this.total=student.total;
		this.average=student.average;
		this.result=student.result;
	}
	
//Getters
	public int getSid() {
		return this.sid;
	}
	public String getFullName() {
		return this.fullName;
	}
	public int getPop() {
		return this.pop;
	}
	public int getDcn() {
		return this.dcn;
	}
	public int getTotal() {
		return this.total;
	}
	public int getAverage() {
		return this.average;
	}
	public String getResult() {
		return this.result;
	}
	
//Setters
	public void setSid(int sid) {
		this.sid=sid;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	public void setPop(int pop) {
		this.pop=pop;
	}
	public void setDcn(int dcn) {
		this.dcn=dcn;
	}
	public void setTotal(int total) {
		this.total=total;
	}
	public void setAverage(int average) {
		this.average=average;
	}
	public void setResult(String result) {
		this.result=result;
	}
	public String toString() {
		return this.sid+", "+this.fullName+", "+this.pop+", "+this.dcn+", "+this.total+", "+this.average+", "+this.result;
	}
}
