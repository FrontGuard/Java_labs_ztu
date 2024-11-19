package com.education.ztu.tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    private static final String DIRECTORY = "directory_for_files/";
    private static final String REPORT_FILE = DIRECTORY + "purchase_report.txt";

    // Метод для запису звіту про покупки у файл
    public static void writeReportToFile(List<String> purchases) {
        File directory = new File(DIRECTORY);

        // Перевіряємо, чи існує папка directory_for_files, і створюємо, якщо ні
        if (!directory.exists()) {
            directory.mkdirs();
        }

        try (FileWriter writer = new FileWriter(REPORT_FILE, false)) {
            for (String purchase : purchases) {
                writer.write(purchase + "\n");
            }
            System.out.println("Report written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Метод для читання звіту з файлу та виведення в консоль
    public static void readReportFromFile() {
        try (FileReader reader = new FileReader(REPORT_FILE);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            System.out.println("Reading purchase report from file:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Report file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    // Метод для тестування функціоналу
    public static void run() {
        // Список покупок
        List<String> purchases = new ArrayList<>();
        purchases.add("1. Apple - $1.50");
        purchases.add("2. Bread - $2.00");
        purchases.add("3. Milk - $1.20");

        // Записуємо звіт у файл
        writeReportToFile(purchases);

        // Читаємо звіт з файлу
        readReportFromFile();
    }
}
