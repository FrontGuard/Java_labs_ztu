package com.education.ztu.task2.task6;

public class SharedData {
    private String data = "";
    private boolean hasNewData = false;

    public synchronized void writeData(String input) {
        while (hasNewData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Write interrupted: " + e.getMessage());
            }
        }
        data = input;
        hasNewData = true;
        notifyAll();
    }

    public synchronized String readData() {
        while (!hasNewData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Read interrupted: " + e.getMessage());
            }
        }
        hasNewData = false;
        notifyAll();
        return data;
    }
}
