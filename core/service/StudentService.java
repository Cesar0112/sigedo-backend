package cu.edu.cujae.backend.core.service;

import java.sql.SQLException;
import java.util.List;
import cu.edu.cujae.backend.core.dto.*;

public interface StudentService {

	List<StudentDto> getStudents();
	StudentDto getStudentById(String studentId);
	void createStudent(StudentDto student) throws SQLException;
	void updateStudent(StudentDto student);
	void deleteStudent(String id);

}
