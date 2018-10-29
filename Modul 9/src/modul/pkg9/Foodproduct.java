/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg9;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Kenneth Haahr
 */
public class Foodproduct extends Product{
    // make variables temperature and best before date.
    private final Date bBefore;
    private final int temp;
    // constructor that inherrits name and id from the superclass product
    public Foodproduct(Date bBefore, int temp, String name, int id, double price) {
        super(name, id, price);
        this.bBefore = bBefore;
        this.temp = temp;    }

    //return best before date 
    public Date getbBefore() {
        return bBefore;    }
    //return storage temperature
    public int getTemp() {
        return temp;    }
    
    @Override
    public String toString (){
        return getName()+" needs to be stored at " +temp + " degrees and its experation date is " +bBefore.toString();
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Foodproduct){
            Foodproduct fp = (Foodproduct) obj;
            return getName().equals(fp.getName())&& getId()==fp.getId();
        }
        return false;
        }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.bBefore);
        return hash;
    }
    @Override
    public boolean isExpired(){
        Date currentDate=new Date();
        return currentDate.getTime()>this.bBefore.getTime();
    }
}
