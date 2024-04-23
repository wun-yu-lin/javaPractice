package com.example.javapractice.basic.readerAndWriter;

import java.io.*;

public class CharUtilDemo {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("testIn.txt");
        StringWriter sw = new StringWriter();
        dump(sw, f);
        System.out.println(sw.toString());


    }
    public static void dump(Writer w, Reader r) throws IOException {
        try(w; r){
            char[] data = new char[1024];
            int length;
            while ((length = r.read(data)) != -1){
                w.write(data, 0, length);
            }
        }
    }
}
