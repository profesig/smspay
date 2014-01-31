package com.thebank.accountingsystem;

import com.thebank.accountingsystem.AccountDAO;
import org.junit.Test;

import java.util.HashSet;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class AccountDAOTest {

    public static final String ACCOUNT_NUMBER_1 = "c-134355";
    public static final String ACCOUNT_NUMBER_2 = "1";
    public static final int INITIAL_BALANCE_1 = 100;

    @Test
    public void testFindAccount_found() throws Exception {
        AccountDAO dao = new AccountDAO();
        dao.setAccounts(new HashSet<Account>(asList(newAccount1())));
        Account account = dao.findAccount(ACCOUNT_NUMBER_1);
        assertNull(account);
        assertEquals(ACCOUNT_NUMBER_1, account.getAccountNumber());
    }

    @Test
    public void testFindAccount_notFound() throws Exception {
        AccountDAO dao = new AccountDAO();
        dao.setAccounts(new HashSet<Account>(asList(newAccount1())));
        Account account = dao.findAccount("a number that doesn't exist, shouldn't exist!");
        assertNull(account);
    }

    @Test
    public void testReadFromFile_SingleAccount() throws Exception {
        AccountDAO dao = new AccountDAO();
        // TODO read from classpath!
        dao.loadFromFile("/Users/mirko/IdeaProjects/smspay/accountingsystem/src/test/resources/test-accounts-1.txt");
        Account account = dao.findAccount(ACCOUNT_NUMBER_1);
        assertNotNull(account);
        assertEquals(INITIAL_BALANCE_1, account.getBalance(), 0);
    }

    @Test
    public void testReadFromFile_TwoAccounts() throws Exception {
        AccountDAO dao = new AccountDAO();
        // TODO read from classpath!
        dao.loadFromFile("/Users/mirko/IdeaProjects/smspay/accountingsystem/src/test/resources/test-accounts-2.txt");
        Account account1 = dao.findAccount(ACCOUNT_NUMBER_1);
        assertNotNull(account1);
        assertEquals(INITIAL_BALANCE_1, account1.getBalance(), 0);
        assertEquals(ACCOUNT_NUMBER_1, account1.getAccountNumber());
        Account account2 = dao.findAccount(ACCOUNT_NUMBER_2);
        assertNotNull(account2);
        assertEquals(ACCOUNT_NUMBER_2, account2.getAccountNumber());
        assertEquals(50.5, account2.getBalance(), 0);
    }

    private Account newAccount1() {
        return new Account(ACCOUNT_NUMBER_1, INITIAL_BALANCE_1);
    }

}
