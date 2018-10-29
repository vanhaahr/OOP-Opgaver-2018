/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.util.UUID;

/**
 *
 * @author Kenneth Haahr
 */
public class Student {
    private String name;
    //unique unit identifier = UUID (makes a random id) (UUID makes sure no one will ever get the same ID)
    private UUID id;    
    
    //constructor
    public Student(String name){
        this.name = name;
        this.id = UUID.randomUUID();    }
    
    //bruges til at returne id
    public UUID getId(){
        return id;
    }

    public String getName() {
        return name;
    }
}
