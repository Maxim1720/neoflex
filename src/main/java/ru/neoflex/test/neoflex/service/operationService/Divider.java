package ru.neoflex.test.neoflex.service.operationService;

import ru.neoflex.test.neoflex.exception.DivisionException;

public class Divider implements AbsOperationService{


    @Override
    public double get(double firstNum, double secondNum) {
        checker(firstNum,secondNum);
        return firstNum/secondNum;
    }

    private void checker(double first, double second){
        if(Double.isNaN(first / second) || Double.isInfinite(first/second)) {
            throw new DivisionException("division of '" +first+"' and '"+second+"' is prohibited");
        }
    }
}
