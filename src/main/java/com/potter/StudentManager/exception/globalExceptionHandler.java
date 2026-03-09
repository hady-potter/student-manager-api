package com.potter.studentmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class globalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleValidationException(MethodArgumentNotValidException ex) {
		ValidationExceptionResponse response = new ValidationExceptionResponse(
			LocalDateTime.now(),
			1000,
			HttpStatus.BAD_REQUEST.value(),
			ex.getBindingResult().getFieldError().getField(),
			ex.getBindingResult().getFieldError().getDefaultMessage()
		);

		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<StudentNotFoundResponse> handleStudentNotFoundException(StudentNotFoundException ex) {
		StudentNotFoundResponse response = new StudentNotFoundResponse(
			LocalDateTime.now(),
			ex.getCode(),
			HttpStatus.NOT_FOUND.value(),
			ex.getMessage()
		);
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}
}
