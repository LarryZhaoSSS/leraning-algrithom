package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//	    ArrayQueue<Integer> queue = new ArrayQueue<Integer>();
//	    for(int i = 0;i<10;i++) {
//	        queue.enqueue(i);
//	        System.out.println(queue);
//        }
//	    int queueSize = queue.getSize();
//		for(int j=0;j<queueSize-1;j++) {
//			if(j %2 ==0) {
//				queue.dequeue();
//			}
//		}
//		System.out.println(queue);
//		LoopQueue<Integer> queue = new LoopQueue<Integer>();
//	    for(int i = 0;i<10;i++) {
//	        queue.enqueue(i);
//			if(i %3 ==2) {
//				queue.dequeue();
//			}
//	        System.out.println(queue);
//        }
		int opCount = 100000;
		ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
		double time1 = testQueue(arrayQueue,opCount);
		System.out.println("ArrayQue time:" + time1 +"秒");
		LoopQueue<Integer> loopQueue = new LoopQueue<Integer>();
		double time2 = testQueue(loopQueue,opCount);
		System.out.println("LoopQue time:" + time2 +"秒");

    }
    public static double testQueue(Queue<Integer> q, int opCount) {
    	long startTime = System.nanoTime();
		Random random = new Random();
		for(int i=0;i<opCount;i++) {
			q.enqueue(random.nextInt(Integer.MAX_VALUE));
		}
		for(int i=0;i<opCount;i++){
			q.dequeue();
		}
    	long endTime = System.nanoTime();
    	return (endTime - startTime) / 1000.0 /1000.0 /1000.0;
	}
}
