package com.spring.jwt.mongodb.exceptions;

@SuppressWarnings("serial")
public class OrderNotFoundException extends Exception {

	public OrderNotFoundException(String msg) {
		super(msg);
		
	}

}
