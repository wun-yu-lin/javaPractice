package com.example.javapractice.basic;

public class bitwiseOperator {

    public static void main(String[] args) {

        //bitwise shift
        int number =1;
        System.out.printf("2 的 0 次方: %d%n", number);
        System.out.printf("2 的 1 次方: %d%n", number << 1);
        System.out.printf("2 的 2 次方: %d%n", number << 2);
        System.out.printf("2 的 3 次方: %d%n", number << 3);



        //bitwise operator
        System.out.println("\nOR 運算：");
        System.out.printf("0 OR 0 %6d%n", 0 | 0);
        System.out.printf("0 OR 1 %6d%n", 0 | 1);
        System.out.printf("1 OR 0 %6d%n", 1 | 0);
        System.out.printf("1 OR 1 %6d%n", 1 | 1);

        System.out.println("\nAND 運算：");
        System.out.printf("0 AND 0 %6d%n", 0 & 0);
        System.out.printf("0 AND 1 %6d%n", 0 & 1);
        System.out.printf("1 AND 0 %6d%n", 1 & 0);
        System.out.printf("1 AND 1 %6d%n", 1 & 1);

        System.out.println("\nXOR 運算：");
        System.out.printf("0 XOR 0 %6d%n", 0 ^ 0);
        System.out.printf("0 XOR 1 %6d%n", 0 ^ 1);
        System.out.printf("1 XOR 0 %6d%n", 1 ^ 0);
        System.out.printf("1 XOR 1 %6d%n", 1 ^ 1);


        //遞增、遞減運算
        int  i =0;
        i = i +1; //compiler  會自動變成 i++
        i++; //先回傳值i，再+1;
        ++i; //先+1 再回傳i


        //var 型態判斷
        var age = 10; //int
        var pi = 3.14; //double
        var upper = 10000000L; //long
        var tau = 3.14159F; //float
        var isLower = true; //boolean

    }

}
