import java.util.Arrays;

public class InsertionSort {
    private InsertionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            for(int j=i;j>0;j--) {
//                if(arr[j].compareTo(arr[j-1])<0) {
//                    swap(arr,j,j-1);
//                } else {
//                    break;
//                }
//            }
            for (int j = i; j - 1 >= 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {
        for(int i=0;i<arr.length;i++) {
            E t = arr[i];
            int j;
            for(j=i;j-1>=0 && t.compareTo(arr[j-1])<0;j--) {
                arr[j]= arr[j-1];
            }
            arr[j] =t;
        }
    }

    public static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int n = 20000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        Integer[] arr2 = Arrays.copyOf(arr,arr.length);
        SortingHelper.sortTest("InsertingSort", arr);
        SortingHelper.sortTest("InsertingSort2", arr2);

    }
}
