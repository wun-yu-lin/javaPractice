package com.example.javapractice.basic.readerAndWriter;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderTest {
    public void dump(Writer w, Reader r) throws IOException {
        try(w; r){
            char[] data = new char[1024];
            int length;
            while ((length = r.read(data)) != -1){
                w.write(data, 0, length);
            }
        }
    }
}
