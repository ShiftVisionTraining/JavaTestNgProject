package com.shiftvision.qa.test;

import com.shiftvision.qa.bank.Account;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class BankAccountTest2 {

    private Account account;

    //@BeforeTest
    @BeforeMethod
    public void setUp(){
        account = new Account("12345678", "Iftekhar Ivaan");
    }

    @Test
    public void test1(){
        Assert.assertNotNull(account);
        account.deposit(100);
        account.withdraw(50);
        double balance = account.getBalance();
        Assert.assertEquals(balance, 50);

        //Assert.assertEquals(balance, 100);
    }

    @Test
    public void test2(){
        account.deposit(100);
        account.withdraw(50);
        double balance = account.getBalance();
        Assert.assertEquals(balance, 50,"Balance does not match");
        //Assert.assertEquals(balance, 100);
    }

   // @AfterTest
    @AfterMethod
    public void tearDown(){
        account = null;
    }
}
