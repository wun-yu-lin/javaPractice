package com.example.javapractice.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiedCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        List<String> unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.add("Four");// 此处会抛出 UnsupportedOperationException，因为它是不可修改的
        System.out.println(unmodifiableList);


        //map.of / List.of / Set.of 都是不可修改的
        List<String> list1 = List.of("One", "Two", "Three");
        list1.add("Four");// 此处会抛出 UnsupportedOperationException，因为它是不可修改的
        System.out.println(list1);


    }
}
