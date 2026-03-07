package com.potter.studentmanager.utils;

import com.potter.studentmanager.student.Student;
import com.potter.studentmanager.student.StudentDto;
import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public class StudentFactory {

	public static Student toStudent(StudentDto studentDto) {
		return new Student(
			UUID.randomUUID().toString(),
			studentDto.name(),
			studentDto.email(),
			studentDto.gender()
		);
	}

	public static StudentDto toStudentDto(Student student) {
		return new StudentDto(
			student.getName(),
			student.getEmail(),
			student.getGender()
		);
	}
}
