package com.education.ztu;

public class Task2StringMethods {
    public static void runTask() {
        // Рядок для роботи
        String str = "I learn Java!!!";

        // 1. Роздрукувати останній символ рядка
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Останній символ рядка: " + lastChar);

        // 2. Перевірити, чи закінчується рядок "!!!"
        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Чи закінчується рядок на \"!!!\": " + endsWithExclamation);

        // 3. Перевірити, чи починається рядок "I learn "
        boolean startsWithILearn = str.startsWith("I learn ");
        System.out.println("Чи починається рядок на \"I learn \": " + startsWithILearn);

        // 4. Перевірити, чи містить рядок підрядок "Java"
        boolean containsJava = str.contains("Java");
        System.out.println("Чи містить рядок підрядок \"Java\": " + containsJava);

        // 5. Знайти позицію підрядка "Java"
        int javaIndex = str.indexOf("Java");
        System.out.println("Позиція підрядка \"Java\": " + javaIndex);

        // 6. Замінити всі символи 'a' на 'o'
        String replacedString = str.replace('a', 'o');
        System.out.println("Рядок після заміни 'a' на 'o': " + replacedString);

        // 7. Перетворити рядок на верхній регістр
        String upperCaseString = str.toUpperCase();
        System.out.println("Рядок у верхньому регістрі: " + upperCaseString);

        // 8. Перетворити рядок на нижній регістр
        String lowerCaseString = str.toLowerCase();
        System.out.println("Рядок у нижньому регістрі: " + lowerCaseString);

        // 9. Вирізати підрядок "Java"
        String substring = str.substring(javaIndex, javaIndex + "Java".length());
        System.out.println("Вирізаний підрядок \"Java\": " + substring);
    }
}
