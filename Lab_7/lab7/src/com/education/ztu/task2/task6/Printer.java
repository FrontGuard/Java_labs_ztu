package com.education.ztu.task2.task6;

public class Printer implements Runnable {
    private final SharedData sharedData;

    public Printer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (true) {
            String data = sharedData.readData();
            if (data.equalsIgnoreCase("exit")) {
                synchronized (System.out) {
                    System.out.println("Printer received exit command. Stopping...");
                }
                break;
            }
            synchronized (System.out) {
                System.out.println("Printer: " + data);
            }
            try {
                Thread.sleep(1000); // Simulate delay in processing
            } catch (InterruptedException e) {
                System.err.println("Printer interrupted: " + e.getMessage());
            }
        }
    }
}
