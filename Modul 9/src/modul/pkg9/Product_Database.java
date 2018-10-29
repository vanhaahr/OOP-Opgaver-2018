/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg9;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kenneth Haahr
 */
public class Product_Database {

    private final ArrayList<Product> product;
    private final ArrayList<Integer> count;

    //no arg. constructor sets max products to 10
    public Product_Database() {
        product = new ArrayList<>();
        count = new ArrayList<>();
            }

    //getter product
    public ArrayList<Product> getProduct() {
        return product;
    }

    public ArrayList<Integer> getCount() {
        return count;
    }
    
    public String printInventory() {
        //Use StringBuild to create a combined string from multiple strings.
        StringBuilder sb = new StringBuilder();
        //Append adds String to the end of the combined string.
        sb.append("Lagerbeholdning:\n");

        for (Product p : product) {
            sb.append("Name: ").append(p.getName()).append("\t")
                    .append("Price: ").append(p.getPrice()).append("\t")
                    .append("Serial: ").append(p.getId()).append("\n");   
        }
        //Call toString on the StringBuilder object, to get the String representation.
        return sb.toString();
    }
    
    //check total value of storage
    public double getTotalValue() {
        double sum = 0;
        for (int i = 0; i < product.size(); i++) {
            //if theres no product on the array spot stop calculating storage
            if (product.get(i) == null) {
                break;
            }
            sum += product.get(i).getPrice() * count.get(i);
        }
        return sum;
    }
//add to storage

    public void addAmount(int id, int amount) {
        for (int i = 0; i < product.size(); i++) {
            //if theres no product on the array spot stop calculating storage
            if (product.get(i) == null) {
                break;
            }
            if (id == product.get(i).getId()) {
                count.set(i, count.get(i) + amount);
            }
        }
    }
//remove from storage

    public void removeAmount(int id, int amount) {
        for (int i = 0; i < product.size(); i++) {
            //if theres no product on the array spot stop calculating storage
            if (product.get(i) == null) {
                break;
            }
            if (id == product.get(i).getId()) {
                count.set(i, count.get(i) - amount);
            }
        }
    }

    public void addP(Product product) {
        this.product.add(product);
        this.count.add(0);
    }

    public void removeP(Product product) {

        int index = this.product.indexOf(product);
        if (index == -1) {
            return;
        }
        this.product.remove(index);
        this.count.remove(index);
    }
    public void removeExpiredFoods(){
        ArrayList<Product> foundItems= new ArrayList<>();
        this.product.forEach((products) -> {
            try {
                if(products.isExpired()){
                    foundItems.add(products);
                }
            } catch (Exception e){}
        });
        foundItems.forEach((products) -> {
            this.product.remove(products);
        });
    }
}
