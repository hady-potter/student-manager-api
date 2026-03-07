package com.potter.studentmanager.student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
	void save(final Student student);
	Optional<Student> findById(final String studentId);
	void update(final Student student);
	Optional<Student> delete(final String studentId);
	List<Student> getAll();
}
