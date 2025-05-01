package com.Billing.Billing.service;

public class ResourceAlreadyExistException extends RuntimeException {
	public ResourceAlreadyExistException(String msg) {
		super(msg);
	}

}
