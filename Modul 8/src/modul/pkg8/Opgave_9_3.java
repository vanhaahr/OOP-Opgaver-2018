/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg8;

import java.util.Date;

/**
 *
 * @author Kenneth Haahr
 */
public class Opgave_9_3 {

    public static long time() {

        // Create a new Date Object.
        Date date = new Date();
        System.out.println(date);
        // Declare a new long array and initialize it with the given values in the assignment.
        long[] elapsedTimes = {10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L};

        // Loop the long array using an enhanced for loop.
        for (long elapsedTime : elapsedTimes) {

            // Set the elapsed time of the Date Object.
            date.setTime(elapsedTime);

            // Print the elapsed time & value of the date object.
            System.out.println("When " + elapsedTime / 1000 + " seconds has passed");
            System.out.println("The date and time of the objekt is: " + date.toString());
            System.out.println(" ");
        }
        return 0;
    }
}
