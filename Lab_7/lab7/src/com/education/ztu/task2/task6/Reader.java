package com.education.ztu.task2.task6;

import java.util.Scanner;

public class Reader implements Runnable {
    private final SharedData sharedData;

    public Reader(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            synchronized (System.out) {
                System.out.print("Enter text (or 'exit' to quit): ");
            }
            input = scanner.nextLine();
            sharedData.writeData(input);
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
        }
        scanner.close();
    }
}
