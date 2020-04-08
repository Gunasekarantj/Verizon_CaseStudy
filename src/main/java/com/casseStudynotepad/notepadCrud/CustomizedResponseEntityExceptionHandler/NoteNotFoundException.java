package com.casseStudynotepad.notepadCrud.CustomizedResponseEntityExceptionHandler;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoteNotFoundException extends RuntimeException{
	public NoteNotFoundException(String exception) {
	    super(exception);
	  }
}
