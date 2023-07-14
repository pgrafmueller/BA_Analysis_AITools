package de.thbingen.project.errorhandler.impl;

import de.thbingen.project.errorhandler.ErrorHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorHandlerImpl extends ResponseEntityExceptionHandler implements ErrorHandler {
}
