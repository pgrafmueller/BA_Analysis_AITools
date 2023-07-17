package de.thbingen.project.errorhandler.exception;

import java.io.Serial;
import java.util.List;

public class GenericValidationException extends Exception {
    @Serial
    private static final long serialVersionUID = -5719032261146450085L;

    public GenericValidationException(String message) {
        super(message);
    }
}