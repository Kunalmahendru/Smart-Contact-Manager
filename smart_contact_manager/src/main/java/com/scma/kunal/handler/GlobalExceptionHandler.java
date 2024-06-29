package com.scma.kunal.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.scma.kunal.exception.ImageNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
		
	@ExceptionHandler(ImageNotFoundException.class)
	public String hadleImageNotFoundException(ImageNotFoundException infe) {
		return infe.getMessage();
	}
}
