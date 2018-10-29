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

public class Opg_6_2 {
    
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner

		// Prompt the user to enter an integer
		System.out.print("Enter a integer: ");
		long number = input.nextLong();

		// Display the sum of all the digits in the integer
		System.out.println("The sum of the digits in " + number + " is " +
			sumDigits(number));
	}

	/** Compute the sum of the digits in an integer */
	public static long sumDigits(long n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
}