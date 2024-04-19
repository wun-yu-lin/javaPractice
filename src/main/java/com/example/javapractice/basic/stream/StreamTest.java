package com.example.javapractice.basic.stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamTest {
    public static void dump(InputStream src, OutputStream dest) throws IOException {
        try(src; dest){  //自動關閉資源
            byte[] data = new byte[1024]; // buffer for stream
            int length = 0;
            while((length = src.read(data)) != -1){
                dest.write(data, 0 , length);
            }
        }
    }
}
