package com.casseStudynotepad.notepadCrud.CustomizedResponseEntityExceptionHandler;

import java.sql.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.caseStudyNotepad.notepadCrud.errorDetails.ErrorDetails;

@ControllerAdvice
@RestController
public class CustomizedResponseEnitityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	  public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
	    ErrorDetails errorDetails = new ErrorDetails(new Date(0), ex.getMessage(),
	        request.getDescription(false));
	    return new ResponseEntity(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	  @ExceptionHandler(NoteNotFoundException.class)
	  public final ResponseEntity<Object> handleNoteNotFoundException(NoteNotFoundException ex, WebRequest request) {
	    ErrorDetails errorDetails = new ErrorDetails(new Date(0), ex.getMessage(),
	        request.getDescription(false));
	    return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
	  }
	  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
	      HttpHeaders headers, HttpStatus status, WebRequest request) {
	    ErrorDetails errorDetails = new ErrorDetails(new Date(0), "Validation Failed",
	        ex.getBindingResult().toString());
	    return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);
	  } 
}
