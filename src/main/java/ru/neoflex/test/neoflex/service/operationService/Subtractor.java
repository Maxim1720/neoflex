package ru.neoflex.test.neoflex.service.operationService;

public class Subtractor implements AbsOperationService {

    @Override
    public double get(double firstNum, double secondNum) {
        return firstNum-secondNum;
    }
}
