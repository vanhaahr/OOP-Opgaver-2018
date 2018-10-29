/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg4;

/**
 *
 * @author Kenneth Haahr
 */
public class opg_c1 {

    public static void main(String[] args) {
        // declare radius
        int[] radius = {1, 2, 3, 4, 5};
        // declare area
        double area;
        //for loop
        for (int i = 0; i < radius.length; i++) {
            //compute area
            area = Math.pow(radius[i], 2) * Math.PI;
            // print area
            System.out.println("the area of a circle with the radius " + radius[i] + " is " + area);
            radius[i]++;
        }
    }

}
