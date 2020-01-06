package com.company;

import java.util.TreeSet;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] codes = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        TreeSet<String> set = new TreeSet<String>();
        for(String word:words) {
            StringBuilder res = new StringBuilder();
            for(int i=0;i<word.length();i++) {
               res.append(codes[word.charAt(i)-'a']);
            }
            set.add(res.toString());
        }
        return set.size();
    }
}