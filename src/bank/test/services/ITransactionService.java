package bank.test.services;

import bank.test.entities.Account;
import bank.test.entities.Transaction;

import java.time.Instant;
import java.util.List;

public interface ITransactionService {

    public Transaction create(Transaction transaction);
    public Transaction retrieve(Transaction transaction,double amount);
    public List<Transaction> getAll(Account account, Instant start, Instant end);
    public Account getAccount(Transaction transaction);
}
