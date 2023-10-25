package cu.edu.cujae.backend.core.service;
import java.util.List;
import cu.edu.cujae.backend.core.dto.*;


public interface SubjectService {
	
	List<SubjectDTO> getSubjects();
	SubjectDTO getSubjectById(String subjectId);
	void createUser(SubjectDTO subject);
	void updateUser(SubjectDTO subject);
	void deleteUser(SubjectDTO id);
}
