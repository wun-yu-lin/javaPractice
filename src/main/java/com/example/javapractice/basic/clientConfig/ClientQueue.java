package com.example.javapractice.basic.clientConfig;

import java.util.ArrayList;

public interface ClientQueue {
    ArrayList<Client> clients = new ArrayList<>();
    ArrayList<ClientListener> listeners = new ArrayList<>();

    void addClientListener(ClientListener listener);
    void removeClientListener(ClientListener listener);
    void addClient(Client client);
    void removeClient(Client client);
    


}
