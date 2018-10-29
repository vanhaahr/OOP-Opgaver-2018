/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg9;

import java.util.Arrays;

/**
 *
 * @author Kenneth Haahr
 */
public class Nonfoodproduct extends Product {

    //make an array of the materials a product is made of.
    private final String[] materials;

    //constructor which inherrits (id & price) from the super-class products 
    public Nonfoodproduct(String[] materials, String name, int id, double price) {
        super(name, id, price);
        this.materials = materials;
    }

    //return what materials the nonfood product is made of 
    public String[] getMaterials() {
        return materials;
    }

    @Override
    public String toString() {
        return getName() + " are made of " + Arrays.toString(materials);
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Nonfoodproduct){
            Nonfoodproduct fp = (Nonfoodproduct) obj;
            return getName().equals(fp.getName())&& getId()==fp.getId()&& Arrays.equals(materials, fp.getMaterials());
        }
        return false;
        }
}
