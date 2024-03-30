package com.example.javapractice.basic.extend;

public class Test {
    public static class A {
        public void print() {
            System.out.println("A");
        }
    }

    public static class B extends A {
        @Override
        public void print() {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.print();

        B b = new B();
        b.print();

        A ab = new B();
        ab.print();

    }
}
