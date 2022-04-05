package ru.neoflex.test.neoflex.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {


    @ExceptionHandler(value = IllegalOperationName.class)
    public ResponseEntity<Map<String,Object>> UnknownOperationNameHandler(IllegalOperationName e){
        return handler(e,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = DivisionException.class)
    public ResponseEntity<Map<String,Object>> DivisionExceptionHandler(DivisionException e){
        return handler(e,HttpStatus.BAD_REQUEST);
    }


    private ResponseEntity<Map<String,Object>> handler(RuntimeException e, HttpStatus status){
        Map<String,Object> body = new HashMap<>();
        body.put("message",e.getMessage());
        body.put("status code",status.value());
        return ResponseEntity.status(status).body(body);
    }







}
