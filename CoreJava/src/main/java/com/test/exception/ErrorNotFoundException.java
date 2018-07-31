package com.test.exception;

public class ErrorNotFoundException extends Error {

	private static final long serialVersionUID = 1L;

	public ErrorNotFoundException(String message) {
		super(message);
	}

}
