package com.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.api.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourseNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourseNotFoundException(ResourseNotFoundException ex) {

		ApiResponse apr = new ApiResponse();
		apr.setMessage(ex.getMessage());
		apr.setSuccess(true);
		apr.setStatus(HttpStatus.NOT_FOUND);
		return new ResponseEntity<ApiResponse>(apr, HttpStatus.NOT_FOUND);

	}
}
