package com.education.ztu.task2.task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 3: Working with Runnable Interface");

        // Створюємо об'єкти класу MyRunnable
        MyRunnable runnable1 = new MyRunnable();
        MyRunnable runnable2 = new MyRunnable();
        MyRunnable runnable3 = new MyRunnable();

        // Створюємо потоки
        Thread thread1 = new Thread(runnable1, "Thread-1");
        Thread thread2 = new Thread(runnable2, "Thread-2");
        Thread thread3 = new Thread(runnable3, "Thread-3");

        // Запускаємо потоки
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // Головний потік чекає 2 секунди
            Thread.sleep(2000);

            // Переривання потоків
            thread1.interrupt();
            thread2.interrupt();
            thread3.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            // Очікуємо завершення всіх потоків
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Task 3 Completed.");
    }
}
