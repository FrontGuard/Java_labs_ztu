package com.education.ztu.task2;

public class MyThread extends Thread {
    public MyThread() {
        super(); // Виклик конструктора Thread
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("I love programming!!!");
        }
    }
}
