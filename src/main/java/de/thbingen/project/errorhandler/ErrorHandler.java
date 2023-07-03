package de.thbingen.project.errorhandler;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;

import javax.validation.ConstraintViolationException;

public interface ErrorHandler {
    ResponseEntity<ErrorResponse> handleMethodArgumentNotValid(MethodArgumentNotValidException ex);

    ResponseEntity<ErrorResponse> handleHttpMessageNotReadable(HttpMessageNotReadableException ex);

    ResponseEntity<ErrorResponse> handleConstraintViolation(ConstraintViolationException ex);

    ResponseEntity<ErrorResponse> handleEntityNotFoundException(EntityNotFoundException ex);

    ResponseEntity<ErrorResponse> handleInternalServerError(Exception ex);

}
