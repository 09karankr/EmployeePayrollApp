package com.bridgelabz.employeepayrollapp.exception;


import com.bridgelabz.employeepayrollapp.DTO.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@ControllerAdvice
public class EmployeePayrollExceptionHandler {
    private static final String message = "Exception while processing REST Request";
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ResponseDTO> handleHttpMessageNoReadableException(HttpMessageNotReadableException exception){
        log.error("Invalid Date Format", exception);
        ResponseDTO responseDTO = new ResponseDTO(message
                                     , "Should have date in the format dd MMM yyyy");
        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);

    }
    // Exception handler for validation errors
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception){
        Map<String, String> errorMap = new HashMap<>();
        for (FieldError fieldError : exception.getBindingResult().getFieldErrors()){
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        log.error("Validation errors: {}", errorMap);
        ResponseDTO responseDTO = new ResponseDTO(message, errorMap);
        return  new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
    }
}
