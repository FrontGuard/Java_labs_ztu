package com.education.ztu;

import java.util.*;

public class Task6MapAndCollectionsDemo {
    public static void executeTask() {
        System.out.println("=== Завдання 6: Робота з Map і класом Collections ===");

        // Створення об'єктів Product
        Product product1 = new Product(1, "Джинси", 1500.78, "Жіночий одяг");
        Product product2 = new Product(2, "Сорочка", 950.25, "Чоловічий одяг");
        Product product3 = new Product(3, "Капелюх", 700.50, "Аксесуари");
        Product product4 = new Product(4, "Кросівки", 2000.00, "Взуття");
        Product product5 = new Product(5, "Рюкзак", 1250.30, "Аксесуари");


        // Створення HashMap для зберігання продуктів
        Map<String, Product> productMap = new HashMap<>();
        productMap.put(product1.getName(), product1);
        productMap.put(product2.getName(), product2);
        productMap.put(product3.getName(), product3);
        productMap.put(product4.getName(), product4);
        productMap.put(product5.getName(), product5);

        // Демонстрація методів Map
        System.out.println("\n--- Робота з HashMap ---");
        System.out.println("Всі продукти у Map:");
        for (Map.Entry<String, Product> entry : productMap.entrySet()) {
            System.out.printf("Ключ: %s, Значення: %s%n", entry.getKey(), entry.getValue());
        }

        System.out.println("\nОтримання продукту за ключем 'Джинси': " + productMap.get("Джинси"));
        System.out.println("Чи міститься ключ 'Кросівки': " + productMap.containsKey("Кросівки"));
        System.out.println("Чи міститься значення 'Сорочка': " + productMap.containsValue(product2));

        // Використання Collections
        List<Product> productList = new ArrayList<>(productMap.values());
        System.out.println("\n--- Робота з класом Collections ---");

        System.out.println("Сортування продуктів за ціною:");
        productList.sort(Comparator.comparing(Product::getPrice));
        productList.forEach(System.out::println);

        System.out.println("\nРеверс списку:");
        Collections.reverse(productList);
        productList.forEach(System.out::println);

        System.out.println("\nМаксимальний елемент (за ціною): " + Collections.max(productList, Comparator.comparing(Product::getPrice)));
        System.out.println("Мінімальний елемент (за ціною): " + Collections.min(productList, Comparator.comparing(Product::getPrice)));

        System.out.println("\nПеретасовка списку:");
        Collections.shuffle(productList);
        productList.forEach(System.out::println);

        System.out.println("\nБінарний пошук продукту 'Капелюх':");
        Collections.sort(productList, Comparator.comparing(Product::getName));
        int index = Collections.binarySearch(productList, product3, Comparator.comparing(Product::getName));
        System.out.println("Індекс продукту: " + index);

        System.out.println("\nЧастота появи об'єкта 'Джинси': " + Collections.frequency(productList, product1));
    }
}
