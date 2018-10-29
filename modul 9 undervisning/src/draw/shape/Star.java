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
public class Star extends Shape {
        public Star (Color c, double area)
    {
        setColor(c);
        this.area = area;
    }
        @Override
        public void redraw()
        {
            System.out.println("*");
        }
        

}
