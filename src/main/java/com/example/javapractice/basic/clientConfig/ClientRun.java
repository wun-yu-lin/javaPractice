package com.example.javapractice.basic.clientConfig;

public class ClientRun {
    public static void main(String[] args) {
        ClientQueue clientQueue = new ClientQueueImpl();

        clientQueue.addClientListener(new ClientListenerImpl());

        Client c1 = new Client("192.168.111.11", "nas");
        Client c2 = new Client("192.168.111.12", "pve");


        clientQueue.addClient(c1);
        clientQueue.addClient(c2);

        clientQueue.removeClient(c1);
        clientQueue.removeClient(c2);

    }
}
