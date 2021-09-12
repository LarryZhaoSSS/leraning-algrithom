package com.company;

import java.util.Arrays;

public class Solution51 {
    private int res=0;

    public int reverseParis(int[] nums) {
        res=0;
        sort(nums, 0, nums.length - 1);
        return res;
    }

    private   void sort(int[] arr, int l, int r) {
        if (l>=r) {
            return;
        }
        int mid = (l + r) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }
    private void merge(int[] arr, int l, int mid, int r) {
        int[] temp = Arrays.copyOfRange(arr, l, r + 1);
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j - l];
                j++;
            } else if (j > r) {
                arr[k] = temp[i - l];
                i++;
            } else if (temp[i - l]<=temp[j - l] ) {
                arr[k] = temp[i - l];
                i++;
            } else {
                res+= mid-i+1;
                arr[k] = temp[j - l];
                j++;
            }
        }
    }

    public static void main(String[] args) {

    }
}
