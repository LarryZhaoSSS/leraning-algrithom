package com.company;

import java.util.Random;

public class Main {
    private static double testHeap(Integer[] testData, boolean isHeapify) {
        long startTime = System.nanoTime();
        MaxHeap<Integer> maxHeap;
        if(isHeapify) {
            maxHeap = new MaxHeap<Integer>(testData);
        } else {
            maxHeap = new MaxHeap<Integer>();
            for(int num:testData) {
                maxHeap.add(num);
            }
        }
        int dataLength = testData.length;
        int[] arr = new int[dataLength];
        for (int i = 0; i < dataLength; i++) {
            arr[i] = maxHeap.extractMax();
        }
        for (int i = 1; i < dataLength; i++) {
            if (arr[i - 1] < arr[i]) {
                throw new IllegalArgumentException("not heap");
            }
        }
        System.out.println(" test complete");
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000;
    }

    public static void main(String[] args) {
        // write your code here
        int n = 1000000;
        MaxHeap<Integer> maxHeap = new MaxHeap<Integer>();
        Random random = new Random();
        Integer[] testData = new Integer[n];
        for(int i=0;i<n;i++) {
            testData[i] = random.nextInt(Integer.MAX_VALUE);
        }
        double time1 = testHeap(testData,false);
        double time2 = testHeap(testData,true);
        System.out.println("normal: "+time1+"s");
        System.out.println("heapify:" + time2+"s");
    }
}
