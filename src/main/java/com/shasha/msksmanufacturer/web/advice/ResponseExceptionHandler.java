package com.shasha.msksmanufacturer.web.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

/**
 * Created by kobis on 27 May, 2020
 */
@ControllerAdvice
@RestController
public class ResponseExceptionHandler {

    @ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public final ErrorDetails handleUserNotFoundException(NumberFormatException ex, WebRequest request) {
        ErrorDetails err = new ErrorDetails();
        err.setCode(HttpStatus.BAD_REQUEST.value());
        err.setMessage("Wrong Number Value!!!!!!!!!");
        //   err.setValue();
        err.setValue(request.getParameter("value"));
        return err;
    }


}
