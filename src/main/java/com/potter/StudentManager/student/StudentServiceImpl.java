package com.potter.studentmanager.student;

import com.potter.studentmanager.utils.StudentFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.potter.studentmanager.utils.StudentFactory.*;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{

	private final StudentRepository repository;

	@Override
	public void add(StudentDto studentDto) {
		repository.add(toStudent(studentDto));
	}

	@Override
	public StudentDto findById(String studentId) {
		Student foundStudent =  repository.findById(studentId).orElseThrow();
		return toStudentDto(foundStudent);
	}

	@Override
	public StudentDto update(String id, StudentDto studentDto) {

		Student foundStudent = repository.findById(id).orElseThrow();

		foundStudent.setName(studentDto.name());
		foundStudent.setEmail(studentDto.email());
		foundStudent.setGender(studentDto.gender());

		repository.update(foundStudent);

		return toStudentDto(foundStudent);
	}

	@Override
	public void delete(String studentId) {
		repository.delete(studentId).orElseThrow();
	}

	@Override
	public List<StudentDto> getAll() {
		return repository.getAll()
			.stream()
			.map(StudentFactory::toStudentDto)
			.toList();
	}
}
