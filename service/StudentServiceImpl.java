package cu.edu.cujae.backend.service;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import cu.edu.cujae.backend.core.dto.*;
import cu.edu.cujae.backend.core.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private MunicipalityService municipalityService;
	
	@Autowired
	private GroupService groupService;
	
	@Override
	public List<StudentDto> getStudents() {
		List<StudentDto> students = new ArrayList<>();
		List<MunicipalityDto> municipalities =  municipalityService.getMunicipalities();
		List<GroupDto> groups = groupService.getGroups();
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Juana",
				"De Arco", "Femenino", municipalities.get(1),groups.get(1), false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Alberto",
				"Fernandez", "Masculino", municipalities.get(2), groups.get(2), false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Perseo",
				"Suarez Tamayo", "Masculino", municipalities.get(3), groups.get(3), false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Sandor",
				"Camejo Rayas", "Masculino", municipalities.get(4), groups.get(4), false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Ronaldo",
				"Coas Saldivar", "Masculino", municipalities.get(0), groups.get(0), false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Hector",
				"Ribas Traki", "Masculino", municipalities.get(3), groups.get(3), false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Camilo",
				"Estrada Lopez", "Masculino", municipalities.get(1), groups.get(1), false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Facundo",
				"Romero Ramen", "Masculino", municipalities.get(2),groups.get(2), false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Pánfilo",
				"Tobal Madrid", "Masculino", municipalities.get(4), groups.get(4), false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Ian",
				"Meriño Sandival", "Masculino", municipalities.get(4), groups.get(4), false));

		return students;
	}

	@Override
	public StudentDto getStudentById(String studentId) {
		return getStudents().stream().filter(r -> r.getId().equals(studentId)).findFirst().get();
	}

	@Override
	public void createStudent(StudentDto student) throws SQLException {
		CallableStatement CS = jdbcTemplate.getDataSource().getConnection()
				.prepareCall("{call insert_student(?, ?, ?, ?, ?)}");
		
		boolean isMan =true;
		if(student.getSex().equals("Femenino")) {
			isMan = false;
		}
		
		
		CS.setString(1, student.getName());
		CS.setString(2, student.getSurname());
		CS.setBoolean(3, isMan);
		CS.setInt("municipality", student.getMunicipality().getId());
		CS.setInt("id_group", student.getGroup().getId());

		CS.executeUpdate();

	}

	@Override
	public void updateStudent(StudentDto student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(String id) {
		// TODO Auto-generated method stub

	}

}
