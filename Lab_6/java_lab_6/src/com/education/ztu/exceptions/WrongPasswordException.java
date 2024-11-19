package com.education.ztu.exceptions;

// Власний виняток для паролю
public class WrongPasswordException extends Exception {
    // Конструктор за замовчуванням
    public WrongPasswordException() {
        super("Invalid password format");
    }

    // Конструктор з повідомленням
    public WrongPasswordException(String message) {
        super(message);
    }
}
