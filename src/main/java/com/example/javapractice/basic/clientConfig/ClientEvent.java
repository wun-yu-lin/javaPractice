package com.example.javapractice.basic.clientConfig;

public class ClientEvent {
    private final Client _client;
    private final String _message;

    //constructor
    public ClientEvent(Client client, String message) {
        _client = client;
        _message = message;
    }

    public final String getName() {
        return _client.get_name();
    }
    public final String getIp() {
        return _client.get_ip();
    }
    public final String getMessage() {
        return _message;
    }

}
