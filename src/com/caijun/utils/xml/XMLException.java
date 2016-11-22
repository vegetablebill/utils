package com.caijun.utils.xml;

public class XMLException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public XMLException(String message, Throwable cause) {
		super(message,cause);
	}
	
	public XMLException(Throwable cause) {
		super(cause);
	}

}
