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

public class Opg_6_3 {
/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner

		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		// Report whether the integer is a palindrome.
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
			"a palindrome.");
	}

	/** Method isPalindrome returns true if number is a palindrome */
	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}

	/** Method reverse returns the reversal of an integer */
	public static int reverse(int number) {
		String reverse = ""; 	// Holds reversed number
		String n = number + ""; // Convert number to string
		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse); // Return reversed integer
	}
}