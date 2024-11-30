package com.education.ztu;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationExamples {
    public static void runAnnotationExamples() {
        // Отримання класу AnnotatedClass
        Class<AnnotatedClass> clazz = AnnotatedClass.class;

        // Перевірка наявності анотації на класі
        if (clazz.isAnnotationPresent(CustomAnnotation.class)) {
            CustomAnnotation annotation = clazz.getAnnotation(CustomAnnotation.class);
            System.out.println("=== Анотація на класі ===");
            System.out.println("Автор: " + annotation.author());
            System.out.println("Дата: " + annotation.date());
            System.out.println("Опис: " + annotation.description());
        }

        // Перевірка анотацій методів класу
        System.out.println("\n=== Анотації методів ===");
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
                System.out.println("Метод: " + method.getName());
                System.out.println("Автор: " + annotation.author());
                System.out.println("Дата: " + annotation.date());
                System.out.println("Опис: " + annotation.description());
                System.out.println();
            }
        }
    }
}
