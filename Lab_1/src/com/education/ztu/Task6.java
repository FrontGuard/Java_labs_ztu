package com.education.ztu;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів (n): ");
        int n = scanner.nextInt();

        int[] fibonacciArray = new int[n];

        if (n > 0) {
            fibonacciArray[0] = 1;
        }
        if (n > 1) {
            fibonacciArray[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        int[] reversedFibonacciArray = new int[n];
        for (int i = 0; i < n; i++) {
            reversedFibonacciArray[i] = fibonacciArray[n - 1 - i];
        }

        System.out.println("Послідовність Фібоначчі:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciArray[i] + " ");
        }
        System.out.println();

        System.out.println("Зворотня послідовність Фібоначчі:");
        for (int i = 0; i < n; i++) {
            System.out.print(reversedFibonacciArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
