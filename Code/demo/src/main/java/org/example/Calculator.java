package org.example;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("Division by zero is not allowed.");
        }
        return a / b;
    }
}