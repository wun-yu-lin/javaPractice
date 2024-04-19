package com.example.javapractice.basic.stream;

import java.io.*;

public class BufferedStreamTest {

    public static void dump(InputStream src, OutputStream dest) throws IOException {
        try (BufferedInputStream input = new BufferedInputStream(src);
             BufferedOutputStream output = new BufferedOutputStream(dest)) {
            byte[] data = new byte[1024]; //as buffer
            int length = 0;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        }
    }
}
