package com.example.javapractice.basic;

import java.util.*;

public class KeySetTest {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        Set<Integer> keys = map.keySet();
        Collection<String> values =  map.values();
        System.out.println("Keys of TreeMap");
        System.out.println(keys);

        System.out.println("Values of TreeMap");
        System.out.println(values);
    }
}
