package com.example.javapractice.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) throws FileNotFoundException {
        //可以重新指定系統的輸入來源
        System.setIn(new FileInputStream(args[0])); //指定為 FileInputStream
        try(Scanner file = new Scanner(System.in)){
            while (file.hasNextLine()){
                System.out.println(file.nextLine());
            }
        }
    }
}
