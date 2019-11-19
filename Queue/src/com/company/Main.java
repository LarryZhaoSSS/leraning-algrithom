package com.company;

public class Main {

    public static void main(String[] args) {
	    ArrayQueue<Integer> queue = new ArrayQueue<Integer>();
	    for(int i = 0;i<10;i++) {
	        queue.enqueue(i);
//	        System.out.println(queue);
        }
	    int queueSize = queue.getSize();
		for(int j=0;j<queueSize-1;j++) {
			if(j %2 ==0) {
				queue.dequeue();
			}
		}
		System.out.println(queue);
    }
}
