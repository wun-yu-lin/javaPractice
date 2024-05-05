package com.example.javapractice;

import java.util.*;

public class test {
//    public static void main(String[] args) {
////        int number = 123_12321;
////        int num2 = 0b101010101010;
////
////        System.out.println(num2);
//        int a = 1;
//        a++;
//        int b = 1;
//
//        int i = 1;
//        int ii = 2;
//
//        System.out.print(i+ ","+ii);
//        Queue<Integer> queue = new LinkedList<>();
//
//
//
//    }


    record Customer(String name, int age) implements Comparable<Customer> {
        @Override
        public int compareTo(Customer o) {
            return this.age - o.age;
        }
    }
    public static void main(String[] args) {
        List<Customer> accounts = Arrays.asList(
                new Customer("John", 100),
                new Customer("Smith", 25),
                new Customer("Brown", 30)
        );
        Collections.sort(accounts);
        accounts.forEach(System.out::println);
    }



}
