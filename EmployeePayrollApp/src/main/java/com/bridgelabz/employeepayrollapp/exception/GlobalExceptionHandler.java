package com.bridgelabz.employeepayrollapp.exception;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

      @ExceptionHandler(EmployeeNotFoundException.class)
      public ResponseEntity<Object> handleEmployeeNotFoundException(EmployeeNotFoundException ex){
          Map<String, Object> response = new HashMap<>();
          response.put("timestamp", LocalDateTime.now());
          response.put("message", ex.getMessage());
          response.put("status", HttpStatus.NOT_FOUND.value());

          return  new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
      }

}