package com.test.exception;

public class NameNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public NameNotFoundException(String message) {
		super(message);
	}

}
