package com.example.javapractice.basic.clientConfig;

public interface ClientListener {
    void onClientAdded(ClientEvent event);
    void onClientRemoved(ClientEvent event);
}
