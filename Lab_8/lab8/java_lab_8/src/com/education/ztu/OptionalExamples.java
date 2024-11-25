package com.education.ztu;

import java.util.Optional;

public class OptionalExamples {
    public static void findMaxValue(int[] numbers) {
        // Використання Optional для знаходження максимального значення
        Optional<Integer> maxValue = numbers != null && numbers.length > 0
                ? Optional.of(findMax(numbers))
                : Optional.empty();

        // Використання методу orElse для повернення повідомлення, якщо значення відсутнє
        String result = maxValue.map(String::valueOf).orElse("Числа відсутні");

        // Виведення результату
        System.out.println("Максимальне значення: " + result);
    }

    private static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
