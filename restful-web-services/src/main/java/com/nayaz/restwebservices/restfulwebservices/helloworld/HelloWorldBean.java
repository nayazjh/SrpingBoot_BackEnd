package com.nayaz.restwebservices.restfulwebservices.helloworld;

public class HelloWorldBean {
	
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	public HelloWorldBean(String message) {
		this.message = message;
	}
	

}
