package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        BST<Integer> bst = new BST<Integer>();
//        int [] nums = {5,3,6,8,4,2};
//        for(int num:nums) {
//            bst.add(num);
//        }
//        bst.levelOrder();
//        System.out.println();
        BST<Integer> bst = new BST<Integer>();
        Random random = new Random();
        int n = 1000;
        for(int i=0;i<n;i++) {
            bst.add(random.nextInt(10000));
        }
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while(!bst.isEmpty()) {
            nums.add(bst.removeMin());
        }
        System.out.println(nums);
        for(int i=1;i<nums.size();i++) {
            if(nums.get(i-1)>nums.get(i)){
                throw new IllegalArgumentException("Error! Not sorted");
            }
        }
        System.out.println("Complete");
    }
}
