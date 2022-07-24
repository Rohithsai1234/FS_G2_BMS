package com.obsm.main.exception;

public class UserNotFound extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFound(String error){
        super(error);
    }
}
