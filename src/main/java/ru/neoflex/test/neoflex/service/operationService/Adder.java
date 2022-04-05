package ru.neoflex.test.neoflex.service.operationService;


public class Adder implements AbsOperationService{

    @Override
    public double get(double first, double second){
        return first+second;
    }
}
