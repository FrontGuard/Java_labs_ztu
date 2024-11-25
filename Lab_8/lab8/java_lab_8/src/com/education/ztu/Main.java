package com.education.ztu;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Завдання 2 ===");
        LambdaExamples.runPrintableExample();

        System.out.println("\n=== Завдання 3 ===");
        LambdaExamples.runBuiltInFunctionalInterfacesExamples();

        System.out.println("\n=== Завдання 4 ===");
        StreamAPIExamples.runStreamAPIExamples();

        System.out.println("\n=== Завдання 5 ===");
        MethodReferences.runMethodReferenceExamples();

        System.out.println("\n=== Завдання 6 ===");
        int[] numbers = {5, 12, 9, 23, 7}; // Зразок даних
        OptionalExamples.findMaxValue(numbers);

        int[] emptyArray = {}; // Порожній масив
        OptionalExamples.findMaxValue(emptyArray);
    }
}
