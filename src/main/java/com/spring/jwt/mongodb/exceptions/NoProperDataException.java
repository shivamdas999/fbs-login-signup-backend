package com.spring.jwt.mongodb.exceptions;

@SuppressWarnings("serial")
public class NoProperDataException extends Exception {
	
	public NoProperDataException(String ss)
	{
		super(ss);
	}

}
