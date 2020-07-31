public class LinearSearch {
    private LinearSearch() {}
    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (target.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Integer[] data = ArrayGenerator.generateOrderedArray(1000000);
        long startTime = System.nanoTime();
        LinearSearch.search(data,1000000);
        long endTime = System.nanoTime();
        double time = (endTime-startTime) / 1000000000.0;
        System.out.println(time+"s");

    }
}
