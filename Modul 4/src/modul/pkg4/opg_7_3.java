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
public class opg_7_3 {

    public static void main(String[] args) {
        int[] array = createArray();
        // Count the occurrences of each number 
        int[] counts = countNumbers(array);
        
        System.out.println("The lowercase letters are:");
        displayArray(array);
        // Display counts 
        System.out.println();
        System.out.println("The occurrences of each number are:");
        displayCounts(counts);
    }

    public static int[] createArray() {
        // Declare an array of characters and create it 
        int[] array = new int[100];
        //generate random numbers from 1-10 in array
        for (int i = 0; i < array.length; i++) 
            array[i] = (int) (Math.random() * 10);
        
        return array;
    }
        public static void displayArray(int[] array) {
      // Display the characters in the array 20 on each line 
      for (int i = 0; i < array.length; i++) {
        if ((i + 1) % 25 == 0)
          System.out.println(array[i]);
        else 
          System.out.print(array[i] + " ");
      }
    }

    public static int[] countNumbers(int[] array) {
        // Declare and create an array of 10 int 
        int[] counts = new int[10];

        // For each lowercase letter in the array, count it 
        		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0)
				System.out.println((i + 1) + " occurs " + counts[i] +
					" time" + (counts[i] > 1 ? "s" : ""));
        }

        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(counts[i] + " " + (int) (i + '1'));
                
           } else {
               System.out.print(counts[i] + " " + (int) (i + '1') + " ");
            }counts[i]=0;
        }
    }
}
