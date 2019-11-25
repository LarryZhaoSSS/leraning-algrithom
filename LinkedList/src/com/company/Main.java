package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    LinkedList<Integer> linkedList = new LinkedList<Integer>();
	    for(int i=0;i<10;i++) {
	        linkedList.addFirst(i);
//			System.out.println(linkedList);
        }

	    linkedList.addLast(999);
	    System.out.println("after insert :");
        System.out.println(linkedList);

        linkedList.add(2,666);
		System.out.println("after insert :");
		System.out.println(linkedList);

		linkedList.set(3,333);
		System.out.println("after update :");
		System.out.println(linkedList);
    }
}
