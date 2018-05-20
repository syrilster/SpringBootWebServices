package com.springboot.rest.webservice.restfulwebservices.exception;

import com.springboot.rest.webservice.restfulwebservices.user.UserNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

/**
 * Created by Syril on 19-05-2018.
 */

/**
 * This is a way to create common Exception handling across all controllers.
 * Here @RestControllerAdvice = @RestController + @ControllerAdvice
 */
@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
        ExceptionResource exceptionResource = new ExceptionResource(new Date(), ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(exceptionResource, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<Object> handleAUserNotFoundExceptionExceptions(Exception ex, WebRequest request) throws Exception {
        ExceptionResource exceptionResource = new ExceptionResource(new Date(), ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(exceptionResource, HttpStatus.NOT_FOUND);
    }

    //To take care of validation message
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ExceptionResource exceptionResource = new ExceptionResource(new Date(), "Validation Failed",
                ex.getBindingResult().getFieldError().toString());
        return new ResponseEntity<>(exceptionResource, HttpStatus.BAD_REQUEST);
    }
}
