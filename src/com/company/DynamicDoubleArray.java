package com.company;

import java.util.Arrays;

public class DynamicDoubleArray<E> {
    private Object[] data = new Object[4];
    private int tempSize = 0;

    public void add(E element) {
        if (data.length <= tempSize) {
            Object[] tempData = data;
            data = new Object[2 * tempSize];
            for (int i = 0; i < tempData.length; i++) {
                data[i] = tempData[i];
            }
        }
        data[tempSize] = element;
        tempSize++;
    }

    public E get(int index) {
        if (index > data.length) {
            throw new IndexOutOfBoundsException("There is no value for this index!");
        }
        return (E) data[index];
    }

    public String toString() {
        return Arrays.toString(data);
    }

    public void remove(int index) {
        if (index > data.length) {
            throw new IndexOutOfBoundsException("There is no value for this index!");
        } else {
            Object[] tempData = data;
            data = new Object[data.length - 1];
            int i;
            for (i = 0; i <= data.length; i++) {
                if (i == index) {
                    break;
                }
                data[i] = tempData[i];
            }
            for (int j = i; j < data.length - 1; j++) {
                data[j] = tempData[j + 1];
            }
        }

    }
}
