package com.education.ztu.task2.task6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 6: Reader and Printer Synchronization");

        SharedData sharedData = new SharedData();
        Thread readerThread = new Thread(new Reader(sharedData), "ReaderThread");
        Thread printerThread = new Thread(new Printer(sharedData), "PrinterThread");

        readerThread.start();
        printerThread.start();

        try {
            readerThread.join();
            printerThread.join();
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Task 6 Completed.");
    }
}
