package day11;

public class StudentResult {
	private Student student;
	//Constructors
	public StudentResult() {
		this.student=null;
	}
	public StudentResult(Student student) {
		this.student=student;
	}
	public StudentResult(StudentResult studentResult) {
		this.student=studentResult.student;
	}
	//Setters
	public void setStudent(Student student) {
		this.student=student;
	}
	//Getters
	public Student getStudent() {
		return this.student;
	}
	
	//Add methods
	//to calculate total
	public void calculateTotal() {
		int sub1=this.student.getPop();
		int sub2=this.student.getDcn();
		int total = sub1+sub2;
		this.student.setTotal(total);
	}
	
	//to calculate average
	public void calculateAverage() {
		int sub1=this.student.getPop();
		int sub2=this.student.getDcn();
		int total = sub1+sub2;
		int average = total/2;
		this.student.setAverage(average);
	}
	
	//to calculate result
	public void calculateResult() {
		int sub1=this.student.getPop();
		int sub2=this.student.getDcn();
		String result="FAIL";
		if((sub1>=Global.PM) && (sub2>=Global.PM))
			result="PASS";
		this.student.setResult(result);
	}
}





