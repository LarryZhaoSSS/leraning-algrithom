import java.util.Random;

public class ArrayGenerator {
    public static Integer[] generateRandomArray(int n,int bound) {
        Integer[] arr = new Integer[n];
        Random rnd = new Random();
        for(int i=0;i<n;i++) {
            arr[i] = rnd.nextInt(bound);
        }
        return arr;
    }
}
