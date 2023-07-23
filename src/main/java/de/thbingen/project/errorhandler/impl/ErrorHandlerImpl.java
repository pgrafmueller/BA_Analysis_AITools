package de.thbingen.project.errorhandler.impl;

import de.thbingen.project.errorhandler.ErrorHandler;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class ErrorHandlerImpl extends ResponseEntityExceptionHandler implements ErrorHandler {

    //if the body is null it will be filled with the exception type and the message
    //call the super method to handle the exception
    @Override
    public ResponseEntity<Object> handleExceptionInternal(Exception ex, @Nullable Object body, HttpHeaders headers,
                                                   HttpStatus status, WebRequest request) {
        return super.handleExceptionInternal(ex, body, headers, status, request);
    }

    //create a list of strings with the error messages from the exception
    //wrap the list in a map with the key "messages"
    //call the handleExceptionInternal method to handle the exception
    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, WebRequest request) {
        return super.handleExceptionInternal(ex, ex.getBindingResult().getFieldErrors(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

}
