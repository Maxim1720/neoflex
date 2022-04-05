package ru.neoflex.test.neoflex.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.neoflex.test.neoflex.dto.NumbersBody;
import ru.neoflex.test.neoflex.service.Calculator;
import ru.neoflex.test.neoflex.utils.Operation;

import java.util.Locale;

@RestController
public class MainController {
    private final Calculator calculator;

    @Autowired
    public MainController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<Double> getResult(@RequestParam String operation, @RequestBody NumbersBody body){
        return ResponseEntity.ok(calculator.calculate(operation,body));
    }
}
