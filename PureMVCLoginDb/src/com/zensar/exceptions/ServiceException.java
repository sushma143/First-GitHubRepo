package com.zensar.exceptions;

public class ServiceException extends Exception {
	
	private String errorMessage;
	
	public ServiceException() {
		
	}

	public ServiceException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ServiceException [errorMessage=" + errorMessage + "]";
	}
	
	

}
