package com.education.ztu;

import java.util.Arrays;

public class Operation {

    // Метод для додавання
    public static int addition(int... numbers) {
        return Arrays.stream(numbers).sum();
    }

    // Метод для віднімання
    public static int subtraction(int... numbers) {
        if (numbers.length == 0) return 0;
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    // Метод для множення
    public static int multiplication(int... numbers) {
        if (numbers.length == 0) return 1;
        return Arrays.stream(numbers).reduce(1, (a, b) -> a * b);
    }

    // Метод для ділення
    public static double division(double... numbers) {
        if (numbers.length == 0) return 1;
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                result /= numbers[i];
            } else {
                throw new IllegalArgumentException("Division by zero is not allowed.");
            }
        }
        return result;
    }

    // Метод для обчислення середнього значення
    public static double average(int... numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }

    // Метод для пошуку максимального значення
    public static int maximum(int... numbers) {
        return Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
    }

    // Метод для пошуку мінімального значення
    public static int minimum(int... numbers) {
        return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
    }
}
