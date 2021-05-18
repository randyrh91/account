Feature: Accound

Scenario: Withdrawing money from your account

Given I have 250 rubles on my account
When I extract 200 rubles into my accoun 
Then My account has 50 rubles