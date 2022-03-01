package bank.test.services;

import bank.test.entities.Account;
import bank.test.entities.Transaction;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class TransactionService implements ITransactionService {

    public List<Transaction> transactions;

    public TransactionService(){
        this.transactions = new ArrayList<>();
    }

    @Override
    public Transaction create(Transaction transaction) {
        Account account = getAccount(transaction);
        double currentAmount = account.getAmount();
        account.setAmount(currentAmount+transaction.getAmount());
        transactions.add(transaction);
        return transaction;
    }

    @Override
    public Transaction retrieve(Transaction transaction,double amount) {
        Account account = getAccount(transaction);
        double currentAmount = account.getAmount();
        double op = currentAmount - amount;
        if(op >= 0){
            account.setAmount(op);
        }else{
            System.out.println("Solde insuffisant");
            account.setAmount(currentAmount);
        }
        transactions.add(transaction);
        return transaction;
    }

    @Override
    public List<Transaction> getAll(Account account, Instant start, Instant end) {
        List<Transaction> transactionsExtract = new ArrayList<>();
        for(Transaction transaction : transactions){
            if(transaction.getTransactionDate().compareTo(start) >= 0 && transaction.getTransactionDate().compareTo(start) <= 0 && transaction.getAccount() == account){
                transactionsExtract.add(transaction);
            }
        }
        return transactionsExtract;
    }

    @Override
    public Account getAccount(Transaction transaction) {
        return transaction.getAccount();
    }
}
