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
public class Student {
    //attributes
    public String name;
    public int age;
    public String studyprogram;
    
    //constructors
    public Student()
    {
        name = "john Doe";
        age = 60;
        studyprogram = "software engineering";
                }

    public Student (String sName, int sAge, String sStudyprogram)
    {
        name = sName;
        age = sAge;
        studyprogram = sStudyprogram;
    }
    
    //methods
    public String getinfo()
    {
        return name + ", " + age + " years old, studying " +studyprogram;
    }
}
