/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg5;

/**
 *
 * @author Kenneth Haahr
 */
public class Opg_D_2 {

    public static double area(int radius) {
        //declare area 
        double area;
        //calculate area
        area = Math.pow(radius, 2) * Math.PI;
        //print the area for radius
        System.out.println("the area af a circle with the radius of " + radius + " is " + area);
        //return the area when method "areal" is called 
        return area;
    }

    public static void main(String[] args) {
        //call method areal with radius of 3
        area(3);
        //call method areal with radius of 7
        area(7);

    }
}
