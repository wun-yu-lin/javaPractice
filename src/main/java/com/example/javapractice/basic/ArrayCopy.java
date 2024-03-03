package com.example.javapractice.basic;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        //method 1
        int [] arr = {1, 2, 3, 4, 5};
        int [] arr2 = new int[arr.length];

        System.arraycopy(arr, 0, arr2, 0, arr.length);


        //method 2
        int [] arr3 = Arrays.copyOf(arr, arr.length);

        //method 2 延伸 - 產生更長的陣列
        int [] arr4 = Arrays.copyOf(arr, arr.length*2);

    }
}
