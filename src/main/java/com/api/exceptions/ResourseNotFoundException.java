package com.api.exceptions;

public class ResourseNotFoundException extends RuntimeException{
	
	public ResourseNotFoundException() {
		super("Resource Not found on server !!!");
	}
	
	public ResourseNotFoundException(String message) {
		super(message);
	}

}
