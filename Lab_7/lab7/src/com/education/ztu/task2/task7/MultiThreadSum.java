package com.education.ztu.task2.task7;

import java.util.concurrent.*;

public class MultiThreadSum {
    private static final int THREAD_COUNT = 5;

    public static long calculateSum(int[] array) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        int chunkSize = array.length / THREAD_COUNT;
        Future<Long>[] futures = new Future[THREAD_COUNT];

        for (int i = 0; i < THREAD_COUNT; i++) {
            int start = i * chunkSize;
            int end = (i == THREAD_COUNT - 1) ? array.length : start + chunkSize;
            futures[i] = executor.submit(new SumTask(array, start, end));
        }

        long totalSum = 0;
        for (Future<Long> future : futures) {
            totalSum += future.get();
        }

        executor.shutdown();
        return totalSum;
    }
}
