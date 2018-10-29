/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsystem;

import university.Student;
/**
 *
 * @author Kenneth Haahr
 */
public class StudentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1=new Student("Sebastian Koller");
        Student s2=new Student ("Janus Hansen");
        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s2.getName());
        System.out.println(s2.getId());
    }
    
}
