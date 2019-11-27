package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//	    LinkedListQueue<Integer> queue = new LinkedListQueue<Integer>();
//	    for(int i = 0;i<10;i++) {
//	        queue.enqueue(i);
//	        System.out.println(queue);
//	        if( i %3 ==2){
//	        	queue.dequeue();
//	        	System.out.println("----dequeue----");
//	        	System.out.println(queue);
//			}
//        }
//
//		System.out.println(queue);

		int optCount = 1000000;
		ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
		double time1 = testQueue(arrayQueue,optCount);
		System.out.println("ArrayQueue,time:" + time1 +"秒");
		LoopQueue<Integer> loopQueue = new LoopQueue<Integer>();
		double time2 = testQueue(loopQueue,optCount);
		System.out.println("LoopQueue,time:" + time2 +"秒");
		LinkedListQueue<Integer> linkQueue = new LinkedListQueue<Integer>();
		double time3 = testQueue(linkQueue,optCount);
		System.out.println("LinkedListQueue,time:" + time3 +"秒");

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
