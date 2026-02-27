package day24;

import java.util.List;

public interface StudentCRUD {
	void save(Student student);
	void update(Student student);
	void delete(int sid);
	Student search(int sid);
	List<Student> all();
}
