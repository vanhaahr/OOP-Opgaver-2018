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
public class Modul6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaring aCustomer james bond
        Customer aCustomer = new Customer("james bond", 007, 5000);
        //Depositing $10
        aCustomer.deposit(1000);
        //Withdrawing $5
        aCustomer.withdraw(777);
        //print customer name and balance
        System.out.println("The balance of " + aCustomer.name + " is " + aCustomer.getBalance());

        
        
        //lånt
        
        
        //Declaring variables
        CustomerDatabase aCustomerDatabase = new CustomerDatabase();
        Customer aNewCustomer = new Customer("james bond", 007, 5000);
        Customer anotherNewCustomer = new Customer("jesus kristus", 1, 2018 );
        Customer onemoreNewCustomer = new Customer("bjarne riis", 2, 1996);

        //Adding a few customers
        aCustomerDatabase.createCustomer(aNewCustomer);
        aCustomerDatabase.createCustomer(anotherNewCustomer);
        aCustomerDatabase.createCustomer(onemoreNewCustomer);

        //Removing a customer
        aCustomerDatabase.removeCustomer(0);

        //Getting info about a customer
        Customer copiedCustomer = aCustomerDatabase.getCustomer(0);

        //Printing customers
        aCustomerDatabase.printCustomers();
    }

}
