package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return x / y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        System.out.println(result);
        int resultMinus = minus(2);
        System.out.println(resultMinus);
        int resultDivide = calculator.divide(1);
        System.out.println(resultDivide);
        int resultMultiply = calculator.multiply(2);
        System.out.println(resultMultiply);
        int resultSumAll = calculator.sumAllOperation(2);
        System.out.println(resultSumAll);
    }
}