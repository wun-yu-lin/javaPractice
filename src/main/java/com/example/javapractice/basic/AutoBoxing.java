package com.example.javapractice.basic;

public class AutoBoxing {
    public static void main(String[] args) {
        Integer i = 100; //auto boxing
        int j = i; //auto unboxing

        Integer ii = 100;
        //Integer ii = 100; //auto boxing
        if (i == ii){
            System.out.println("i == ii");
        }else {
            System.out.println("i != ii");
        }

        Integer iii = 200;
        Integer iiii = 200;
        //Autoboxing 有快取功能，範圍在-128~127
        //所以iii == iiii 是比較包裹器的記憶體位置，非比較值，所以不會相等


        //錯誤寫法
        if (iii == iiii){
            System.out.println("iii == iiii");
        }else {
            System.out.println("iii != iiii");
        }

        //正確寫法
        if (iii.equals(iiii)){
            System.out.println("iii equals iiii");
        }else {
            System.out.println("iii not equals iiii");
        }




    }
}
