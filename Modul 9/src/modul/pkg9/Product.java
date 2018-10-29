/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg9;

/**
 *
 * @author Kenneth Haahr
 */
public abstract class Product implements Expireable {
    

    
//declare name, id & price and make them private.
    private String name; 
    private int id;
    private double price;
    
// no arg constructor
    protected Product() {
    }
// constructor with arguments name, id & price
    protected Product (String name, int id, double price){
    this.name = name;
    this.id = id;
    this.price = price; 
}
//if i want to acces these attributtes i need to make getters    
    protected int getId() {
        return id;}
    public String getName() {
        return name;}
    public double getPrice() {
        return price;}
     
    /**
     *
     * @return
     */
    @Override
    public boolean isExpired(){
        throw new UnsupportedOperationException("Product does not support this operation.");
    }
}
