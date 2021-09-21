package com.company;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    private QuickSort() {
    }

    public static <E extends Comparable<E>> void sort2Ways(E[] arr) {
        sort2Ways(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort2Ways(E[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int p = partition2(arr, l, r);
        sort(arr, l, p);
        sort(arr, p + 1, r);
    }

    private static <E extends Comparable<E>> int partition2(E[] arr, int l, int r) {
        // arr[l+1,...i-1]<=v;arr[j+1...r]>=v
        int i = l + 1, j = r;
        while (true) {
            while (i <= j && arr[i].compareTo(arr[l]) < 0) {
                i++;
            }
            while (j >= i && arr[j].compareTo(arr[l]) > 0) {
                j--;
            }
            if (i >= j) {
                break;
            }
            swap(arr, i, j);
            i++;
            j--;
        }
        swap(arr, l, j);
        return j;
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int p = partition(arr, l, r);
        sort(arr, l, p);
        sort(arr, p + 1, r);
    }

    private static <E extends Comparable<E>> int partition(E[] arr, int l, int r) {
        // arr[l+1,...,j]<v;arr[j+1,i]>v
        int p = l + (new Random()).nextInt(r - l + 1);
        swap(arr, l, p);
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i].compareTo(arr[l]) < 0) {
                j++;
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);
        return j;
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int n = 1_000_000;
//        Integer[] arr = ArrayGenerator.generateRandomArray(n,n);
        Integer[] arr = ArrayGenerator.generateOrderedArray(n);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        Integer[] arr4 = Arrays.copyOf(arr,arr.length);
        SortingHelper.sortTest("MergeSort", arr);
        SortingHelper.sortTest("quickSort", arr2);
        Integer[] arr3 = ArrayGenerator.generateRandomArray(n,n);
        SortingHelper.sortTest("quickSort2Ways",arr3);
        SortingHelper.sortTest("quickSort2Ways",arr4);

    }
}
