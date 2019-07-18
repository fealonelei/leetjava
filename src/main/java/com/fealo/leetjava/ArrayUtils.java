package com.fealo.leetjava;

public class ArrayUtils {

    public static void swap(int[] src, int indexA, int indexB) {
        int tmp = src[indexB];
        src[indexB] = src[indexA];
        src[indexA] = tmp;
    }

}
