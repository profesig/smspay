package com.thebank.accountingsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AccountDAO {

    Set<Account> accounts = new HashSet<Account>();

    void loadFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            String accountNumber = scanner.next();
            double balance = scanner.nextDouble();
            accounts.add(new Account(accountNumber, balance));
        }
    }

    void setAccounts(Set<Account> newAccounts) {
        accounts = new HashSet<Account>(newAccounts);
    }

    public Account findAccount(String accountNumber) {
        for (Account a : accounts) {
           if(a.getAccountNumber().equals(accountNumber))
               return a;
        }
        return null;
    }
}
