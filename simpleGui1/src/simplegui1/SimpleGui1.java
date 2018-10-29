/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegui1;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Kenneth Haahr
 */

public class SimpleGui1 {
   //Variabel som definerer et vindue.
   private JFrame frame = new JFrame("Simple GUI");
   
   /** Metode der opretter en instans af SimpleGui1 */
   public SimpleGui1() {
       
       //Her definerer vi vores tekst
       JLabel label = new JLabel("          Vi programmerer Swing");
       
       //Her tilføjes teksten til vinduet
       frame.getContentPane().add(label);
       
       //Her bestemmes der hvad der sker når man lukker vinduet.
      
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       //Her startes vinduet        
       frame.setVisible(true);
   }

   //Start metode
   public static void main(String[] args) {
      SimpleGui1 simplegui = new SimpleGui1();     
   }   
}