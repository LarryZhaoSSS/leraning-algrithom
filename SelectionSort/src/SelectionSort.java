public class SelectionSort {
    private SelectionSort(){}
    public static <E extends Comparable> void sort(E[] arr) {
        for(int i=0;i<arr.length;i++) {
            int minIndex = i;
            for(int j=i;j<arr.length;j++) {
                if(arr[j].compareTo(arr[minIndex])<0) {
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }
    public static <E> void swap(E [] arr ,int i,int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] =t;
    }
    public static void main(String[] args) {
        int n = 20000;
        Integer [] arr = ArrayGenerator.generateRandomArray(n,n);
        SortingHelper.sortTest("InSertionSort",arr);

    }
}
