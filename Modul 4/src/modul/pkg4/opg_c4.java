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
public class opg_c4 {

    public static void main(String[] args) {
        //create array
        int [] month = {31,28,31,30,31,30,31,31,30,31,30,31};
    
        
        
        for (int i = 0; i<month.length; i++) {
            System.out.println("the month number " +(i+1)  + " has "+ month[i]+ " days" );
        }
            
    }
}
