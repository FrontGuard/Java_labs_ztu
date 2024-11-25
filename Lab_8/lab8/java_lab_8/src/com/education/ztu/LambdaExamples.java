package com.education.ztu;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExamples {

    // Метод для Завдання 2
    public static void runPrintableExample() {
        Printable printable = () -> System.out.println("Це реалізація методу print() через лямбда-вираз.");
        printable.print();
    }

    // Метод для Завдання 3
    public static void runBuiltInFunctionalInterfacesExamples() {
        // --- 3a: Predicate ---
        Predicate<String> isNumeric = str -> {
            try {
                Double.parseDouble(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        };

        String testString1 = "123.45";
        String testString2 = "Hello";
        System.out.println("Is \"" + testString1 + "\" numeric? " + isNumeric.test(testString1));
        System.out.println("Is \"" + testString2 + "\" numeric? " + isNumeric.test(testString2));

        // --- 3b: Consumer ---
        Consumer<String> startLecture = text -> System.out.println("Пара почалася о 8:30");
        Consumer<String> endLecture = text -> System.out.println("Пара закінчилася о 9:50");
        Consumer<String> lectureInfo = startLecture.andThen(endLecture);
        lectureInfo.accept("Лекція");

        // --- 3c: Supplier ---
        Supplier<String> uppercaseSentence = () -> "Hello, how are you?".toUpperCase();
        System.out.println("Uppercase sentence: " + uppercaseSentence.get());

        // --- 3d: Function ---
        Function<String, Integer> multiplyNumbers = str -> {
            String[] numbers = str.split(" ");
            int product = 1;
            for (String number : numbers) {
                product *= Integer.parseInt(number);
            }
            return product;
        };

        String numbersInput = "2 3 4";
        System.out.println("Product of numbers \"" + numbersInput + "\": " + multiplyNumbers.apply(numbersInput));
    }
}
