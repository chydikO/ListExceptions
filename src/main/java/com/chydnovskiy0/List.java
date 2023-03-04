package com.chydnovskiy0;

public class List<T> {
    private T[] obj;
    private int size = -1;
    private int cur = -1;

    public List(int size) {
        cur = 0;
        this.size = size;
        obj = (T[])(new Object[size]);
    }

    public T get(int index) {
        return obj[index];
    }

    public void add(T item) {
        obj[cur++] = item;
    }

    public void removeLast() {
        obj[--cur] = null;
    }
}