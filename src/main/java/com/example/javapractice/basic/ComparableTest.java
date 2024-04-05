package com.example.javapractice.basic;

import com.example.javapractice.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
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
