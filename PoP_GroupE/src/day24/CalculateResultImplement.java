package day24;

public class CalculateResultImplement implements CalculateResult{
	private Student student;
	
	public CalculateResultImplement(Student student) {
		this.student=student;
	}
	@Override
	public void calculateTotal() {
		student.setTotal(student.getPop()+student.getDb()+student.getCn());
	}

	@Override
	public void calculateAverage() {
		student.setAverage((student.getPop()+student.getDb()+student.getCn())/3);
	}

	@Override
	public void calculateResult() {
		if((student.getPop()>=40) && (student.getCn()>=40) && (student.getDb()>=40))
			student.setResult("PASS");
		else
			student.setResult("FAIL");
	}
}
