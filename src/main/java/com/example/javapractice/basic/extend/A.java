package com.example.javapractice.basic.extend;


public class A {
    public int getA() {
        return a;
    }

    protected int a = 1;

    public static void print(A aObj) {
        System.out.println(aObj.getA());
    }
}
