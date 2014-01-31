package com.thebank.accountingsystem;

public class Account {

    private final String accountNumber;
    private double balance = 0;

    public Account(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    void debit(double amount) {
        balance -= amount;
    }

    void credit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (!accountNumber.equals(account.accountNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }
}
