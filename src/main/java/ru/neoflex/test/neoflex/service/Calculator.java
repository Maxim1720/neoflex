package ru.neoflex.test.neoflex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neoflex.test.neoflex.dto.NumbersBody;
import ru.neoflex.test.neoflex.exception.IllegalOperationName;
import ru.neoflex.test.neoflex.service.operationService.*;
import ru.neoflex.test.neoflex.utils.Operation;

import java.util.Locale;

@Service
public class Calculator {

    private AbsOperationService operationService;
    private Operation operation;

    public Double calculate(String operation, NumbersBody body){
        initOperation(operation);
        initOperationService(operation);
        return operationService.get(body.getFirstNum(),body.getSecondNum());
    }

    private void initOperationService(String operation){
        switch (this.operation){
            case ADD:
                operationService = new Adder();
                break;
            case DIVISION:
                operationService = new Divider();
                break;
            case SUBTRACT:
                operationService = new Subtractor();
                break;
            case MULTIPLICATION:
                operationService = new Multiplier();
                break;
            default:
                operationService = null;
        }
    }

    private void initOperation(String operation){
        try {
            this.operation = Operation.valueOf(operation.toUpperCase(Locale.ROOT));
        }
        catch (IllegalArgumentException e)
        {
            throw new IllegalOperationName("Incorrect operation name '" + operation + "'");
        }
    }

}
