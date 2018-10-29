/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw.shape;

import java.awt.Color;

/**
 *
 * @author Kenneth Haahr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Color color = new Color(13,255,200);
        Circle circ = new Circle(color,24.5);
        
        circ.redraw();
        
        Star star=new Star(color, 14.4);
        
        star.redraw();
        
        //begge print giver samme resultat 
        //uden tostring
        System.out.println(star);
        //med toString
        System.out.println(circ.toString());
    }
    
}
