/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg5;

/**
 * Skriv et program, der finder alle primtal mellem 100 og 200 og som har og
 * benytter to metoder (ud over main): public static void init () public static
 * boolean isPrime(int potential)
 *
 * @author Kenneth Haahr
 */
public class Opg_d_5 {
    //main

    public static void main(String[] args) {
        System.out.println("List of primes between 100 and 200");
        for (int i : primes(100, 2000)) {
            System.out.println(i + " is a prime number");
        }
    }

    //void init
    public static int[] primes(int start, int finish) {
        int primeCount = 0;
        boolean[] testedPrimes = new boolean[finish - start];
        for (int i = start; i < finish; i++) {
            if (isPrime(i)) {
                testedPrimes[i - start] = true;
                primeCount++;
            }
        }
        int[] foundPrimes = new int[primeCount];

        for (int i = 0; i < foundPrimes.length; i++) {
            for (int j = 0; j < testedPrimes.length; j++) {
                if (testedPrimes[j] == true) {
                    testedPrimes[j] = false;
                    foundPrimes[i] = j + start;
                    break;
                }
            }
        }
        return foundPrimes;
    }

    //boolean method
    public static boolean isPrime(int value) {
        boolean result = true;
        for (int i = 2; i < Math.sqrt(value); i++) {
            if (value % i == 0) {
                result = false;
                break;

            }
        }
        return result;
    }

}
