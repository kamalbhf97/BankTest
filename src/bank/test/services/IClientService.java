package bank.test.services;

import bank.test.entities.Client;


public interface IClientService {

    public Client create(Client client);
    public Client findClientById(Long id);
}
