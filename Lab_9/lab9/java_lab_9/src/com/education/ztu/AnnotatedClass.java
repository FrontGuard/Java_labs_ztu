package com.education.ztu;

// Клас із використанням анотації
@CustomAnnotation(
        author = "Іван Іванов",
        date = "2024-11-26",
        description = "Цей клас демонструє використання власної анотації."
)
public class AnnotatedClass {

    @CustomAnnotation(
            author = "Петро Петренко",
            date = "2024-11-26",
            description = "Метод для демонстрації роботи з анотаціями."
    )
    public void annotatedMethod() {
        System.out.println("Цей метод позначено власною анотацією.");
    }
}
