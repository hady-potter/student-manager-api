package com.potter.studentmanager.exception;

import lombok.Getter;

@Getter
public class StudentNotFoundException extends RuntimeException {

	private final int code = 1001;
	private final String message = "Student Not Found";
}
