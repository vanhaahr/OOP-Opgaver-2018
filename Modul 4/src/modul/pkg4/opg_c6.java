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
public class opg_c6 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 7};
        int max = numbers[0];
        int indexOfMax = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                indexOfMax = i;

            }

        }
        System.out.println("the index of the highest number " + max + " has index " + indexOfMax);
    }
}
