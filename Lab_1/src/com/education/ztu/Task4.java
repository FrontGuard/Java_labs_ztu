package com.education.ztu;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int secondNumber = scanner.nextInt();

        int gcd = findGCD(firstNumber, secondNumber);

        System.out.println("Найбільший спільний дільник: " + gcd);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
