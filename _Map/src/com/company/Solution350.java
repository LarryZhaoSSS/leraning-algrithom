package com.company;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 */
public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num:nums1){
            if(!map.containsKey(num)){
                map.put(num,1);
            } else {
                map.put(num,map.get(num)+1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num:nums2){
            if(map.containsKey(num)){
                list.add(num);
                map.put(num,map.get(num)-1);
                if(map.get(num)==0){
                    map.remove(num);
                }
            }
        }
        int [] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
