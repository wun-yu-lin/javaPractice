package com.example.javapractice.basic;

import java.math.BigDecimal;

public class BigDecDiff {
    public static void main(String[] args) {
        var a = new BigDecimal("0.1");
        var b = new BigDecimal("0.1");
        var c = new BigDecimal("0.1");
        var result = a.add(b).add(c);

        if (result.equals(new BigDecimal("0.3"))){
            System.out.println("equals 0.3");
        }else {
            System.out.println("Not equals 0.3");
        }
    }
}
