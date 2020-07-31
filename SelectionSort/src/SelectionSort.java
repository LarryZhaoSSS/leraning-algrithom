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
        Integer [] arr = {11,33,1,2,4,5,9,4,5,6};
        SelectionSort.sort(arr);
        for(int e:arr) {
            System.out.print(e+" ");
        }
    }
}
