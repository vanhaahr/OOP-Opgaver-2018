/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg6;

/**
 *
 * @author Kenneth Haahr
 */
public class Customer {

    //attributes
    public String name;
    public int id;
    public double balance;
    //Constructor
    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        this.balance = 0;    }
    //Constructor
    public Customer(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;    }
    //method deposit
    public void deposit(double amount) {
        balance += amount;    }
    //method withdraw
    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;        }
    }
    //method get balance
    public double getBalance() {
        return balance;    }

}
