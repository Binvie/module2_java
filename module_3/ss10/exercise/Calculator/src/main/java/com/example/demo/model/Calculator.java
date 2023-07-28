package com.example.demo.model;

public class Calculator {
    public Float calculate(int number1, int number2, char operator) {
        switch (operator) {
            case '+':
                return (float) (number1 + number2);
            case '-':
                return (float) (number1 - number2);
            case '*':
                return (float) (number1 * number2);
            case '/':
                if (number2 != 0) {
                    return (float) (number1 / number2);
                } else throw new RuntimeException("Can't divide by zero ");
            default:
                throw new RuntimeException("invalid");
        }
    }
}
