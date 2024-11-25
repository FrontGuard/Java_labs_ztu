package com.education.ztu;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferences {

    public static void runMethodReferenceExamples() {
        System.out.println("=== Посилання на методи ===");

        // 1. Посилання на статичний метод
        Function<String, Integer> parseInt = Integer::parseInt;
        String numberStr = "123";
        System.out.println("Parsed number: " + parseInt.apply(numberStr));

        // 2. Посилання на метод екземпляра конкретного об'єкта
        String sampleText = "hello, world";
        Supplier<String> toUpperCase = sampleText::toUpperCase;
        System.out.println("Uppercase: " + toUpperCase.get());

        // 3. Посилання на метод екземпляра через об'єктний параметр
        Function<Product, String> getName = Product::getName;
        Product product = new Product("Laptop", "Dell", 1200.00, 5);
        System.out.println("Product name: " + getName.apply(product));

        // 4. Посилання на конструктор
        Supplier<Product> productSupplier = () -> new Product("Phone", "Apple", 999.00, 10);
        Product newProduct = productSupplier.get();
        System.out.println("Created product: " + newProduct);
    }
}
