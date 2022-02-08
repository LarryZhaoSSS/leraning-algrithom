package com.company;

public class MaxHeap <E extends Comparable<E>> {
    private Array<E> data;
    public MaxHeap(int capacity){
        data = new Array<>(capacity);
    }
    public MaxHeap(){
        data = new Array<>();
    }
    public int size(){
        return data.getSize();
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }
    private int parent(int index){
        if(index == 0){
            throw new IllegalArgumentException("no parent;");
        }
        return (index-1)/2;
    }
    private int leftChild(int index){
        return index * 2 + 1;
    }
    private int rightChild(int index){
        return index * 2 + 2;
    }
    public void add(E e){
        data.addLast(e);
        siftUp(data.getSize()-1);
    }
    private void siftUp(int k){
        while(k > 0 && data.get(parent(k)).compareTo(data.get(k))<0){
            data.swap(k,parent(k));
            k = parent(k);
        }
    }
    private void siftDown(int k){
        while(leftChild(k)<data.getSize()){
            int j = leftChild(k);
            // data[j]是leftChild和rightChild的最大值
            if(j+1<data.getSize() && data.get(j+1).compareTo(data.get(j))>0){
                j = rightChild(k);
            }
            if(data.get(k).compareTo(data.get(j))>=0){
                break;
            }
            data.swap(k,j);
            k = j;
        }
    }
    public E findMax(){
        if(data.getSize() == 0){
            throw new IllegalArgumentException("empty heap");
        }
        return data.get(0);
    }
    public E extractMax(){
        E ret = findMax();
        data.swap(0,data.getSize()-1);
        data.removeLast();
        siftDown(0);
        return ret;
    }
}
