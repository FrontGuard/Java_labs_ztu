package com.education.ztu;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Task5TreeSetDemo {
    public static void executeTask() {
        // Створення TreeSet з використанням компаратора за ціною
        NavigableSet<Product> productSet = new TreeSet<>((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        // Додавання продуктів до множини
        productSet.add(new Product(1, "Джинси", 1500.78, "Одяг"));
        productSet.add(new Product(2, "Сорочка", 500.99, "Одяг"));
        productSet.add(new Product(3, "Кросівки", 1200.50, "Взуття"));
        productSet.add(new Product(4, "Телефон", 22000.45, "Техніка"));
        productSet.add(new Product(5, "Ноутбук", 30000.99, "Техніка"));

        System.out.println("Множина продуктів у порядку зростання ціни:");
        printSet(productSet);

        // Отримання першого та останнього елементів
        System.out.println("\nПерший продукт: " + productSet.first());
        System.out.println("Останній продукт: " + productSet.last());

        // Робота з підмножинами
        System.out.println("\nПродукти дешевші за 2000.00:");
        printSet(productSet.headSet(new Product(0, "", 2000.00, ""), true));

        System.out.println("\nПродукти між 1000.00 і 25000.00:");
        printSet(productSet.subSet(new Product(0, "", 1000.00, ""), true,
                new Product(0, "", 25000.00, ""), false));

        // Операції з пошуком елементів
        System.out.println("\nПродукт з ціною не меншою за 1200.50: " + productSet.ceiling(new Product(0, "", 1200.50, "")));
        System.out.println("Продукт з ціною меншою за 500.99: " + productSet.lower(new Product(0, "", 500.99, "")));

        // Видалення першого та останнього елементів
        System.out.println("\nВидалено перший продукт: " + productSet.pollFirst());
        System.out.println("Видалено останній продукт: " + productSet.pollLast());

        System.out.println("\nМножина продуктів після видалення:");
        printSet(productSet);

        // Обернений порядок множини
        System.out.println("\nМножина продуктів у зворотному порядку:");
        printSet(productSet.descendingSet());
    }

    // Допоміжний метод для виводу множини
    private static void printSet(NavigableSet<Product> productSet) {
        for (Product product : productSet) {
            System.out.println(product);
        }
    }
}
