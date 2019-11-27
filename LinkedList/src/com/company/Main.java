package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    LinkedList<Integer> linkedList = new LinkedList<Integer>();
	    for(int i=0;i<10;i++) {
	        linkedList.addFirst(i);
        }


        linkedList.add(2,666);
		System.out.println("after insert :");
		System.out.println(linkedList);

		linkedList.remove(2);
		System.out.println("after delete [2] :");
		System.out.println(linkedList);

		linkedList.removeFirst();
		System.out.println("after delete first :");
		System.out.println(linkedList);

		linkedList.removeLast();
		System.out.println("after delete last :");
		System.out.println(linkedList);
    }
}
