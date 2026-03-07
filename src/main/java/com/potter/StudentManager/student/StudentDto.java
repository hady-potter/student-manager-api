package com.potter.studentmanager.student;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public record StudentDto(
	@NotEmpty(message = "Name is required")
	String name,

	@NotEmpty(message = "Email is required")
	String email,

	@NotEmpty(message = "Gender is required")
	@Pattern(
		regexp = "(?i)^(male|female)$",
		message = "Gender must be male or female"
	)
	String gender
) {}
