package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

	// We need a list to get all students.
	List<Student> getAllStudents();
	
		Student saveStudent(Student student);

		Student getStudentById(Long id);

		Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

}
