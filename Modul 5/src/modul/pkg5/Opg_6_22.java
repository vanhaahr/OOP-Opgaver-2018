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
import java.util.Scanner;

public class Opg_6_22 {

    /**
     * Main Method
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter an integer
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        // Display the square root
        System.out.println(
                "The approximated square root of " + number + " is: " + sqrt(number));
    }

    /**
     * Method squrt approximates the square root of n
     */
    public static long sqrt(long n) {
        long result = 0;
        long lastGuess = n;
        long nextGuess = n;
        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (n / lastGuess)) / 2;
            //System.out.printf("lastGuess: %.5f nextGuess: %.5f%n",lastGuess, nextGuess);
        } while (Math.abs(nextGuess - lastGuess) > 0.0001);
        result = lastGuess;
        return result;
    }
}
