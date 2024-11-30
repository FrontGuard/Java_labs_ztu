package com.education.ztu;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Лабораторна робота №4 ===");

        System.out.println("\nЗапуск Завдання 2:");
        Task2StringMethods.runTask();

        System.out.println("\nЗапуск Завдання 3:");
        Task3StringBuilder.executeTask();

        System.out.println("\nЗапуск Завдання 4:");
        Task4Formatter.executeTask();

        System.out.println("\nЗапуск Завдання 5:");
        System.out.println("\n--- Українська ---");
        Task5Localization.executeTask(new Locale("uk", "UA"));

        System.out.println("\n--- English ---");
        Task5Localization.executeTask(new Locale("en", "US"));

        System.out.println("\n--- Français ---");
        Task5Localization.executeTask(new Locale("fr", "FR"));

        System.out.println("\nЗапуск Завдання 6:");
        Task6DateTime.executeTask();
    }
}
