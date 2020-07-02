package com.nayaz.restwebservices.restfulwebservices.jwt.resources;
public class AuthenticationException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2548437954305007390L;

	public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}

