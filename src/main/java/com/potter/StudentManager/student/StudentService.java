package com.potter.studentmanager.student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

	void save(StudentDto studentDto);
	StudentDto findById(String studentId);
	StudentDto update(String id, StudentDto studentDto);
	void delete(String studentId);
	List<StudentDto> getAll();

}
