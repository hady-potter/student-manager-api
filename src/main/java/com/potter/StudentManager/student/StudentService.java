package com.potter.studentmanager.student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

	List<StudentDto> getAll();
	void save(StudentDto studentDto);
	void delete(String studentId);
	StudentDto findById(String studentId);
	StudentDto update(String id, StudentDto studentDto);

}
