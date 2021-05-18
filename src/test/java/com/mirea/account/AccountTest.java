/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mirea.account;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

/**
 *
 * @author Randy Reyna Hernandez
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/account.feature")

public class AccountTest {
    
}
