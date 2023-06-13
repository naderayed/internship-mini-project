package com.example.internship_mini_project.configurations;


import com.example.internship_mini_project.entities.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalApplicationExceptionHandler {

    //TODO implement custom handling behaviour for each exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> globalExceptionHandler(Exception e, HttpServletRequest  request){
        var res= new ExceptionResponse(
                request.getRequestURI(),
                e.getMessage(),
                HttpStatus.NOT_ACCEPTABLE.value(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(res,HttpStatus.NOT_ACCEPTABLE);
    }
}
