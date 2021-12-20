package com.dbs.thread;

public class CustomExceptionExample extends Exception {
	private static final long serialVersionUID = -7738490756768029592L;
	private String error_code = "500";

	CustomExceptionExample(String message, String errorCode) {
		super(message);
		this.error_code = errorCode;
	}

	public String getErrorCode() {
		return this.error_code;
	}

}
