package com.education.ztu.tasks;

import com.education.ztu.exceptions.WrongLoginException;
import com.education.ztu.exceptions.WrongPasswordException;

public class Task2 {
    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            // Перевірка логіну
            if (login == null || !login.matches("^[a-zA-Z0-9_]+$") || login.length() >= 20) {
                throw new WrongLoginException("Login must contain only latin letters, numbers, or underscores and be less than 20 characters.");
            }

            // Перевірка паролю
            if (password == null || !password.matches("^[a-zA-Z0-9_]+$") || password.length() >= 20) {
                throw new WrongPasswordException("Password must contain only latin letters, numbers, or underscores and be less than 20 characters.");
            }

            // Перевірка підтвердження паролю
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password and confirm password must match.");
            }

            // Якщо всі перевірки пройдені
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }
}
