/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mirea.account;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 *
 * @author Randy Reyna Hernandez
 */
public class StepDefinitions {
    Account acount;

    @Given("^I have (\\d+) rubles on my account$")
    public void i_have_rubles_on_my_account(int arg1) {
        this.acount = new Account(arg1);
    }

    @When("^I deposit (\\d+) rubles into my accoun$")
    public void i_deposit_rubles_into_my_accoun(int arg1) {
        this.acount.Deposit(arg1);
    }
    
    @When("^I extract (\\d+) rubles into my accoun$")
    public void i_extract_rubles_into_my_accoun(int arg1) {
        this.acount.Extract(arg1);
    }

    @Then("^My account has (\\d+) rubles$")
    public void my_account_has_rubles(int arg1) throws Exception {
       if(arg1 != this.acount.ShowAmount()){
           throw new Exception("Test not passed");
       }
    }
}
