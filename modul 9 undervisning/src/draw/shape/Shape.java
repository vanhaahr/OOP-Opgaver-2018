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
public class Shape {
    private Color c;
    double area;
    
    //method redraw
    public void redraw()
    {
        //print that the shape cant be drawn
        System.out.println("can't draw shape.");
    }
    //method setColor
    public void setColor(Color c)
    {
        this.c=c;
    }
    
    public Color getColor()
    {
        return this.c;
    }
            @Override
        public String toString()
        {
            return c.toString()+" " +this.area;
        }
}
