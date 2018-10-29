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
public class Opg_6_8 {
/** Main Method */
	public static void main(String[] args) {
		// Display table
		System.out.println( // Display header
			"miles     kilometers     |     kilometers     miles\n" +
			"----------------------------------------------------------");
		// Display data
		for (double miles = 1.0, kilometers = 20.0; 
			  miles <= 10.0; miles++, kilometers += 5.0) {
			System.out.printf("%-12.1f", miles);
			System.out.printf("%-20.1f", milestokilometers(miles));
			System.out.printf("%-15.1f", kilometers);
			System.out.printf("%-7.2f\n\n", kilometerstomiles(kilometers));
		}
	}

	/** Convert from Celsius to Fahrenheit */
	public static double milestokilometers(double miles) {
		return (miles*1.609);
	}
	/** Convert from Fahrenheit to Celsius */
	public static double kilometerstomiles(double kilometers) {
		return (kilometers/1.609);
	}
}
