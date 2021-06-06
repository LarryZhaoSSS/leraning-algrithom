package com.company;

public class Main {

    public static void main(String[] args) {
        Array arr = new Array(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);
        arr.addFirst(-1);
        System.out.println(arr);
        int e = arr.get(1);
        System.out.println(e);
        arr.set(1,101);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
    }
}
