import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    private MergeSort() {
    }

    // 自顶向下
    public static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
//        if(r-l<=15) {
//            InsertionSort.sort(arr,l,r);
//            return;
//        }
        int mid = l + (r - l) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        if (arr[mid].compareTo(arr[mid + 1]) > 0) {
            merge(arr, l, mid, r);
        }

    }

    // 自底向上
    public static <E extends Comparable<E>> void sortBU(E[] arr) {
        E[] temp = Arrays.copyOf(arr, arr.length);
        int n = arr.length;
        // 遍历合并区间的长度
        for (int sz = 1; sz < n; sz += sz) {
            // 遍历合并的两个区间的开始位置 i
            // 合并[i,i+sz-1]和[i+sz;i+sz+sz-1]
            for (int i = 0; i + sz < n; i += sz + sz) {
                if (arr[i + sz - 1].compareTo(arr[i + sz]) > 0) {
                    merge2(arr, i, i + sz - 1, Math.min(i + sz + sz - 1, n - 1), temp);
                }

            }
        }
    }

    private static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r) {
        // 合并两个有序的区间arr[l,...,mid] 和 arr[mid+1,...,r]
        E[] temp = Arrays.copyOfRange(arr, l, r + 1);
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            // arr[i]和arr[j];
            if (i > mid) {
                // 左侧处理完成,处理右侧
                arr[k] = temp[j - l];
                j++;
            } else if (j > r) {
                // 右侧处理完成,处理左侧
                arr[k] = temp[i - l];
                i++;
            } else if (temp[i - l].compareTo(temp[j - l]) <= 0) {
                // 左侧的元素小于右侧
                arr[k] = temp[i - l];
                i++;
            } else {
                arr[k] = temp[j - l];
                j++;
            }
        }
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {
        E[] temp = Arrays.copyOf(arr, arr.length);
        sort2(arr, 0, arr.length - 1, temp);
    }

    private static <E extends Comparable<E>> void sort2(E[] arr, int l, int r, E[] temp) {
        if (l >= r) {
            return;
        }
//        if(r-l<=15) {
//            InsertionSort.sort(arr,l,r);
//            return;
//        }
        int mid = l + (r - l) / 2;
        sort2(arr, l, mid, temp);
        sort2(arr, mid + 1, r, temp);
        if (arr[mid].compareTo(arr[mid + 1]) > 0) {
            merge2(arr, l, mid, r, temp);
        }

    }

    private static <E extends Comparable<E>> void merge2(E[] arr, int l, int mid, int r, E[] temp) {
        // 合并两个有序的区间arr[l,...,mid] 和 arr[mid+1,...,r]
//        E[] temp = Arrays.copyOfRange(arr, l, r + 1);
        System.arraycopy(arr, l, temp, l, r - l + 1);
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            // arr[i]和arr[j];
            if (i > mid) {
                // 左侧处理完成,处理右侧
                arr[k] = temp[j];
                j++;
            } else if (j > r) {
                // 右侧处理完成,处理左侧
                arr[k] = temp[i];
                i++;
            } else if (temp[i].compareTo(temp[j]) <= 0) {
                // 左侧的元素小于右侧
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int n = 10_0000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        SortingHelper.sortTest("MergeSort", arr);
        SortingHelper.sortTest("MergeSortBU", arr2);
    }
}
