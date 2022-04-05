package ru.neoflex.test.neoflex.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class IllegalOperationName extends RuntimeException{

    public IllegalOperationName(String message){
        super(message);
    }

}
