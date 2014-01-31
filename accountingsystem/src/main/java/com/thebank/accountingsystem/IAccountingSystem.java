package com.thebank.accountingsystem;

public interface IAccountingSystem {

    Account findAccount(String accountNumber);

    void transfer(double amount, Account debitAccount, Account creditAccount);


}
