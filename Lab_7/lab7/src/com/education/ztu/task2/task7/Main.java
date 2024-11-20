package com.education.ztu.task2.task7;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Task 7: Single-threaded and Multi-threaded Sum Calculation");

        // Генерація масиву
        int[] array = new Random().ints(1_000_000, 0, 100).toArray();

        // Однопоточний підрахунок
        long singleStart = System.currentTimeMillis();
        long singleSum = SingleThreadSum.calculateSum(array);
        long singleEnd = System.currentTimeMillis();
        Result singleResult = new Result(singleSum, singleEnd - singleStart);

        // Багатопоточний підрахунок
        long multiStart = System.currentTimeMillis();
        long multiSum = MultiThreadSum.calculateSum(array);
        long multiEnd = System.currentTimeMillis();
        Result multiResult = new Result(multiSum, multiEnd - multiStart);

        // Вивід результатів
        System.out.println("Single-threaded Result: Sum = " + singleResult.getSum() + ", Time = " + singleResult.getTime() + "ms");
        System.out.println("Multi-threaded Result: Sum = " + multiResult.getSum() + ", Time = " + multiResult.getTime() + "ms");
        System.out.println("Task 7 Completed.");
    }
}
