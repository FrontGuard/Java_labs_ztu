package com.education.ztu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task6DateTime {
    public static void executeTask() {
        // Створюємо об'єкт LocalDateTime для сьогоднішнього дня
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Виводимо всі елементи дати та часу
        System.out.println("Дата і час: " + currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("День тижня: " + currentDateTime.getDayOfWeek());
        System.out.println("День року: " + currentDateTime.getDayOfYear());
        System.out.println("Місяць: " + currentDateTime.getMonth());
        System.out.println("Рік: " + currentDateTime.getYear());
        System.out.println("Години: " + currentDateTime.getHour());
        System.out.println("Хвилини: " + currentDateTime.getMinute());
        System.out.println("Секунди: " + currentDateTime.getSecond());

        // Перевірка на високосний рік
        boolean isLeapYear = currentDateTime.toLocalDate().isLeapYear();
        System.out.println("Чи високосний рік: " + (isLeapYear ? "Так" : "Ні"));

        // Створюємо об'єкт для порівняння дат
        LocalDateTime labStartDateTime = LocalDateTime.of(2024, 11, 29, 8, 0, 0);

        // Порівнюємо дві дати
        if (currentDateTime.isAfter(labStartDateTime)) {
            System.out.println("Поточна дата після початку лабораторної.");
        } else if (currentDateTime.isBefore(labStartDateTime)) {
            System.out.println("Поточна дата до початку лабораторної.");
        } else {
            System.out.println("Поточна дата є рівною даті початку лабораторної.");
        }

        // Зміна значень елементів дати
        LocalDateTime updatedDateTime = currentDateTime.withYear(2025)
                .withMonth(12)
                .withDayOfMonth(25)
                .withHour(10)
                .withMinute(30)
                .withSecond(45);

        System.out.println("Оновлена дата і час: " + updatedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
