package com.education.ztu.task2.task5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 5: Synchronized Block with Arithmetic Progression");

        // Створення трьох потоків
        Thread thread1 = new Thread(new MySynchronizedBlockRunnable());
        Thread thread2 = new Thread(new MySynchronizedBlockRunnable());
        Thread thread3 = new Thread(new MySynchronizedBlockRunnable());

        // Запуск потоків
        thread1.start();
        thread2.start();
        thread3.start();

        // Очікування завершення потоків
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nTask 5 Completed.");
    }
}
