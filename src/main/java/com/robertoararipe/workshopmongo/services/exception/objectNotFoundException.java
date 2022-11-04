package com.robertoararipe.workshopmongo.services.exception;

public class objectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public objectNotFoundException(String msg) {
		super(msg);
	}

}
