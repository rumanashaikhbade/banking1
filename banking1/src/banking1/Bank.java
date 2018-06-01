/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking1;

/**
 *
 * @author User
 */
public class Bank {
    float balance;

    Bank(float amount) {
        balance = amount;
    }

    void  deposit(float amount) {
        balance += amount;
    }

    void withdraw(float amount) {
        if (amount < 500) {
            System.out.println("Insufficient bal");
        } else {
            balance -= amount;
        }
    }

    void display() {
        System.out.println("Balance is:" + balance);
    }
}

    
    

