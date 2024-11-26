package com.education.ztu;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Створення власної анотації
@Retention(RetentionPolicy.RUNTIME) // Анотація доступна під час виконання
@Target({ElementType.TYPE, ElementType.METHOD}) // Може використовуватись для класів і методів
public @interface CustomAnnotation {
    String author() default "Anonymous";
    String date();
    String description() default "No description provided";
}
