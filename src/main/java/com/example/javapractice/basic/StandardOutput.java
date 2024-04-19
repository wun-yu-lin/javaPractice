package com.example.javapractice.basic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class StandardOutput {
    public static void main(String[] args) throws FileNotFoundException {
        //使用 setOut 方法指定 PrintStream 實例，將結果輸出到目的地
        try(PrintStream file = new PrintStream(new FileOutputStream(args[0]))){
            System.setOut(file);
            System.out.println("set printStream");
        }
    }
}
