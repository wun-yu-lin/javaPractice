package com.example.javapractice.basic.clientConfig;

import java.util.ArrayList;
import java.util.Iterator;

public class ClientQueueImpl implements ClientQueue{
    ArrayList<Client> clients = new ArrayList<>();
    ArrayList<ClientListener> listeners = new ArrayList<>();

    @Override
    public synchronized void addClientListener(ClientListener listener) {
        listeners.add(listener);
    }

    @Override
    public synchronized void removeClientListener(ClientListener listener) {
        Iterator<ClientListener> iterator = listeners.iterator();
        while (iterator.hasNext()) {
            ClientListener next = iterator.next();
            if (next.equals(listener)) {
                iterator.remove();
            }
        }
    }

    @Override
    public synchronized void addClient(Client client) {
        clients.add(client);
        ClientEvent event = new ClientEvent(client, "Client added");
        //所有的監聽器都會收到通知
        for (int i = 0; i < listeners.size(); i++)  {
            ClientListener listener = listeners.get(i);
            listener.onClientAdded(event);
        }
    }

    @Override
    public synchronized void removeClient(Client client) {
        clients.remove(client);
        ClientEvent event = new ClientEvent(client, " removed");
        //所有的監聽器都會收到通知 client removed
        Iterator<ClientListener> iterator = listeners.iterator();
        while (iterator.hasNext()) {
            ClientListener next = iterator.next();
            next.onClientRemoved(event);
        }

    }
}
