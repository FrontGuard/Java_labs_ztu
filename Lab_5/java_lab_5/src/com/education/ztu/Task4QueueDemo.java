package com.education.ztu;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task4QueueDemo {
    public static void executeTask() {
        // Створюємо чергу
        Deque<Product> productQueue = new ArrayDeque<>();

        // Додавання елементів у чергу
        productQueue.push(new Product(1, "Джинси", 1500.78, "Одяг"));
        productQueue.offerLast(new Product(2, "Сорочка", 500.99, "Одяг"));
        productQueue.offerLast(new Product(3, "Кросівки", 1200.50, "Взуття"));
        productQueue.push(new Product(4, "Телефон", 22000.45, "Техніка"));

        System.out.println("Черга після додавання продуктів:");
        printQueue(productQueue);

        // Отримання першого та останнього елементів без видалення
        Product firstProduct = productQueue.getFirst();
        Product lastProduct = productQueue.peekLast();
        System.out.println("\nПерший продукт у черзі: " + firstProduct);
        System.out.println("Останній продукт у черзі: " + lastProduct);

        // Видалення елементів з черги
        Product removedFirst = productQueue.pop(); // Видаляє перший елемент
        System.out.println("\nВидалено перший продукт: " + removedFirst);
        Product removedLast = productQueue.removeLast(); // Видаляє останній елемент
        System.out.println("Видалено останній продукт: " + removedLast);

        System.out.println("\nЧерга після видалення продуктів:");
        printQueue(productQueue);

        // Додавання та видалення елементів
        productQueue.offerLast(new Product(5, "Ноутбук", 30000.99, "Техніка"));
        productQueue.offerLast(new Product(6, "Куртка", 2500.75, "Одяг"));

        System.out.println("\nЧерга після додавання нових продуктів:");
        printQueue(productQueue);

        Product polledLast = productQueue.pollLast(); // Видаляє останній елемент
        System.out.println("\nВидалено останній продукт через pollLast(): " + polledLast);

        System.out.println("\nЧерга після виклику pollLast():");
        printQueue(productQueue);
    }

    // Допоміжний метод для друку черги
    private static void printQueue(Deque<Product> productQueue) {
        for (Product product : productQueue) {
            System.out.println(product);
        }
    }
}
