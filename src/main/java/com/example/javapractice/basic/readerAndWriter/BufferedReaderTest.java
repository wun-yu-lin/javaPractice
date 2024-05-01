package com.example.javapractice.basic.readerAndWriter;

import java.io.*;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("testIn.txt")
                )
        )) {
            String line;
            while ((line = bufferedReader.readLine())!= null) {
                System.out.println(line);
            }
        }


    }
}
