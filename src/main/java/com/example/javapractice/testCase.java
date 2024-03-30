package com.example.javapractice;

public class testCase {
    public class A {
        public A() {
            System.out.println("Constructor A");
        }
    }

    public class B extends A {
        public B() {
            System.out.println("Constructor B");
        }


    }

    public static void main(String[] args) {
        B b = new testCase().new B();

    }

//    A. Runtime error
//    B. Compile error
//    C. Constructor A\nConstructor B\n
//    D. Constructor B\nConstructor A\n
//
//    答：因為Python的__init__會被覆蓋掉，所以覺得選擇不在答案上，硬選了A。
//
//    結果Java的constructor不會被覆蓋所以是C。
}
