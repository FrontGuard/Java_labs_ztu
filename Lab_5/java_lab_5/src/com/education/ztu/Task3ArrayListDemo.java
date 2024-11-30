package com.education.ztu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3ArrayListDemo {
    public static void executeTask() {
        // Створюємо динамічний масив
        List<Product> productList = new ArrayList<>();

        // Додавання елементів
        productList.add(new Product(1, "Джинси", 1500.78, "Одяг"));
        productList.add(new Product(2, "Сорочка", 500.99, "Одяг"));
        productList.add(new Product(3, "Кросівки", 1200.50, "Взуття"));
        productList.add(new Product(4, "Телефон", 22000.45, "Техніка"));

        System.out.println("Початковий список продуктів:");
        printProducts(productList);

        // Додавання нових елементів
        List<Product> newProducts = new ArrayList<>();
        newProducts.add(new Product(5, "Ноутбук", 30000.99, "Техніка"));
        newProducts.add(new Product(6, "Куртка", 2500.75, "Одяг"));
        productList.addAll(newProducts);

        System.out.println("\nПісля додавання нових продуктів:");
        printProducts(productList);

        // Отримання елемента за індексом
        Product firstProduct = productList.get(0);
        System.out.println("\nПерший продукт: " + firstProduct);

        // Пошук індекса продукту
        int index = productList.indexOf(new Product(3, "Кросівки", 1200.50, "Взуття"));
        System.out.println("\nІндекс продукту 'Кросівки': " + index);

        // Видалення продукту
        productList.remove(1);
        System.out.println("\nСписок після видалення другого продукту:");
        printProducts(productList);

        // Заміна продукту
        productList.set(0, new Product(7, "Пальто", 4000.25, "Одяг"));
        System.out.println("\nСписок після заміни першого продукту:");
        printProducts(productList);

        // Сортування за ціною
        productList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("\nСписок після сортування за ціною:");
        printProducts(productList);

        // Підсписок
        List<Product> subList = productList.subList(0, 3);
        System.out.println("\nПідсписок продуктів (0-2):");
        printProducts(subList);

        // Очищення списку
        productList.clear();
        System.out.println("\nЧи список порожній після очищення? " + productList.isEmpty());
    }

    // Допоміжний метод для друку списку продуктів
    private static void printProducts(List<Product> productList) {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
