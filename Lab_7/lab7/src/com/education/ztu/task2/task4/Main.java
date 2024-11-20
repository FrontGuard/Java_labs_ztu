package com.education.ztu.task2.task4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 4: Arithmetic Progression with Runnable");

        // Створюємо три об'єкти потоків для обчислення прогресії
        MyRunnableArithmetic arithmeticRunnable = new MyRunnableArithmetic();
        Thread thread1 = new Thread(arithmeticRunnable, "Thread-1");
        Thread thread2 = new Thread(arithmeticRunnable, "Thread-2");
        Thread thread3 = new Thread(arithmeticRunnable, "Thread-3");

        // Запускаємо потоки
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // Чекаємо завершення всіх потоків
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Task 4 Completed.");
    }
}
