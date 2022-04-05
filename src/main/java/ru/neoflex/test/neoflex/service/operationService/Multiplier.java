package ru.neoflex.test.neoflex.service.operationService;

public class Multiplier implements AbsOperationService{
    @Override
    public double get(double firstNum, double secondNum) {
        return firstNum*secondNum;
    }
}
