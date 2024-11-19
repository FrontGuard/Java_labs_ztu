package com.education.ztu.exceptions;

// Власний виняток для логіну
public class WrongLoginException extends Exception {
    // Конструктор за замовчуванням
    public WrongLoginException() {
        super("Invalid login format");
    }

    // Конструктор з повідомленням
    public WrongLoginException(String message) {
        super(message);
    }
}
