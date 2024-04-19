package com.example.javapractice.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut = null;
        FileInputStream fileIn = null;

        try{
            fileIn = new FileInputStream("testIn.txt"); //讀取檔案串流
            fileOut = new FileOutputStream("testOut.txt"); //寫入檔案串流
            int c;
            while ((c = fileIn.read()) != -1) {
                fileOut.write(c);
            }
        } finally {
            if (fileIn != null) fileIn.close();
            if (fileOut!= null ) fileOut.close();
        }
    }
}
