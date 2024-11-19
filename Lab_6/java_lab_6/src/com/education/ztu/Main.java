package com.education.ztu;

import com.education.ztu.tasks.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running Lab 6 Tasks...");

        // Завдання 2
        System.out.println("Task 2: Checking Credentials");
        boolean isValid = Task2.checkCredentials("validLogin123", "password_123", "password_123");
        System.out.println("Credentials valid: " + isValid);

        // Завдання 3
        System.out.println("\nTask 3: Writing and Reading Purchase Report");
        Task3.run();

        // Завдання 4
        System.out.println("\nTask 4: Copying Files");
        Task4.run();

        // Завдання 5
        System.out.println("\nTask 5: Modifying File with RandomAccessFile");
        Task5.run();

        // Завдання 6
        System.out.println("\nTask 6: Working with File Class");
        Task6.run();

        // Завдання 7
        System.out.println("\nTask 7: Creating and Reading Archive");
        Task7.run();
    }
}
