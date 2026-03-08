package com.potter.studentmanager.exception;

import java.time.LocalDateTime;

public record StudentNotFoundResponse(
	LocalDateTime timestamp,
	int code,
	int status,
	String message
) {}
