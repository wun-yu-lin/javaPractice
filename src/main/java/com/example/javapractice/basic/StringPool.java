package com.example.javapractice.basic;

public class StringPool {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        //使用字串常量的方式，會使用字串池，相同的字串會指向同一個記憶體位置
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        //使用new的方式，會使用不同的記憶體位置
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        if (s3 == s4) {
            System.out.println("s3 == s4");
        } else {
            System.out.println("s3 != s4");
        }

        //string 比對字串，使用equals
        if (s3.equals(s4)) {
            System.out.println("s3 equals s4");
        } else {
            System.out.println("s3 not equals s4");
        }
    }
}
