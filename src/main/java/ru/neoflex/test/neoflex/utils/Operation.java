package ru.neoflex.test.neoflex.utils;

public enum Operation {

    ADD("add"),
    SUBTRACT("subtract"),
    MULTIPLICATION("multiplication"),
    DIVISION("division");

    final String title;
    Operation(String title){
        this.title = title;
    }

}
