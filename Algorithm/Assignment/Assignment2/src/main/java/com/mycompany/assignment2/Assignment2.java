/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment2;

/**
 *
 * @author krish
 */
public class Assignment2 {

    public static void main(String[] args) {
        BankAcc account1 = new BankAcc(100000, "David Smith");
        account1.deposit(3000.50);
        account1.displayBalance();

        // Creating account2
        BankAcc account2 = new BankAcc(100001, "Emily Lee");
        account2.deposit(850);
        account2.withdraw(400.85);
        account2.displayBalance();

        // Displaying number of accounts
        System.out.println("Total Number of Accounts: " + BankAcc.getNumberOfAccounts());
    }
}

 
