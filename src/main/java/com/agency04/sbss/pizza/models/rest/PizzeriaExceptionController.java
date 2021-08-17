package com.agency04.sbss.pizza.models.rest;

import com.agency04.sbss.pizza.exceptions.PizzaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PizzeriaExceptionController {

    @ExceptionHandler
    public ResponseEntity<PizzaErrorResponse> handleException(PizzaException exc) {
        PizzaErrorResponse error = new PizzaErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<PizzaErrorResponse> handleException(Exception exc) {
        PizzaErrorResponse error = new PizzaErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
