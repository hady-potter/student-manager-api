package com.potter.studentmanager.student;

import com.potter.studentmanager.utils.StudentFactory;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.potter.studentmanager.utils.StudentFactory.*;

@Service
@Slf4j
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{

	private final StudentRepository repository;

	@Override
	public void save(final StudentDto studentDto) {
		Student student = toStudent(studentDto);
		repository.save(student);
		log.debug("Student with id: {} added", student.getId());
	}

	@Override
	public StudentDto findById(final String studentId) {
		Student foundStudent =  repository.findById(studentId).orElseThrow();
		return toStudentDto(foundStudent);
	}

	@Override
	public StudentDto update(final String id, final StudentDto studentDto) {

		Student foundStudent = repository.findById(id).orElseThrow();

		foundStudent.setName(studentDto.name());
		foundStudent.setEmail(studentDto.email());
		foundStudent.setGender(studentDto.gender());

		repository.update(foundStudent);

		return toStudentDto(foundStudent);
	}

	@Override
	public void delete(final String studentId) {
		repository.delete(studentId).orElseThrow();
		log.debug("Student with ID: {} deleted", studentId);
	}

	@Override
	public List<StudentDto> getAll() {
		return repository.getAll()
			.stream()
			.map(StudentFactory::toStudentDto)
			.toList();
	}
}
