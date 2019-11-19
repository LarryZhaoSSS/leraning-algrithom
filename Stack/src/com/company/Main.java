package com.company;

public class Main {

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        System.out.println("现在要出栈啦");
        stack.pop();
        System.out.println(stack);
        System.out.println("压一个进去");
        stack.push(111);
        System.out.println(stack);

    }
}
