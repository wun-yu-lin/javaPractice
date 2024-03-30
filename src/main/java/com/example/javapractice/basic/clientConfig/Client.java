package com.example.javapractice.basic.clientConfig;

import lombok.Data;

@Data
public class Client {

    private final String _name;
    private final String _ip;

    public Client(String name, String ip) {
        _name = name;
        _ip = ip;
    }

}
