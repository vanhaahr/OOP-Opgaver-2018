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
public class opg_c3 {

    public static void main(String[] args) {

        double[] temp = {21.5, 23.7, 19.6, 22.5, 25.3, 21.7, 18.9};

        for (int i = 0; i < temp.length-1; i++) {

            double diff = temp[i] - temp[i+1];

            System.out.println("the temperature diff between " + temp[i] + " and " + temp[i+1] + " is " + diff );
                        
        }
    }
}