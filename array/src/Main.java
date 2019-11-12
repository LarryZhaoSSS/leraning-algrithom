public class Main {

    public static void main(String[] args) {
        Array<Integer> arr = new Array(10);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);
        arr.addLast(100);
        System.out.println(arr);
        arr.remove(0);
        arr.remove(0);
        System.out.println(arr);
//        arr.add(1,100);
//        arr.addFirst(-1);
//        System.out.println(arr);
//        arr.remove(1);
//        arr.remove(2);
//        arr.remove(3);
//        System.out.println(arr);
//        System.out.println(arr);
////       arr.add(1,100);
////       System.out.println(arr);
//        arr.addFirst(-1);
//        System.out.println(arr);
//
//
//        arr.remove(2);
//        System.out.println(arr);
//
//        arr.removeElement(4);
//        System.out.println(arr);
//
//        arr.removeFirst();
//        System.out.println(arr);
//
//        arr.removeLast();
//        System.out.println(arr);
    }
}
