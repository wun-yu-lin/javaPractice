package com.example.javapractice.basic;

import java.util.Comparator;

public class ComparatorTest {
    static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return -o1.compareTo(o2);
        }
    }


    public static void main(String[] args) {
        String[] names = {"John", "Smith", "Brown"};
        Comparator<String> comparator = new StringComparator();
        java.util.Arrays.sort(names, comparator);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
