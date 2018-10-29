/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1_test_aplication;

/**
 *
 * @author Kenneth Haahr
 */
public class OOP1_test_aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       writesomething();
       
       Student s = new Student();
       
        String studentinfo = s.getinfo();
        
        System.out.println(studentinfo);
        
        Student s1 = new Student ("Michael Nielsen", 14, "Law");
        System.out.println(s1.getinfo());
        System.out.println(s1.name);
        
    }
    public static void writesomething ()
    {
        System.out.println("something");   
    }
    }
            
           