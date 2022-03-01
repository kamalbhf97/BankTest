package bank.test.services;

import bank.test.entities.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements IAccountService{

    public List<Account> accounts;

    public AccountService(){
        this.accounts = new ArrayList<>();
    }

    @Override
    public Account create(Account account) {
        this.accounts.add(account);
        return account;
    }

    @Override
    public List<Account> findAccountsByClientId(Long clientId) {
        List<Account> clientAccounts = new ArrayList<>();
        for(Account account:this.accounts){
            if(account.getClient().getId() == clientId)
                clientAccounts.add(account);
        }
        return clientAccounts;
    }
}
