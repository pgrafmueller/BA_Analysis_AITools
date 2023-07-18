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

    @Override
    public ResponseEntity<Object> handleExceptionInternal(Exception ex, @Nullable Object body, HttpHeaders headers,
                                                   HttpStatus status, WebRequest request) {
        if (body == null) {
            var messages = ex.getMessage() != null ? ex.getMessage() : "";
            body = new ErrorResponse(ex.getClass().getSimpleName(), messages);
        }
        return super.handleExceptionInternal(ex, body, headers, status, request);
    }

    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, WebRequest request) {
        var messages = ex.getFieldErrors()
                .stream()
                .map(error -> error.getField() + " " + error.getDefaultMessage())
                .toList();
        messages.addAll(
                ex.getGlobalErrors().stream().map(error -> error.getObjectName() + " " + error.getDefaultMessage()).toList());
        return handleExceptionInternal(ex, new ErrorResponse(ex.getClass().getSimpleName(), messages), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @Override
    public ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, WebRequest request) {
        return handleExceptionInternal(ex, new ErrorResponse(ex.getClass().getSimpleName(), ex.getMessage()), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @Override
    public ResponseEntity<Object> handleConstraintViolation(ConstraintViolationException ex, WebRequest request) {
        var messages = ex.getConstraintViolations()
                .stream()
                .map(error -> error.getPropertyPath() + " " + error.getMessage())
                .toList();
        return handleExceptionInternal(ex, new ErrorResponse(ex.getClass().getSimpleName(), messages), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @Override
    public ResponseEntity<Object> handleEntityNotFoundException(EntityNotFoundException ex, WebRequest request) {
        return handleExceptionInternal(ex, new ErrorResponse(ex.getClass().getSimpleName(), ex.getMessage()), new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @Override
    public ResponseEntity<Object> handleInternalServerError(Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, new ErrorResponse(ex.getClass().getSimpleName(), ex.getMessage()), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
}
