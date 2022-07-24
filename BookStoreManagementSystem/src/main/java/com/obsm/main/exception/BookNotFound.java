package com.obsm.main.exception;

public class BookNotFound extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookNotFound(String error){
        super(error);
    }
}
