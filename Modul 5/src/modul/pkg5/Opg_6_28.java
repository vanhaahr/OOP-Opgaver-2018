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
public class Opg_6_28 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("p         2^p - 1");

        System.out.println("-----------------------");

        for (int i = 1; i <= 31; i++) {  // Loop from 1 - 31(both inclusive)

            if (isPrimeNumber(i)) {      // Check whether or not the value is prime number.

                System.out.printf("%-9d %-5d %n", i, getMersennePrime(i));

            }

        }

    }



    /**

     * Get a prime number as a mersenne prime.

     *

     * @param prime to be converted to a mersenne prime.

     * @return the prime number converted to a mersenne prime number.

     */

    private int getMersennePrime(int prime) {

        return (int) Math.pow(2, prime) - 1;

    }



    /**

     * Determine if the value is a prime number.

     *

     * @param value is the number to be checked.

     * @return whether or not the value is a prime number.

     */

    private boolean isPrimeNumber(int value) {

        //Algorithm for determining if the value is a prime number.

        for (int i = 2; i <= Math.sqrt(value); i++) {

            if (value % i == 0) {

                return false;

            }

        }

        return true;

    }

}
        
        // TODO code application logic here
    
