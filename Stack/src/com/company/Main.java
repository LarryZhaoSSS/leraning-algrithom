package com.company;
import java.util.Stack;
public class Main {
    public boolean isValid(String s) {
        Stack<Character> stack =new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char topChar = stack.pop();
                if(c==')' && topChar != '(') {
                    return false;
                }
                if(c=='}' && topChar != '{') {
                    return false;
                }
                if(c==']' && topChar != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
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
