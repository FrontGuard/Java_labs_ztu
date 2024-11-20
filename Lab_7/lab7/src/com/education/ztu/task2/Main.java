package com.education.ztu.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 2: Working with Threads");

        // Створення потоку
        MyThread myThread = new MyThread();

        // Перевірка стану перед запуском
        System.out.println("Thread State: " + myThread.getState());
        System.out.println("Thread Name: " + myThread.getName());
        System.out.println("Thread Priority: " + myThread.getPriority());
        System.out.println("Is Alive: " + myThread.isAlive());
        System.out.println("Is Daemon: " + myThread.isDaemon());

        // Зміна імені та пріоритету
        myThread.setName("ProgrammingThread");
        myThread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("\nUpdated Thread Info:");
        System.out.println("Thread Name: " + myThread.getName());
        System.out.println("Thread Priority: " + myThread.getPriority());

        // Запуск потоку
        myThread.start();

        // Перевірка стану RUNNING
        System.out.println("\nThread State After Start: " + myThread.getState());

        // Очікування завершення роботи потоку
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Перевірка стану TERMINATED
        System.out.println("\nThread State After Completion: " + myThread.getState());
        System.out.println("Main Thread Name: " + Thread.currentThread().getName());
        System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
    }
}
