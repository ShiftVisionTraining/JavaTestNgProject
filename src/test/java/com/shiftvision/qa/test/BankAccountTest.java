package com.shiftvision.qa.test;

import com.shiftvision.qa.bank.Account;
import com.shiftvision.qa.exception.ShiftVisionException;
import org.testng.annotations.*;

import static org.testng.Assert.*;
import  org.testng.Assert;

public class BankAccountTest {

    private Account account;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass...");

    }

    //@BeforeTest
    @BeforeMethod
    public void setUp(){
        System.out.println("BeforeMethod...");
        account = new Account("12345678", "Iftekhar Ivaan");
    }

    @Test(testName="Account Deposit Test", priority =2, invocationCount = 5)
    public void test1(){
        System.out.println("test1...");
        account.deposit(100);
        double balance = account.getBalance();
        assertEquals(balance, 100);

        //Assert.assertEquals(balance, 100);
    }

    @Test(enabled=false)
    public void test2(){
        System.out.println("test2...");
        account.deposit(200);
        double balance = account.getBalance();
        assertEquals(balance, 200);
        //Assert.assertEquals(balance, 100);
    }

    @Test( description = "This will throw an exception because we can not deposit less then 0 amount", expectedExceptions= {ShiftVisionException.class}, priority = 1)
    public void test3(){
        System.out.println("test3...");
        account.deposit(-100);
    }

   // @AfterTest
    @AfterMethod
    public void tearDown(){
        System.out.println("AfterMethod...");
        account = null;
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("AfterClass...");
    }
}
