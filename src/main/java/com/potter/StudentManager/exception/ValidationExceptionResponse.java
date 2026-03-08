package com.potter.studentmanager.exception;

import java.time.LocalDateTime;

public record ValidationExceptionResponse(
	LocalDateTime timestamp,
	int code,
	int status,
	String field,
	String message
) {}
