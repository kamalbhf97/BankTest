package bank.test.services;

import bank.test.entities.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientService implements IClientService{

    public List<Client> clients;

    public ClientService(){
        this.clients = new ArrayList<>();
    }

    @Override
    public Client create(Client client) {
        this.clients.add(client);
        return client;
    }

    @Override
    public Client findClientById(Long id) {
        Client client_=null;
        for(Client client:this.clients){
            if(client.getId() == id)
                client_ = client;
        }
        return client_;
    }
}
