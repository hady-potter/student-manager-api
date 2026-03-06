package com.potter.studentmanager.student;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.NonNull;

public record Student(
	@NonNull
	String id,

	@NonNull
	String name,

	@NotEmpty(message = "Email is missing")
	@Email(message = "Invalid Email")
	String email,

	@NotBlank(message = "Password is required")
	@Pattern(
		regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,20}$",
		message = "Password must be 8-20 chars, include upper, lower, number and special character"
	)
	String password,

	@Pattern(
		regexp = "(?i)^(male|female)$",
		message = "Gender must be male or female"
	)
	String gender
) {}
