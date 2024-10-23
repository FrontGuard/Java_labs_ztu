package com.education.ztu;

public class Main2 {

    public static void main(String[] args) {
        // Демонстрація роботи методів класу Operation
        int[] numbers = {10, 20, 5, 15};

        System.out.println("Addition: " + Operation.addition(numbers));
        System.out.println("Subtraction: " + Operation.subtraction(numbers));
        System.out.println("Multiplication: " + Operation.multiplication(numbers));
        System.out.println("Division: " + Operation.division(100.0, 5.0, 2.0));
        System.out.println("Average: " + Operation.average(numbers));
        System.out.println("Maximum: " + Operation.maximum(numbers));
        System.out.println("Minimum: " + Operation.minimum(numbers));

        // Виведення всіх значень enum Location
        System.out.println("All locations:");
        for (Location location : Location.values()) {
            System.out.println(location);
        }
    }
}
