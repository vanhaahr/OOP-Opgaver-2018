/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg9;

import java.util.Date;

/**
 *
 * @author Kenneth Haahr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product_Database storage;
        
        storage = new Product_Database();
        storage.addP(new Foodproduct(new Date(System.currentTimeMillis() - 600000000L), 5, "milk", 0, 10));
        storage.addP(new Foodproduct(new Date(System.currentTimeMillis() + 2400000000L), 5, "cheese", 1, 5));
        storage.addP(new Foodproduct(new Date(System.currentTimeMillis() + 1400000000L), 5, "eggs", 2, 8));
        storage.addP(new Nonfoodproduct(new String[]{"denim"}, "pants", 3, 250));
        storage.addP(new Nonfoodproduct(new String[]{"denim, Plastic"}, "bags", 4, 500));
        storage.addP(new Nonfoodproduct(new String[]{"leather, Rubber"}, "shoes", 5, 200));
        


        storage.addAmount(0, 100);
        storage.addAmount(1, 20);
        storage.addAmount(2, 74);
        storage.addAmount(3, 10);
        storage.addAmount(4, 10);
        storage.addAmount(5, 10);
        storage.addAmount(6, 1);

        System.out.println("the value of our storage is " + storage.getTotalValue() + " kr.\n");
        System.out.println(storage.printInventory());
        System.out.println("");
        storage.getProduct().forEach((p) -> {
        System.out.println(p.toString());});
        
        
    }
}
