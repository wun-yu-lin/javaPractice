package com.example.javapractice.basic;

public class Lambda {
    public static void main(String[] args) {

        //先行定義介面與介面中的方法
        //透過匿名內部類別還實作介面
        //或使用 Lambda 表達式簡化 class 的實作
        Some some = new Some() {
            @Override
            public void someMethod() {
                System.out.println("Some");
            }
        };

        Some some1 = () -> System.out.println("Some1");


    }
    public interface Some {
        void someMethod();
        
    }
}
