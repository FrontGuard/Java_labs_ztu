package com.education.ztu.task2.task7;

public class SingleThreadSum {
    public static long calculateSum(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
