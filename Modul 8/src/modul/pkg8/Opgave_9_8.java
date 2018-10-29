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
public class Opgave_9_8 {

    // Fan examples:
    public static String fanner() {
        // Creating a Fan object and assigning the values stated in the assignemt.
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Creating another Fan object and assigning the values stated in the assignemt.
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        // Already radius 5 and color blue as per default.
        // Print their toString values.
        System.out.println("Fan1 >> " + fan1.toString());
        System.out.println("Fan2 >> " + fan2.toString());

        // Implementing a random example regarding a, b, and c extras.
        Fan fan3 = new Fan(Fan.SLOW, true, 15, "Atomic Pink");
        System.out.println("Fan3 >> " + "The date is " + fan3.toString(new Date()));
        return null;

    }
}
