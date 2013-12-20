package com.thebank.accountingsystem;

public interface IAccountingSystem {

    Account getAccount(String accountNumber);

    void transfer(double amount, Account debitAccount, Account creditAccount);


}
