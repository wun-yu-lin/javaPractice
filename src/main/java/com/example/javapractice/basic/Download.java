package com.example.javapractice.basic;

import com.example.javapractice.basic.stream.StreamTest;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Download {
    public static InputStream openStream(String url) throws Exception {
        //java 11 新增的 httpClient API
        return HttpClient
                .newHttpClient()
                .send(
                        HttpRequest.newBuilder(URI.create(url)).build(),
                        HttpResponse.BodyHandlers.ofInputStream()
                )
                .body();
    }

    public static void main(String[] args) throws Exception {
        var src = openStream(args[0]);
        var dest = new FileOutputStream(args[1]);
        StreamTest.dump(src, dest);
    }

}
