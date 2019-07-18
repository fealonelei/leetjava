package com.fealo.leetjava;

import com.sun.tools.javac.code.Attribute;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class QuickSort {
    private int[] array;

    QuickSort(int[] array) {
        this.array = array;
    }

    void sort() {
        quickSort(array, 0, array.length - 1);
    }

    void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private void quickSort(int[] src, int p, int r) {
        if (p < r) {
            int q = partition(src, p, r);
            quickSort(src, p, q-1);
            quickSort(src, q+1, r);
        }
    }

    private int partition(int[] src, int p, int r) {
        int sentinel = src[r];
        int index = p-1; // index+1 是哨兵插入的位置
        for (int j = p; j < r; j++) {
            if (src[j] <= sentinel) {
                index = index + 1;
                ArrayUtils.swap(src, index, j);
            }
        }

        ArrayUtils.swap(src, index+1, r);

        return index+1;
    }
}
