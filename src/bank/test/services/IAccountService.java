package bank.test.services;

import bank.test.entities.Account;

import java.util.List;

public interface IAccountService {

    public Account create(Account account);
    public List<Account> findAccountsByClientId(Long clientId);
}
