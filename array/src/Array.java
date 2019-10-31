public class Array {
    private int[] data;
    private int size;

    // 传入数组的容量capacity构造Array
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // 无参数的构造函数，默认容量是10
    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    // 返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(int e) {
        add(size,e);
    }
    public void addFirst(int e) {
        add(0,e);
    }
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("Array is full");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index > 0 && index<size");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }
    int get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index > 0 && index<size: index illegal");
        }
        return data[index];
    }
    void set(int index, int e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index > 0 && index<size: index illegal");
        }
        data[index] = e;
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size=%d,capacity=%d\n",size,data.length));
        res.append('[');
        for(int i=0;i<size;i++) {
            res.append(data[i]);
            if(i!=size-1) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }
}
