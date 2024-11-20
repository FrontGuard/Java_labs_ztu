package com.education.ztu.task2.task3;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10000; i += 10) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + ": Розрахунок завершено!!!");
                return;
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
