package DTO;

import lombok.Data;

@Data
public class MyArray {

    private int[] data;
    private int size;

    public MyArray(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public MyArray() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public void addLast(int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("AddLast failed");
        }
        data[size] = e;
        size++;
    }

}
