package com.education.ztu.task2.task4;

public class MyRunnableArithmetic implements Runnable {
    private static int result = 1; // Початкове значення прогресії

    @Override
    public void run() {
        synchronized (MyRunnableArithmetic.class) {
            for (int i = 0; i < 100; i++) {
                System.out.print(result + " ");
                result += 1; // Додаємо крок прогресії
                try {
                    Thread.sleep(200); // Чекаємо 0.2 секунди
                } catch (InterruptedException e) {
                    System.out.println("\n" + Thread.currentThread().getName() + ": Interrupted!");
                    return;
                }
            }
            System.out.println();
        }
    }
}
