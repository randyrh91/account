/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mirea.account;

/**
 *
 * @author Randy Reyna Hernandez
 */
public class Account {

    private int total_amount;

    public Account(int amount) {
        this.total_amount = amount;
    }

    public int Extract(int amount) {
        if (this.total_amount - amount < 0) {
            System.out.print("ERROR: Su saldo es menor que el número especificado");
            return this.total_amount;
        } else {
            this.total_amount = this.total_amount - amount;
            System.out.print("Usted a extraido "+ amount+ " pesos de su cuenta, su saldo ahora en de " + this.total_amount + "pesos");
            return this.total_amount;
        }
    }

    public int Deposit(int amount) {
        this.total_amount = this.total_amount + amount;
        System.out.print("Usted a depositado "+ amount+ " pesos de su cuenta, su saldo ahora en de " + this.total_amount + "pesos");
        return this.total_amount;
    }
    
    public int ShowAmount(){
       System.out.print("Usted tiene " + this.total_amount+ " pesos en su cuenta");
       return this.total_amount;
    }
}
