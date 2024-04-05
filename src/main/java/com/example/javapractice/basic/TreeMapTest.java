package com.example.javapractice.basic;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {

        //forwards sorting
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(100, "John");
        map.put(2, "Smith");
        map.put(3, "Brown");
        System.out.println("tree map with forwards sorting:");
        System.out.println(map);

        //reverse sorting
        TreeMap<Integer, String> map2 = new TreeMap<>((o1, o2) -> o2 - o1); //using lambda
        map2.put(100, "John");
        map2.put(2, "Smith");
        map2.put(3, "Brown");
        System.out.println("tree map with reverse sorting:");
        System.out.println(map2);

    }

}
