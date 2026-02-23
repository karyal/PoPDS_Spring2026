package day22;

import java.util.List;

public interface StudentCRUD {
	void save(Student student);
	Student search(int sid);
	List<Student> all();
}
