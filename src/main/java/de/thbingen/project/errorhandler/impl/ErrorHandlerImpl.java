package de.thbingen.project.errorhandler.impl;

import de.thbingen.project.errorhandler.ErrorHandler;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public abstract class ErrorHandlerImpl extends ResponseEntityExceptionHandler implements ErrorHandler {


    //create a list of strings with the error messages from the exception
    //wrap the list in a map with the key "messages"
    //call the handleExceptionInternal method to handle the exception
    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getBindingResult().getAllErrors(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }


}
