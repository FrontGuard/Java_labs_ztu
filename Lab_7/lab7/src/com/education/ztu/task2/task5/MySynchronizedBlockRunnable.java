package com.education.ztu.task2.task5;

public class MySynchronizedBlockRunnable implements Runnable {
    private static int result = 1; // Статична змінна для арифметичної прогресії
    private static final Object lock = new Object(); // Об'єкт для синхронізації

    @Override
    public void run() {
        while (result <= 100) {
            synchronized (lock) { // Синхронізований блок
                if (result <= 100) {
                    System.out.print(result + " ");
                    result++;
                }
            }

            try {
                Thread.sleep(200); // Затримка 0.2 секунди
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted.");
            }
        }
    }
}
