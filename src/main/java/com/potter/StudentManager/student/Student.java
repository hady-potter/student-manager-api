package com.potter.studentmanager.student;

public record Student(
	String id,
	String name,
	String email,
	String password,
	String gender
) {}
