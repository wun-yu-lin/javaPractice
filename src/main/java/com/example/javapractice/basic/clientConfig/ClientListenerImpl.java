package com.example.javapractice.basic.clientConfig;

public class ClientListenerImpl implements ClientListener{
    @Override
    public void onClientAdded(ClientEvent event) {
        System.out.println("Client added: " + event.getName() + event.getIp());
    }

    @Override
    public void onClientRemoved(ClientEvent event) {
        System.out.println("Client removed: " + event.getName() + event.getIp());
    }
}
