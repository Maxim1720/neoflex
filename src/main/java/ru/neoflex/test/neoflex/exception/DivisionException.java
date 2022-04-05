package ru.neoflex.test.neoflex.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DivisionException extends RuntimeException{

    public DivisionException(String message)
    {
        super(message);
    }
}
