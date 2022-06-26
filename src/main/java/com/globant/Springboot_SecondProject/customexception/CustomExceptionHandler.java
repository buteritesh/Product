package com.globant.Springboot_SecondProject.customexception;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.globant.Springboot_SecondProject.customexception.ErrorDetails;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value=ProductNotFoundException.class)
	public ResponseEntity<ErrorDetails> ProductAlreadyExistException(ProductAlreadyExistException exception){
		 ErrorDetails details = new ErrorDetails(exception.getMessage(),"Product Alreday exist for this Id: ", new Date());
			
		   return new ResponseEntity<ErrorDetails>(details,HttpStatus.NOT_FOUND);
		
		
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> validationExceptionHandler(MethodArgumentNotValidException notValidException)
	{
		
		ErrorDetails errorDetails=new ErrorDetails(notValidException.getBindingResult().getFieldError().getDefaultMessage(),
				notValidException.getMessage(), new Date());
		
		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.BAD_REQUEST);
		
	}
}
	
	
	


