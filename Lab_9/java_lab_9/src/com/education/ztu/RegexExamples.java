package com.education.ztu;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    public static void runRegexExamples() {
        String text = """
                1. Іванов Іван Іванович, 30 років, Програміст, досвід 5 років, Київ, ivanov@gmail.com, +380501234567, 15.03.1993
                2. Петренко Петро Петрович, 45 років, Аналітик, досвід 20 років, Львів, petro.petrenko@example.com, +380631112233, 07.11.1978
                3. Сидоренко Сидір Сидорович, 25 років, Дизайнер, досвід 3 роки, Одеса, sidorenko@design.org, +380972345678, 22.08.1998
                4. Коваленко Ольга Михайлівна, 35 років, Менеджер, досвід 10 років, Харків, olga.kovalenko@mail.ua, +380662223344, 05.12.1987
                5. Тарасенко Ганна Сергіївна, 29 років, Тестувальник, досвід 4 роки, Дніпро, tarasenko@gmail.com, +380503334455, 19.02.1994
                """;

        // 1. Знаходимо всі номери телефонів
        System.out.println("=== Знайдені номери телефонів ===");
        Pattern phonePattern = Pattern.compile("\\+380\\d{9}");
        Matcher phoneMatcher = phonePattern.matcher(text);
        while (phoneMatcher.find()) {
            System.out.println(phoneMatcher.group());
        }

        // 2. Знаходимо всі емейли
        System.out.println("\n=== Знайдені емейли ===");
        Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b");
        Matcher emailMatcher = emailPattern.matcher(text);
        while (emailMatcher.find()) {
            System.out.println(emailMatcher.group());
        }

        // 3. Змінюємо формат дати народження
        System.out.println("\n=== Змінені дати народження ===");
        Pattern datePattern = Pattern.compile("\\b(\\d{2})\\.(\\d{2})\\.(\\d{4})\\b");
        Matcher dateMatcher = datePattern.matcher(text);
        String updatedText = dateMatcher.replaceAll("$3-$2-$1");
        System.out.println(updatedText);

        // 4. Змінюємо посади кільком співробітникам
        System.out.println("\n=== Оновлені посади ===");
        String positionUpdates = text.replaceAll("Програміст", "Архітектор програмного забезпечення")
                .replaceAll("Аналітик", "Старший аналітик")
                .replaceAll("Дизайнер", "UX/UI Дизайнер");
        System.out.println(positionUpdates);
    }
}
