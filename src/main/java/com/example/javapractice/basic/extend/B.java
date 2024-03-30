package com.example.javapractice.basic.extend;

public class B extends A {
    public int getA() {
        return a;
    }

    protected int a = 2;
    public void print(B bObj) {
        super.print(bObj);
    }


    public static void main(String[] args) {
        B b = new B();
        b.print(b);
    }

}
