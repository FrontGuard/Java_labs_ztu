package com.education.ztu;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIExamples {
    public static void runStreamAPIExamples() {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Dell", 1200.00, 5),
                new Product("Phone", "Apple", 999.00, 10),
                new Product("Tablet", "Samsung", 850.00, 8),
                new Product("Monitor", "Dell", 400.00, 7),
                new Product("Headphones", "Sony", 199.00, 15)
        );

        // === Всі бренди ===
        System.out.println("=== Всі бренди ===");
        products.stream()
                .map(Product::getBrand) // Використовуємо метод getBrand()
                .distinct()
                .forEach(System.out::println);

        // === Товари дешевші за 1000 ===
        System.out.println("\n=== Товари дешевші за 1000 ===");
        products.stream()
                .filter(product -> product.getPrice() < 1000) // Використовуємо метод getPrice()
                .limit(2)
                .forEach(System.out::println);

        // === Загальна кількість товарів ===
        System.out.println("\n=== Загальна кількість товарів ===");
        int totalCount = products.stream()
                .map(Product::getCount) // Використовуємо метод getCount()
                .reduce(0, Integer::sum);
        System.out.println("Загальна кількість: " + totalCount);

        // === Товари по брендам ===
        System.out.println("\n=== Товари по брендам ===");
        Map<String, List<Product>> productsByBrand = products.stream()
                .collect(Collectors.groupingBy(Product::getBrand));
        productsByBrand.forEach((brand, productList) -> {
            System.out.println(brand + ": " + productList);
        });

        // === Товари за зростанням ціни ===
        System.out.println("\n=== Товари за зростанням ціни ===");
        List<Product> sortedProducts = products.stream()
                .sorted(Comparator.comparing(Product::getPrice)) // Використовуємо метод getPrice()
                .collect(Collectors.toList());
        sortedProducts.forEach(System.out::println);
    }
}
