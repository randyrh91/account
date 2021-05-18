/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mirea.account;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Randy Reyna Hernandez
 */
public class DepositTest {

    public DepositTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of Deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("Deposit");
        Account instance = new Account(100);
        int result = instance.Deposit(200);
        assertEquals(300, result);
    }

}
