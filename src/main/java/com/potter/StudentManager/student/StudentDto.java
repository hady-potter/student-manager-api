package com.potter.studentmanager.student;

import jakarta.validation.constraints.*;

public record StudentDto(
	@NotEmpty(message = "Name is required")
	@Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
	String name,

	@NotEmpty(message = "Email is required")
	@Email(message = "Invalid email")
	String email,

	@NotEmpty(message = "Gender is required")
	@Pattern(
		regexp = "(?i)^(male|female)$",
		message = "Gender must be male or female"
	)
	String gender
) {}
