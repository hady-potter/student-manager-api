package com.potter.studentmanager.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
@AllArgsConstructor
public class StudentRepositoryImpl implements StudentRepository{

	private final Map<String, Student> students;

	@Override
	public void add(final Student student) {
		students.put(student.getId(), student);
	}

	@Override
	public Optional<Student> findById(final String studentId) {
		return Optional.of(students.get(studentId));
	}

	@Override
	public void update(final Student student) {
		students.put(student.getId(), student);
	}

	@Override
	public Optional<Student> delete(String studentId) {
		return Optional.of(students.remove(studentId));
	}

	@Override
	public List<Student> getAll() {
		return students.values().stream().toList();
	}
}
